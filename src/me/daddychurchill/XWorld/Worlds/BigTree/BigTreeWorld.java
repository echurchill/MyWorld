package me.daddychurchill.XWorld.Worlds.BigTree;

import me.daddychurchill.XWorld.Blocks.AbstractedChunk;
import me.daddychurchill.XWorld.Blocks.FinalizeChunk;
import me.daddychurchill.XWorld.Blocks.InitializeChunk;
import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Worlds.AbstractWorld;

public class BigTreeWorld extends AbstractWorld {

	public BigTreeWorld(CoreGenerator generator) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void renderHere(InitializeChunk chunk) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void renderHere(FinalizeChunk chunk) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getSurfaceY(AbstractedChunk chunk, int x, int z) {
		return 64;
	}
}
