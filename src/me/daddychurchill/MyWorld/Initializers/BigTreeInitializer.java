package me.daddychurchill.MyWorld.Initializers;

import me.daddychurchill.MyWorld.Blocks.AbstractedChunk;
import me.daddychurchill.MyWorld.Blocks.AbstractedSchema;
import me.daddychurchill.MyWorld.Generators.CoreGenerator;
import me.daddychurchill.MyWorld.Generators.SchemaInitializer;
import me.daddychurchill.MyWorld.Schemas.BigTreeSchema;

public class BigTreeInitializer extends SchemaInitializer {

	public BigTreeInitializer(CoreGenerator generator) {
		super(generator);
	}

	private BigTreeSchema schema;
	
	@Override
	protected AbstractedSchema getSchema(CoreGenerator generator) {
		if (schema == null)
			schema = new BigTreeSchema(generator);
		return schema;
	}

	@Override
	public boolean isHere(AbstractedChunk chunk) {
		return (chunk.getChunkX() % 10 == 0 && chunk.getChunkZ() % 10 == 0);
	}

}
