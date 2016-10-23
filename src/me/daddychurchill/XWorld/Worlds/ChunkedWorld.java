package me.daddychurchill.XWorld.Worlds;

import java.util.ArrayList;
import java.util.List;

import me.daddychurchill.XWorld.Blocks.FinalizeChunk;
import me.daddychurchill.XWorld.Blocks.InitializeChunk;
import me.daddychurchill.XWorld.Generators.AbstractInitializer;
import me.daddychurchill.XWorld.Generators.AbstractPopulator;

public abstract class ChunkedWorld extends AbstractWorld {

	protected List<AbstractInitializer> initializers;
	protected List<AbstractPopulator> populators;
	
	public ChunkedWorld() {
		
		initializers = new ArrayList<AbstractInitializer>();
		populators = new ArrayList<AbstractPopulator>();
	}

	@Override
	public void renderHere(InitializeChunk chunk) {
		for (AbstractInitializer initializer : initializers) {
			if (initializer.isHere(chunk))
				initializer.renderHere(chunk);
		}
	}

	@Override
	public void renderHere(FinalizeChunk chunk) {
		for (AbstractPopulator populator : populators) {
			if (populator.isHere(chunk))
				populator.renderHere(chunk);
		}
	}

}
