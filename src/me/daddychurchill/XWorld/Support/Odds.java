package me.daddychurchill.XWorld.Support;

import java.util.Random;

import org.bukkit.DyeColor;
import org.bukkit.TreeType;
import org.bukkit.material.MaterialData;

public class Odds {

	// see PlatMaps.xlsx for more info on this Fibonacci variant
	public final static double oddsAlwaysGoingToHappen =		 1.0;          // 100.00%
	public final static double oddsNearlyAlwaysGoingToHappen = 143.0 / 144.00; //  99.31%
	public final static double oddsTremendouslyLikely =			88.0 /  89.00; //  98.88%
	public final static double oddsExceedinglyLikely =			54.0 /  55.00; //  98.18%
	public final static double oddsEnormouslyLikely =			33.0 /  34.00; //  97.06%
	public final static double oddsExtremelyLikely =			20.0 /  21.00; //  95.24% 
	public final static double oddsPrettyLikely =				12.0 /  13.00; //  92.31%
	public final static double oddsVeryLikely =					 7.0 /   8.00; //  87.50%
	public final static double oddsLikely =						 4.0 /   5.00; //  80.00%
	public final static double oddsSomewhatLikely =				 2.0 /   3.00; //  66.67%
	public final static double oddsEven =                        1.0 /   2.00; //  50.00%
	public final static double oddsSomewhatUnlikely =			 1.0 /   3.00; //  33.33%
	public final static double oddsUnlikely =					 1.0 /   5.00; //  20.00%
	public final static double oddsVeryUnlikely =				 1.0 /   8.00; //  12.50%
	public final static double oddsPrettyUnlikely =				 1.0 /  13.00; //   7.69%
	public final static double oddsExtremelyUnlikely =			 1.0 /  21.00; //   4.76%
	public final static double oddsEnormouslyUnlikely =			 1.0 /  34.00; //   2.94%
	public final static double oddsExceedinglyUnlikely =		 1.0 /  55.00; //   1.82%
	public final static double oddsTremendouslyUnlikely =		 1.0 /  89.00; //   1.12%
	public final static double oddsNearlyNeverGoingToHappen =	 1.0 / 144.00; //   0.69%
	public final static double oddsNeverGoingToHappen =			 0.0;          //   0.00%
	
	public Odds() {
		super();
		random = new Random();
	}

	public Odds(long seed) {
		super();
		random = new Random(seed);
	}
	
	public Odds(Random random) {
		super();
		this.random = random;
	}
	
	private Random random;
	
	public Random getRandom() {
		return random;
	}
	
	public Random setRandom(Random random) {
		Random oldRandom = this.random;
		this.random = random;
		return oldRandom;
	}
	
	public boolean playOdds(double chances) {
		return random.nextDouble() < chances;
	}
	
	public boolean flipCoin() {
		return random.nextBoolean();
	}
	
	public int rollDice() {
		return rollDice(6);
	}
	
	public int rollDice(int sides) {
		assert(sides > 2);
		return random.nextInt(sides);
	}
	
	public boolean rollDiceFor(int want) {
		return rollDice() == want;
	}
	
	public boolean rollDiceFor(int sides, int want) {
		return rollDice(sides) == want;
	}
	
	public boolean nextBoolean() {
		return random.nextBoolean();
	}

	public int nextInt() {
		return random.nextInt();
	}

	public int nextInt(int bound) {
		return random.nextInt(bound);
	}

	public int nextBetween(int min, int max) {
		return random.nextInt(max - min) + min;
	}

	public int nextPast(int start, int range) {
		return random.nextInt(range) + start;
	}
	
	public double nextBetween(double min, double max) {
		return min + random.nextDouble() * (max - min);
	}
	
	public MaterialData getOneOf(MaterialData ... values) {
		return values[random.nextInt(values.length)];
	}
	
	public TreeType getOneOf(TreeType ... values) {
		return values[random.nextInt(values.length)];
	}
	
	public DyeColor getOneOf(DyeColor ... values) {
		return values[random.nextInt(values.length)];
	}
}
