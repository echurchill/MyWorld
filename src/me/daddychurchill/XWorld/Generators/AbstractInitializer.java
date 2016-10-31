package me.daddychurchill.XWorld.Generators;

import me.daddychurchill.XWorld.Blocks.InitializeChunk;
import me.daddychurchill.XWorld.Worlds.AbstractWorld;

public abstract class AbstractInitializer {

	public abstract boolean isHere(AbstractWorld world, InitializeChunk chunk);
	public abstract void renderHere(AbstractWorld world, InitializeChunk chunk);
}
