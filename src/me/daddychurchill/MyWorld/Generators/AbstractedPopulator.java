package me.daddychurchill.MyWorld.Generators;

import me.daddychurchill.MyWorld.Blocks.FinalizeChunk;

public abstract class AbstractedPopulator extends AbstractedGenerator {

	public AbstractedPopulator(CoreGenerator generator) {
		super(generator);
		
	}

	public abstract void renderHere(FinalizeChunk chunk);
}
