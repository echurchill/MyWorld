package me.daddychurchill.XWorld.Worlds;

import me.daddychurchill.XWorld.Blocks.FinalizeChunk;
import me.daddychurchill.XWorld.Blocks.InitializeChunk;

public abstract class AbstractWorld {

	public abstract void renderHere(InitializeChunk chunk);
	public abstract void renderHere(FinalizeChunk chunk);
}
