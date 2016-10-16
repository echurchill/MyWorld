package me.daddychurchill.XWorld.Worlds;

import java.util.List;

import me.daddychurchill.XWorld.Blocks.FinalizeChunk;
import me.daddychurchill.XWorld.Blocks.InitializeChunk;
import me.daddychurchill.XWorld.Generators.AbstractedInitializer;
import me.daddychurchill.XWorld.Generators.AbstractedPopulator;

public abstract class ChunkedWorld extends AbstractedWorld {

	protected List<AbstractedInitializer> initializers;
	protected List<AbstractedPopulator> populators;
	
	public ChunkedWorld() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void renderHere(InitializeChunk chunk) {
		for (AbstractedInitializer initializer : initializers) {
			if (initializer.isHere(chunk))
				initializer.renderHere(chunk);
		}
	}

	@Override
	public void renderHere(FinalizeChunk chunk) {
		for (AbstractedPopulator populator : populators) {
			if (populator.isHere(chunk))
				populator.renderHere(chunk);
		}
	}

}
