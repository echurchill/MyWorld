package me.daddychurchill.MyWorld.Support;

import java.util.Random;

import org.bukkit.Chunk;

import me.daddychurchill.MyWorld.Generator;

// should be called final blocks
public class FinalizeBlocks extends AbstractedBlocks {
	
	protected Chunk chunk;

	public FinalizeBlocks(Generator generator, Random random, Chunk chunk, int chunkX, int chunkZ) {
		super(generator, random, chunkX, chunkZ);
		
		this.chunk = chunk;
	}

}
