package me.daddychurchill.MyWorld.Blocks;

import me.daddychurchill.MyWorld.Generators.CoreGenerator;
import me.daddychurchill.MyWorld.Support.Odds;

public abstract class AbstractedSchema extends AbstractedBlocks {
	
	public AbstractedSchema(CoreGenerator generator, Odds odds) {
		super(generator, odds);
	}
	
	public abstract int getSizeX();
	public abstract int getSizeY();
	public abstract int getSizeZ();
	public abstract int getGroundY();
}
