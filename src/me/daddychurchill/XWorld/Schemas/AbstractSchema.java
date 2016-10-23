package me.daddychurchill.XWorld.Schemas;

import me.daddychurchill.XWorld.Blocks.AbstractedSchema;
import me.daddychurchill.XWorld.Blocks.FinalizeChunk;
import me.daddychurchill.XWorld.Generators.CoreGenerator;

public abstract class AbstractSchema {

	public abstract boolean isHere(FinalizeChunk chunk);
	public abstract AbstractedSchema getSchema(CoreGenerator generator);

}
