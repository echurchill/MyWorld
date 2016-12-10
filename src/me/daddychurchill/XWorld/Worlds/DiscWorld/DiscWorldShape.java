package me.daddychurchill.XWorld.Worlds.DiscWorld;

import org.bukkit.util.noise.NoiseGenerator;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Worlds.Shapes.NaturalGroundShape;

public class DiscWorldShape extends NaturalGroundShape {

	public DiscWorldShape(CoreGenerator generator, int width, int height) {
		super(generator);
		
		discThickness = 16.0;
		discBase = discThickness * 2;
		
		discRange = width;
		discInner = width / 16;
		
//		discRange2 = discRange * discRange;
//		discExtreme = discRange + discThickness;

		discHeight = height - discBase;
//		discHeight2 = discHeight * discHeight;
		discTop = discHeight + discBase;
	}
	
	private double discThickness;
	private double discBase;
	
	private double discRange;
	private double discInner;
	
//	private double discRange2;
//	private double discExtreme;

	private double discHeight;
//	private double discHeight2;
	private double discTop;
	
	@Override
	public double getSurfaceYOnWorld(double x, double z) {
		double r = Math.sqrt(x * x + z * z);
		if (r > discRange)
			return 0;
		else if (r < discInner) 
			return discTop;
		else
			return super.getSurfaceYOnWorld(x, z);
//		double absZ = Math.abs(z);
//		if (absZ > discRange) {
//			if (absZ > discExtreme)
//				return 0;
//			else
//				return discTop;
//		} else {
//			double defaultY = super.getSurfaceYOnWorld(x, z);
//			double ringZtoY = Math.min(discTop, discTop - Math.sqrt((1.0 - ((z * z) / discRange2)) * discHeight2) + getSurfaceNoiseOnWorld(x, z));
//			if (ringZtoY > defaultY)
//				return ringZtoY;
//			else
//				return defaultY;
//		}
	}
	
	protected int getDiscTop() {
		return NoiseGenerator.floor(discTop);
	}
}
