package me.daddychurchill.XWorld.Worlds;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.World;

import me.daddychurchill.XWorld.Blocks.AbstractedChunk;
import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Reusable.Shapes.AbstractedShape;

public class ShapedWorld extends ChunkedWorld {

	private AbstractedShape shape;

	protected AbstractedShape getWorldShape() {
		return shape;
	}

	public ShapedWorld(CoreGenerator generator, AbstractedShape shape) {
		this.shape = shape;
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
