package me.daddychurchill.XWorld.Worlds.RingWorld;

import org.bukkit.util.noise.NoiseGenerator;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Reusable.Shapes.NaturalGroundShape;

public class RingWorldShape extends NaturalGroundShape {

	public RingWorldShape(CoreGenerator generator, int width, int height) {
		super(generator);
		
		ringThickness = 16.0;
		ringBase = ringThickness * 2;
		
		ringRange = width;
		ringRange2 = ringRange * ringRange;
		ringExtreme = ringRange + ringThickness;

		ringHeight = height - ringBase;
		ringHeight2 = ringHeight * ringHeight;
		ringTop = ringHeight + ringBase;
	}
	
	private double ringThickness;
	private double ringBase;
	
	private double ringRange;
	private double ringRange2;
	private double ringExtreme;

	private double ringHeight;
	private double ringHeight2;
	private double ringTop;
	
	@Override
	public double getSurfaceYOnWorld(double x, double z) {
		double absZ = Math.abs(z);
		if (absZ > ringRange) {
			if (absZ > ringExtreme)
				return 0;
			else
				return ringTop;
		} else {
			double defaultY = super.getSurfaceYOnWorld(x, z);
			double ringZtoY = Math.min(ringTop, ringTop - Math.sqrt((1.0 - ((z * z) / ringRange2)) * ringHeight2) + getSurfaceNoiseOnWorld(x, z));
			if (ringZtoY > defaultY)
				return ringZtoY;
			else
				return defaultY;
		}
	}
	
	protected int getRingTop() {
		return NoiseGenerator.floor(ringTop);
	}
}
