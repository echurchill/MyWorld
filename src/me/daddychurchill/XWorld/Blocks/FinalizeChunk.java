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
		return isType(x, y - 1, z, RealMaterial.GRASS);
	}
	
	public void plantTree(int x, int y, int z, TreeType ...treeTypes) {
		plantTree(x, y, z, treeTypes[getOdds().nextInt(treeTypes.length)]);
	}

	public void plantTree(int x, int y, int z, TreeType treeType) {
		setBlock(x, y, z, RealMaterial.AIR);
		Location at = getBlockWorldLocation(x, y, z);
		
		getGenerator().getWorld().generateTree(at, treeType);
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
		Block block = bukkitChunk.getBlock(x, y, z);
		if (block != null) {
			BlockState state = block.getState();
			if (state != null) {
				MaterialData current = state.getData();
				if (current != null && !current.equals(data)) {
					state.setType(data.getItemType());
					state.setData(data);
					state.update(true, true);
				}
			}
		}
	}

	@Override
	public void setBlocks(int x1, int x2, int y1, int y2, int z1, int z2, MaterialData data) {
		for (int x = x1; x < x2; x++) {
			for (int z = z1; z < z2; z++) {
				for (int y = y1; y < y2; y++) {
					setBlock(x, y, z, data);
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
