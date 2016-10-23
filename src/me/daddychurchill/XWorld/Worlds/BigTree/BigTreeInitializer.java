package me.daddychurchill.XWorld.Worlds.BigTree;

import me.daddychurchill.XWorld.Blocks.AbstractedSchema;
import me.daddychurchill.XWorld.Blocks.FinalizeChunk;
import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Schemas.BigTreeSchema;
import me.daddychurchill.XWorld.Schemas.AbstractSchema;

public class BigTreeInitializer extends AbstractSchema {

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
