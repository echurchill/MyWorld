package me.daddychurchill.XWorld.Worlds.BigTree;

import me.daddychurchill.XWorld.Blocks.AbstractedSchema;
import me.daddychurchill.XWorld.Blocks.FinalizeChunk;
import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Generators.SchemaInitializer;
import me.daddychurchill.XWorld.Schemas.BigTreeSchema;

public class BigTreeInitializer implements SchemaInitializer {

	public BigTreeInitializer(CoreGenerator generator) {

	}

	private BigTreeSchema schema;
	
	@Override
	public AbstractedSchema getSchema(CoreGenerator generator) {
		if (schema == null)
			schema = new BigTreeSchema(generator);
		return schema;
	}

	@Override
	public boolean isHere(FinalizeChunk chunk) {
		return (chunk.getChunkX() % 10 == 0 && chunk.getChunkZ() % 10 == 0);
	}

}
