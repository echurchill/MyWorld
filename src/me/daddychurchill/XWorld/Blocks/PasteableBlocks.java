package me.daddychurchill.XWorld.Blocks;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Support.Odds;

public abstract class PasteableBlocks extends AbstractedBlocks {
	
	private Odds odds;
	
	public PasteableBlocks(CoreGenerator generator) {
		super(generator);
		
		odds = new Odds(generator.getWorldSeed());
	}
	
	@Override
	public Odds getOdds() {
		return odds;
	}
}
