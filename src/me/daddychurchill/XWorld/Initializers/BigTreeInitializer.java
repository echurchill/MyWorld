package me.daddychurchill.XWorld.Initializers;

import me.daddychurchill.XWorld.Blocks.AbstractedChunk;
import me.daddychurchill.XWorld.Blocks.AbstractedSchema;
import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Generators.SchemaInitializer;
import me.daddychurchill.XWorld.Schemas.BigTreeSchema;

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
