package me.daddychurchill.MyWorld.Blocks;

import me.daddychurchill.MyWorld.Generators.CoreGenerator;
import me.daddychurchill.MyWorld.Support.Odds;

public abstract class ProceduralSchema extends AllocatedSchema {

	public ProceduralSchema(CoreGenerator generator, Odds odds, int width, int height, int length) {
		super(generator, odds, width, height, length);
		
		
	}
	
	protected abstract void initialize();

}
