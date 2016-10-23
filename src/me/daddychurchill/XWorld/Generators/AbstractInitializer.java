package me.daddychurchill.XWorld.Generators;

import me.daddychurchill.XWorld.Blocks.InitializeChunk;

public abstract class AbstractInitializer {

	public abstract boolean isHere(InitializeChunk chunk);
	public abstract void renderHere(InitializeChunk chunk);
}
