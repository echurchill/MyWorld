package me.daddychurchill.XWorld.Generators;

import me.daddychurchill.XWorld.Blocks.FinalizeChunk;

public abstract class AbstractPopulator {

	public abstract boolean isHere(FinalizeChunk chunk);
	public abstract void renderHere(FinalizeChunk chunk);
}
