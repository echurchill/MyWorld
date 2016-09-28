package me.daddychurchill.MyWorld.Support;

import java.util.Random;

import me.daddychurchill.MyWorld.Generator;

public abstract class AbstractedBlocks {

	protected int chunkX;
	protected int chunkZ;
	protected Random random;
	
	public AbstractedBlocks(Generator generator, Random random, int chunkX, int chunkZ) {
		this.chunkX = chunkX;
		this.chunkZ = chunkZ;
		this.random = random;
	}

}
