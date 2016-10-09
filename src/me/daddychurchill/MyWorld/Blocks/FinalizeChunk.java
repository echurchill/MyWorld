package me.daddychurchill.MyWorld.Blocks;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.TreeType;
import org.bukkit.block.Biome;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.material.MaterialData;

import me.daddychurchill.MyWorld.Generators.CoreGenerator;
import me.daddychurchill.MyWorld.Support.Odds;

// should be called final blocks
public class FinalizeChunk extends AbstractedChunk {
	
	private Chunk bukkitChunk;

	public FinalizeChunk(CoreGenerator generator, Odds odds, Chunk bukkitChunk, int chunkX, int chunkZ) {
		super(generator, odds, chunkX, chunkZ);
		
		this.bukkitChunk = bukkitChunk;
	}
	
	public void generateTree(int x, int y, int z, TreeType ...treeTypes) {
		generateTree(x, y, z, treeTypes[getOdds().nextInt(treeTypes.length)]);
	}

	public void generateTree(int x, int y, int z, TreeType treeType) {
		Location at = getBlockWorldLocation(x, y, z);
		
		if (!getGenerator().getWorld().generateTree(at, treeType))
			getGenerator().getPlugin().reportMessage("Failed to create tree at " + at);
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
}
