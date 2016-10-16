package me.daddychurchill.XWorld.Generators;

import me.daddychurchill.XWorld.Blocks.InitializeChunk;

public interface AbstractedInitializer {

	public boolean isHere(InitializeChunk chunk);
	public void renderHere(InitializeChunk chunk);
}
