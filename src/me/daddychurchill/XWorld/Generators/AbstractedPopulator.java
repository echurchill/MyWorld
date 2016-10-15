package me.daddychurchill.XWorld.Generators;

import me.daddychurchill.XWorld.Blocks.FinalizeChunk;

public abstract class AbstractedPopulator extends AbstractedGenerator {

	public AbstractedPopulator(CoreGenerator generator) {
		super(generator);
		
	}

	public abstract void renderHere(FinalizeChunk chunk);
}
