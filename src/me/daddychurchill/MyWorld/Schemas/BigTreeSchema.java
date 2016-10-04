package me.daddychurchill.MyWorld.Schemas;

import me.daddychurchill.MyWorld.Config;
import me.daddychurchill.MyWorld.Blocks.AbstractedChunk;
import me.daddychurchill.MyWorld.Blocks.ProceduralSchema;
import me.daddychurchill.MyWorld.Generators.CoreGenerator;
import me.daddychurchill.MyWorld.Support.Odds;

public class BigTreeSchema extends ProceduralSchema {

	public BigTreeSchema(CoreGenerator generator, Odds odds) {
		super(generator, odds, 100, AbstractedChunk.Height, 100);
		
	}

	@Override
	public int getGroundY() {
		return Config.defaultStreetLevel;
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

}
