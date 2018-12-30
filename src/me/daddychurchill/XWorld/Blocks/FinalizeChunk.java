package me.daddychurchill.XWorld.Blocks;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.TreeType;
import org.bukkit.block.Biome;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.block.data.BlockData;
import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Support.Odds;

// should be called final blocks
public class FinalizeChunk extends AbstractedChunk {

	private Chunk bukkitChunk;

	public FinalizeChunk(CoreGenerator generator, Odds odds, Chunk bukkitChunk, int chunkX, int chunkZ) {
		super(generator, odds, chunkX, chunkZ);

		this.bukkitChunk = bukkitChunk;
	}

	public boolean isFertile(int x, int y, int z) {
		return isTypes(x, y - 1, z, Material.GRASS, Material.DIRT);
	}

	public void plantTree(int x, int y, int z, TreeType treeType) {
		if (y > 0)
			rawPlantTree(x, y, z, treeType);
	}

	private boolean isNotRootBall(Material material) {
		switch (material) {
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
		case MYCELIUM:
		case END_STONE:
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
				rootBlocks.setBlock(x1, y1, z1, Material.DIRT);
				while (y1 > 0) {
					y1--;
					if (isNotRootBall(rootBlocks.getBlock(x1, y1, z1)))
						rootBlocks.setBlock(x1, y1, z1, Material.DIRT);
					else
						break;
				}
			}

		// make the tree
		Location at = getBlockWorldLocation(x, y, z);
		boolean success = false;
		try {
			success = getGenerator().getWorld().generateTree(at, treeType);
			if (!success) {

				// if not, try a few more times
				int initY = y;
				for (int i = 0; i < 8; i++) {

					// maybe it just isn't clear enough above, move up and try again
					y++;
					rootBlocks.setBlocks(x, x + width, y - 1, z, z + width, Material.DIRT);
					at = getBlockWorldLocation(x, y, z);
					try {
						success = getGenerator().getWorld().generateTree(at, treeType);

						// if we made the tree after all, copy it's trunk block down to fill up all of
						// that added dirt
						if (success) {
							rootBlocks.setBlocks(x, x + width, initY, y, z, z + width, getBlock(x, y, z));
							break;
						}

					} catch (Exception e) {
//						this.getGenerator().reportMessage(treeType.name() + " at : " + at.getBlockX() + ", " + at.getBlockY() + ", " + at.getBlockZ());
//						this.getGenerator().reportMessage("INNER EXCEPTION: " + e.getMessage());
						success = false;
						rootBlocks.restoreBlocks();
						return;
					}
				}
			}
		} catch (Exception e) {
//			this.getGenerator().reportMessage(treeType.name() + " at : " + at.getBlockX() + ", " + at.getBlockY() + ", " + at.getBlockZ());
//			this.getGenerator().reportMessage("OUTER EXCEPTION: " + e.getMessage());
			success = false;
		}

		// no tree... no root ball
		if (!success)
			rootBlocks.restoreBlocks();
	}

	@Override
	public Material getBlock(int x, int y, int z) {
		Block block = bukkitChunk.getBlock(x, y, z);
		if (block != null) {
			return block.getType();
		}
		return null;
	}

	private int physicsLevel = 0;
	private boolean physicsDo = false;

	public void startDoingPhysics() {
		physicsLevel++;
		physicsDo = physicsLevel > 0;
	}

	public void stopDoingPhysics() {
		assert (physicsLevel > 0);
		physicsLevel--;
		physicsDo = physicsLevel > 0;
	}

	@Override
	public void setBlock(int x, int y, int z, Material data) {
		setBlock(x, y, z, data, physicsDo);
	}

	public void setBlock(int x, int y, int z, Material data, boolean applyPhysics) {
		Block block = bukkitChunk.getBlock(x, y, z);
		if (block != null && block.getType() != data) {
			block.setType(data, applyPhysics);
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

	public void setSign(int x, int y, int z, BlockFace direction, String... text) {
		Block block = bukkitChunk.getBlock(x, y, z);
		block.setType(Material.SIGN);
		if (block.getType() == Material.SIGN) {
			BlockData signDirection = block.getBlockData();
			if (signDirection instanceof org.bukkit.block.data.type.Sign) {
				org.bukkit.block.data.type.Sign sign = (org.bukkit.block.data.type.Sign) signDirection;
				sign.setRotation(direction);

				BlockState state = block.getState();
				if (state instanceof org.bukkit.block.Sign) {
					org.bukkit.block.Sign signState = (org.bukkit.block.Sign) state;
					for (int i = 0; i < text.length && i < 4; i++)
						signState.setLine(i, text[i]);
					signState.update();
				}
			}
		}
	}
}
