package me.daddychurchill.XWorld.Generators;

import me.daddychurchill.XWorld.Blocks.FinalizeChunk;

public interface AbstractedPopulator {

	public boolean isHere(FinalizeChunk chunk);
	public abstract void renderHere(FinalizeChunk chunk);
}
