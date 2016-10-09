package me.daddychurchill.MyWorld.Blocks;

import me.daddychurchill.MyWorld.Generators.CoreGenerator;
import me.daddychurchill.MyWorld.Support.Odds;

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
