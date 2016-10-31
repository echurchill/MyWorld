package me.daddychurchill.XWorld.Worlds.SimpleNature;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.World;

import me.daddychurchill.XWorld.Blocks.AbstractedChunk;
import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Worlds.ChunkedWorld;
import me.daddychurchill.XWorld.Worlds.Standard.GrassPopulator;
import me.daddychurchill.XWorld.Worlds.Standard.SingleTreePopulator;

public class SimpleNatureWorld extends ChunkedWorld {
	
	private SimpleNatureShape shape;
	
	public SimpleNatureWorld(CoreGenerator generator) {
		shape = new SimpleNatureShape(generator);
		
		initializers.add(new SimpleNaturalInitializer(shape));
		
		populators.add(new GrassPopulator());
		populators.add(new SingleTreePopulator());
	}

	@Override
	public int getSurfaceY(AbstractedChunk chunk, int x, int z) {
		return shape.getSurfaceY(chunk, x, z);
	}
	
	@Override
	public Location fixSpawnLocation(World world, Random random, Location location) {
		double x = location.getX();
		double z = location.getZ();
		return new Location(world, x, shape.getSurfaceYOnWorld(x, z), z);
	}
}
