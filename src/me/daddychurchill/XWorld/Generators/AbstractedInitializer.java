package me.daddychurchill.XWorld.Generators;

import me.daddychurchill.XWorld.Blocks.InitializeChunk;

public abstract class AbstractedInitializer extends AbstractedGenerator {

	public AbstractedInitializer(CoreGenerator generator) {
		super(generator);
	}

	public abstract void renderHere(InitializeChunk chunk);
}
