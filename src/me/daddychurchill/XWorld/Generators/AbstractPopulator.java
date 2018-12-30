package me.daddychurchill.XWorld.Generators;

import me.daddychurchill.XWorld.Blocks.FinalizeChunk;
import me.daddychurchill.XWorld.Worlds.AbstractWorld;

public abstract class AbstractPopulator {

	public abstract boolean isHere(AbstractWorld world, FinalizeChunk chunk);

	public abstract void renderHere(AbstractWorld world, FinalizeChunk chunk);
}
