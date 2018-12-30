package me.daddychurchill.XWorld.Blocks;

import org.bukkit.generator.ChunkGenerator.BiomeGrid;
import org.bukkit.generator.ChunkGenerator.ChunkData;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Support.Odds;

public class PasteingInitializeChunk extends InitializeChunk {

//	private static class SchemaAt {
////		public PasteableBlocks schema;
////		public int x;
////		public int z;
//		
//		public SchemaAt(PasteableBlocks schema, int x, int z) {
////			this.schema = schema;
////			this.x = x;
////			this.z = z;
//		}
//		
////		public boolean contains(InitializeChunk chunk) {
////			
////			
////			
////			return x >= x1 & x + schema.getSizeX() < x2 & 
////				   z >= z1 & z + schema.getSizeZ() < z2;
////		}
////
////		public boolean intersects(InitializeChunk chunk) {
////			return x >= x1 & x < x2 &
////				   z >= z1 & z < z2; 
////		}
//	}
//	
//	private ArrayList<SchemaAt> schemas;

	public PasteingInitializeChunk(CoreGenerator generator, ChunkData bukkitChunkData, BiomeGrid bukkitBiomeData,
			Odds odds, int chunkX, int chunkZ) {
		super(generator, bukkitChunkData, bukkitBiomeData, odds, chunkX, chunkZ);

//		schemas = new ArrayList<SchemaAt>(0);
	}

	protected void addSchema(PasteableBlocks schema, int x, int z) {
//		schemas.add(new SchemaAt(schema, x, z));
	}

}
