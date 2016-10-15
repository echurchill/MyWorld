package me.daddychurchill.XWorld.Blocks;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Support.Odds;

public abstract class AbstractedSchema extends AbstractedBlocks {
	
	private Odds odds;
	
	public AbstractedSchema(CoreGenerator generator) {
		super(generator);
		
		odds = new Odds();
	}
	
	@Override
	public Odds getOdds() {
		return odds;
	}
	
}
