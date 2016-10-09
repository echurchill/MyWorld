package me.daddychurchill.MyWorld.Generators;

import me.daddychurchill.MyWorld.Blocks.AbstractedSchema;
import me.daddychurchill.MyWorld.Blocks.InitializeChunk;

public abstract class SchemaInitializer extends AbstractedInitializer {

	public SchemaInitializer(CoreGenerator generator) {
		super(generator);
	}

	@Override
	public void renderHere(InitializeChunk chunk) {
		// TODO Auto-generated method stub

	}
	
	protected abstract AbstractedSchema getSchema(CoreGenerator generator);

}
