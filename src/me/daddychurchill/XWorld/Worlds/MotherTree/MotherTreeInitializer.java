package me.daddychurchill.XWorld.Worlds.MotherTree;

import org.bukkit.generator.ChunkGenerator.BiomeGrid;
import org.bukkit.generator.ChunkGenerator.ChunkData;

import me.daddychurchill.XWorld.Blocks.PasteingInitializeChunk;
import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Support.Odds;

public class MotherTreeInitializer extends PasteingInitializeChunk {

	public MotherTreeInitializer(CoreGenerator generator, ChunkData bukkitChunkData, BiomeGrid bukkitBiomeData,
			Odds odds, int chunkX, int chunkZ) {
		super(generator, bukkitChunkData, bukkitBiomeData, odds, chunkX, chunkZ);

		addSchema(new MotherTreeSchema(generator), 0, 0);
	}

//	@Override
//	public AbstractedSchema getSchema(CoreGenerator generator) {
//		if (schema == null)
//			schema = new BigTreeSchema(generator);
//		return schema;
//	}
//
//	@Override
//	public boolean isHere(FinalizeChunk chunk) {
//		return (chunk.getChunkX() % 10 == 0 && chunk.getChunkZ() % 10 == 0);
//	}

}
