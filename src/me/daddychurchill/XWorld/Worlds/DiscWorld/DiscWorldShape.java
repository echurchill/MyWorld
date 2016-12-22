package me.daddychurchill.XWorld.Worlds.DiscWorld;

import org.bukkit.util.noise.NoiseGenerator;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Worlds.Shapes.NaturalGroundShape;

public class DiscWorldShape extends NaturalGroundShape {

	public DiscWorldShape(CoreGenerator generator, int outerWidth, int outerHeight, int innerWidth, int innerHeight) {
		super(generator);
		
//		discThickness = 16.0;
//		discBase = discThickness * 2;
		
		discRange = outerWidth;
		discInner = innerWidth;
		
		discRange2 = discRange * discRange;

		discHeight = innerHeight;
//		discHeight = innerHeight - discBase;
		discHeight2 = discHeight * discHeight;
//		discTop = discHeight + discBase;
		discTop = discHeight;// + 16;
	}
	
//	private double discThickness;
//	private double discBase;
	
	private double discRange;
	private double discInner;
	
	private double discRange2;

	private double discHeight;
	private double discHeight2;
	private double discTop;
	
	private static double rangeScale = 5;
	
	@Override
	public double getSurfaceYOnWorld(double x, double z) {
		double r = Math.sqrt(x * x + z * z);
		if (r > discRange)
			return 0;
		else if (r < discInner) 
			return discTop + getSurfaceNoiseOnWorld(x, z);
		else {
			double defaultY = super.getSurfaceYOnWorld(x, z);
			double flipR = discRange - (r - discInner);
			double radiusFactor = ((flipR * flipR) / discRange2);
			double heightScale = 1.0 - radiusFactor;
			double noiseScale = rangeScale * radiusFactor;
			double radiusToY = Math.min(discTop,  
					discTop - Math.sqrt(discHeight2 * heightScale) + getSurfaceNoiseOnWorld(x, z) * noiseScale);
			if (radiusToY > defaultY)
				return Math.min(radiusToY, discHeight);
			else
				return defaultY;
		}
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
	
	public int getDiscTop() {
		return NoiseGenerator.floor(discTop);
	}
	
	public int getDiscVoidValue() {
		return -1;
	}
}
