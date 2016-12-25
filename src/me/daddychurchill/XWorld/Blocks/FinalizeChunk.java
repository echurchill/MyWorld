package me.daddychurchill.XWorld.Blocks;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.TreeType;
import org.bukkit.block.Biome;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.material.MaterialData;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Support.Odds;
import me.daddychurchill.XWorld.Things.RealMaterial;

// should be called final blocks
public class FinalizeChunk extends AbstractedChunk {
	
	private Chunk bukkitChunk;

	public FinalizeChunk(CoreGenerator generator, Odds odds, Chunk bukkitChunk, int chunkX, int chunkZ) {
		super(generator, odds, chunkX, chunkZ);
		
		this.bukkitChunk = bukkitChunk;
	}
	
	public boolean isFertile(int x, int y, int z) {
		return isTypes(x, y - 1, z, RealMaterial.GRASS, RealMaterial.DIRT);
	}
	
	public void plantTree(int x, int y, int z, TreeType treeType) {
		if (y > 0)
			rawPlantTree(x, y, z, treeType);
	}
	
	private boolean isNotRootBall(MaterialData material) {
		switch (material.getItemType()) {
		case STONE:
		case DIRT:
		case BEDROCK:
		case SAND:
		case SANDSTONE:
		case RED_SANDSTONE:
		case NETHERRACK:
		case GRAVEL:
		case COBBLESTONE:
		case MOSSY_COBBLESTONE:
		case CLAY:
		case MYCEL:
		case ENDER_STONE:
			return false;
		default:
			return true;
		}
	}
	
	private void rawPlantTree(int x, int y, int z, TreeType treeType) {

		// how big will it be?
		int width;
		switch (treeType) {
		case DARK_OAK:
		case MEGA_REDWOOD:
		case JUNGLE:
			width = 2;
			break;
		default:
			width = 1;
			break;
		}
		
		// how to remember
		RestorableBlocks rootBlocks = new RestorableBlocks(this);
		
		// make the root ball
		rootBlocks.emptyBlocks(x, x + width, y, y + width, z, z + width);
		for (int x1 = x; x1 < x + width; x1++)
			for (int z1 = z; z1 < z + width; z1++) {
				int y1 = y - 1;
				rootBlocks.setBlock(x1, y1, z1, RealMaterial.DIRT);
				while (y1 > 0) {
					y1--;
					if (isNotRootBall(rootBlocks.getBlock(x1, y1, z1)))
						rootBlocks.setBlock(x1, y1, z1, RealMaterial.DIRT);
					else
						break;
				}
			}
		
		// make the tree
		Location at = getBlockWorldLocation(x, y, z);
		boolean success = getGenerator().getWorld().generateTree(at, treeType);
		
		// if not, try one more time!
		if (!success) {
			int initY = y;
			for (int i = 0; i < 10; i++) {
				y++;
				rootBlocks.setBlocks(x, x + width, y - 1, z, z + width, RealMaterial.DIRT);
				at = getBlockWorldLocation(x, y, z);
				success = getGenerator().getWorld().generateTree(at, treeType);
				if (success) {
					rootBlocks.setBlocks(x, x + width, initY, y, z, z + width, getBlock(x, y, z));
					break;
				}
			}
		}
		
		// no tree... no root ball
		if (!success)
			rootBlocks.restoreBlocks();
	}

	@Override
	public MaterialData getBlock(int x, int y, int z) {
		Block block = bukkitChunk.getBlock(x, y, z);
		if (block != null) {
			BlockState state = block.getState();
			if (state != null) {
				return state.getData();
			}
		}
		return null;
	}

	@Override
	public void setBlock(int x, int y, int z, MaterialData data) {
		setBlock(x, y, z, data, false);
	}

	public void setBlock(int x, int y, int z, MaterialData data, boolean applyPhysics) {
		Block block = bukkitChunk.getBlock(x, y, z);
		if (block != null) {
			BlockState state = block.getState();
			if (state != null) {
				MaterialData current = state.getData();
				if (current != null && !current.equals(data)) {
					state.setType(data.getItemType());
					state.setData(data);
//					state.update();
					state.update(true, applyPhysics);
				}
			}
		}
	}

	@Override
	public boolean isEmpty(int x, int y, int z) {
		Block block = bukkitChunk.getBlock(x, y, z);
		if (block != null) {
			return block.isEmpty();
		}
		return true;
	}
	
	@Override
	public Biome getBiome(int x, int z) {
		Block block = bukkitChunk.getBlock(x, 0, z);
		if (block != null) {
			return block.getBiome();
		} 
		return null;
	}

	@Override
	public void setBiome(int x, int z, Biome biome) {
		Block block = bukkitChunk.getBlock(x, 0, z);
		if (block != null) {
			block.setBiome(biome);
		}
	}
	
	public void setSign(int x, int y, int z, BlockFace direction, String ... text) {
		Block block = bukkitChunk.getBlock(x, y, z);
		block.setType(Material.SIGN_POST);
		if (block.getType() == Material.SIGN_POST) {
			org.bukkit.block.Sign signState = (org.bukkit.block.Sign) block.getState();
			org.bukkit.material.Sign signDirection = new org.bukkit.material.Sign();

			signDirection.setFacingDirection(direction);
			signState.setData(signDirection);
			
			for (int i = 0; i < text.length && i < 4; i++) 
				signState.setLine(i, text[i]);

			signState.update();
		}
	}
}
