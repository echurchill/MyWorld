package me.daddychurchill.MyWorld.Generators;

import me.daddychurchill.MyWorld.Blocks.AbstractedChunk;

public abstract class AbstractedGenerator {

//TODO Let's see if we can get away with not having this potential circular reference
//	private CoreGenerator generator;
	
	public AbstractedGenerator(CoreGenerator generator) {
//		this.generator = generator;
	}
	
//	protected CoreGenerator getGenerator() {
//		return generator;
//	}

	public abstract boolean isHere(AbstractedChunk chunk);
}
