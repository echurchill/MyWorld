package me.daddychurchill.MyWorld.Generators;

import me.daddychurchill.MyWorld.Blocks.InitializeChunk;

public abstract class AbstractedInitializer extends AbstractedGenerator {

	public AbstractedInitializer(CoreGenerator generator) {
		super(generator);
	}

	public abstract void renderHere(InitializeChunk chunk);
}
