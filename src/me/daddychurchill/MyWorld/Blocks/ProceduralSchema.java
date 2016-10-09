package me.daddychurchill.MyWorld.Blocks;

import me.daddychurchill.MyWorld.Generators.CoreGenerator;

public abstract class ProceduralSchema extends AllocatedSchema {

	public ProceduralSchema(CoreGenerator generator, int width, int height, int length) {
		super(generator, width, height, length);
		
		initialize();
	}
	
	protected abstract void initialize();

}
