package me.daddychurchill.XWorld.Generators;

import me.daddychurchill.XWorld.Blocks.AbstractedSchema;
import me.daddychurchill.XWorld.Blocks.InitializeChunk;

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
