package me.daddychurchill.XWorld.Generators;

import me.daddychurchill.XWorld.Blocks.AbstractedSchema;
import me.daddychurchill.XWorld.Blocks.FinalizeChunk;

public interface SchemaInitializer {

	public boolean isHere(FinalizeChunk chunk);
	public AbstractedSchema getSchema(CoreGenerator generator);

}
