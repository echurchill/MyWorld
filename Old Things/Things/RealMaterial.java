package me.daddychurchill.XWorld.Things;

import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.TreeSpecies;
import org.bukkit.material.MaterialData;
import org.bukkit.util.noise.NoiseGenerator;

public final class RealMaterial extends AbstractThings {

	// streaming
	// given the name find the MaterialData
	// given the MaterialData find the matching name
	
	// THESE REALLY SHOULD FOLLOW A BETTER NAMING SCHEME
	// <Material>[_<MaterialModifier>[[<FormModifier>_]_<Form>]]
	
	public final static MaterialData AIR = define(Material.AIR);

	public final static MaterialData STONE = define(Material.STONE);
	public final static MaterialData GRANITE = define(Material.STONE, 1);
	public final static MaterialData GRANITE_POLISHED = define(Material.STONE, 2);
	public final static MaterialData DIORITE = define(Material.STONE, 3);
	public final static MaterialData DIORIDE_POLISHED = define(Material.STONE, 4);
	public final static MaterialData ANDESITE = define(Material.STONE, 5);
	public final static MaterialData ANDESIDE_POLISHED = define(Material.STONE, 6);

	public final static MaterialData GRASS = define(Material.GRASS);

	public final static MaterialData DIRT = define(Material.DIRT);
	public final static MaterialData DIRT_COARSE = define(Material.DIRT, 1);
	public final static MaterialData PODZOL = define(Material.DIRT, 2);

	public final static MaterialData COBBLESTONE = define(Material.COBBLESTONE);

	public final static MaterialData WOOD_OAK = define(Material.WOOD, TreeSpecies.GENERIC);
	public final static MaterialData WOOD_REDWOOD = define(Material.WOOD, TreeSpecies.REDWOOD);
	public final static MaterialData WOOD_BIRCH = define(Material.WOOD, TreeSpecies.BIRCH);
	public final static MaterialData WOOD_JUNGLE = define(Material.WOOD, TreeSpecies.JUNGLE);
	public final static MaterialData WOOD_ACACIA = define(Material.WOOD, TreeSpecies.ACACIA);
	public final static MaterialData WOOD_DARK_OAK = define(Material.WOOD, TreeSpecies.DARK_OAK);

	public final static MaterialData SAPLING_OAK = define(Material.SAPLING, TreeSpecies.GENERIC);
	public final static MaterialData SAPLING_REDWOOD = define(Material.SAPLING, TreeSpecies.REDWOOD);
	public final static MaterialData SAPLING_BIRCH = define(Material.SAPLING, TreeSpecies.BIRCH);
	public final static MaterialData SAPLING_JUNGLE = define(Material.SAPLING, TreeSpecies.JUNGLE);
	public final static MaterialData SAPLING_ACACIA = define(Material.SAPLING, TreeSpecies.ACACIA);
	public final static MaterialData SAPLING_DARK_OAK = define(Material.SAPLING, TreeSpecies.DARK_OAK);

	public final static MaterialData BEDROCK = define(Material.BEDROCK);

	public final static MaterialData WATER_FLOWING = define(Material.WATER, 0); //TODO: wrong name; data variant
	public final static MaterialData WATER_STATIONARY = define(Material.WATER, 0); //TODO: wrong name; data variant
	public final static MaterialData LAVA_FLOWING = define(Material.LAVA, 0); //TODO: wrong name; data variant
	public final static MaterialData LAVA_STATIONARY = define(Material.LAVA, 0); //TODO: wrong name; data variant

	public final static MaterialData SAND = define(Material.SAND);
	public final static MaterialData SAND_RED = define(Material.SAND, 1);

	public final static MaterialData GRAVEL = define(Material.GRAVEL);

	public final static MaterialData GOLD_ORE = define(Material.GOLD_ORE);
	public final static MaterialData IRON_ORE = define(Material.IRON_ORE);
	public final static MaterialData COAL_ORE = define(Material.COAL_ORE);

	public final static MaterialData LOG_OAK = define(Material.LOG, TreeSpecies.GENERIC);
	public final static MaterialData LOG_REDWOOD = define(Material.LOG, TreeSpecies.REDWOOD);
	public final static MaterialData LOG_BIRCH = define(Material.LOG, TreeSpecies.BIRCH);
	public final static MaterialData LOG_JUNGLE = define(Material.LOG, TreeSpecies.JUNGLE);
	public final static MaterialData LOG_ACACIA = define(Material.LOG, TreeSpecies.ACACIA);
	public final static MaterialData LOG_DARK_OAK = define(Material.LOG, TreeSpecies.DARK_OAK);

	public final static MaterialData LEAVES_OAK = define(Material.LEAVES, TreeSpecies.GENERIC);
	public final static MaterialData LEAVES_REDWOOD = define(Material.LEAVES, TreeSpecies.REDWOOD);
	public final static MaterialData LEAVES_BIRCH = define(Material.LEAVES, TreeSpecies.BIRCH);
	public final static MaterialData LEAVES_JUNGLE = define(Material.LEAVES, TreeSpecies.JUNGLE);
	public final static MaterialData LEAVES_ACACIA = define(Material.LEAVES, TreeSpecies.ACACIA);
	public final static MaterialData LEAVES_DARK_OAK = define(Material.LEAVES, TreeSpecies.DARK_OAK);

	private final static int NoDecay = 4;
	public final static MaterialData LEAVES_OAK_NODECAY = define(Material.LEAVES, TreeSpecies.GENERIC, NoDecay);
	public final static MaterialData LEAVES_REDWOOD_NODECAY = define(Material.LEAVES, TreeSpecies.REDWOOD, NoDecay);
	public final static MaterialData LEAVES_BIRCH_NODECAY = define(Material.LEAVES, TreeSpecies.BIRCH, NoDecay);
	public final static MaterialData LEAVES_JUNGLE_NODECAY = define(Material.LEAVES, TreeSpecies.JUNGLE, NoDecay);
	public final static MaterialData LEAVES_ACACIA_NODECAY = define(Material.LEAVES, TreeSpecies.ACACIA, NoDecay);
	public final static MaterialData LEAVES_DARK_OAK_NODECAY = define(Material.LEAVES, TreeSpecies.DARK_OAK, NoDecay);

	public final static MaterialData SPONGE_DRY = define(Material.SPONGE, 1);
	public final static MaterialData SPONGE_WET = define(Material.SPONGE, 1);

	public final static MaterialData GLASS = define(Material.GLASS);
	public final static MaterialData LAPIS_ORE = define(Material.LAPIS_ORE);
	public final static MaterialData LAPIS_BLOCK = define(Material.LAPIS_BLOCK);

	public final static MaterialData DISPENSER = define(Material.DISPENSER, 0); //TODO: data variant

	public final static MaterialData SANDSTONE = define(Material.SANDSTONE);
	public final static MaterialData SANDSTONE_CHISELED = define(Material.RED_SANDSTONE, 1);
	public final static MaterialData SANDSTONE_SMOOTH = define(Material.RED_SANDSTONE, 2);

	public final static MaterialData NOTE_BLOCK = define(Material.NOTE_BLOCK); //TODO: wrong name

	public final static MaterialData BED = define(Material.BED, 0); //TODO: data variant
	public final static MaterialData POWERED_RAIL = define(Material.POWERED_RAIL, 0); //TODO: data variant
	public final static MaterialData DETECTOR_RAIL = define(Material.DETECTOR_RAIL, 0); //TODO: data variant
	public final static MaterialData STICKY_PISTON_BASE = define(Material.PISTON_STICKY_BASE, 0); //TODO: data variant

	public final static MaterialData WEB = define(Material.WEB);

	public final static MaterialData SHRUB = define(Material.TALL_GRASS, 0);
	public final static MaterialData TALL_GRASS = define(Material.TALL_GRASS, 1);
	public final static MaterialData FERN = define(Material.TALL_GRASS, 2);

	public final static MaterialData DEAD_BUSH = define(Material.DEAD_BUSH);

	public final static MaterialData PISTON_BASE = define(Material.PISTON_BASE, 0); //TODO: wrong name; data variant
	public final static MaterialData PISTON_EXTENSION = define(Material.PISTON_EXTENSION, 0); //TODO: wrong name; data variant

	public final static MaterialData WOOL = define(Material.WOOL);
	public final static MaterialData WOOL_WHITE = define(Material.WOOL, DyeColor.WHITE);
	public final static MaterialData WOOL_ORANGE = define(Material.WOOL, DyeColor.ORANGE);
	public final static MaterialData WOOL_MAGENTA = define(Material.WOOL, DyeColor.MAGENTA);
	public final static MaterialData WOOL_LIGHT_BLUE = define(Material.WOOL, DyeColor.LIGHT_BLUE);
	public final static MaterialData WOOL_YELLOW = define(Material.WOOL, DyeColor.YELLOW);
	public final static MaterialData WOOL_LIME = define(Material.WOOL, DyeColor.LIME);
	public final static MaterialData WOOL_PINK = define(Material.WOOL, DyeColor.PINK);
	public final static MaterialData WOOL_GRAY = define(Material.WOOL, DyeColor.GRAY);
	public final static MaterialData WOOL_SILVER = define(Material.WOOL, DyeColor.LIGHT_GRAY);
	public final static MaterialData WOOL_CYAN = define(Material.WOOL, DyeColor.CYAN);
	public final static MaterialData WOOL_PURPLE = define(Material.WOOL, DyeColor.PURPLE);
	public final static MaterialData WOOL_BLUE = define(Material.WOOL, DyeColor.BLUE);
	public final static MaterialData WOOL_BROWN = define(Material.WOOL, DyeColor.BROWN);
	public final static MaterialData WOOL_GREEN = define(Material.WOOL, DyeColor.GREEN);
	public final static MaterialData WOOL_RED = define(Material.WOOL, DyeColor.RED);
	public final static MaterialData WOOL_BLACK = define(Material.WOOL, DyeColor.BLACK);

	public final static MaterialData PISTON_MOVING_PIECE = define(Material.PISTON_MOVING_PIECE, 0); //TODO: wrong name; data variant
	
	public final static MaterialData FLOWER_DANDELION = define(Material.DANDELION);
	public final static MaterialData FLOWER_POPPY = define(Material.POPPY, 0);
	public final static MaterialData FLOWER_BLUE_ORCHID = define(Material.POPPY, 1);
	public final static MaterialData FLOWER_ALLIUM = define(Material.POPPY, 2);
	public final static MaterialData FLOWER_AZURE_BLUET = define(Material.POPPY, 3);
	public final static MaterialData FLOWER_RED_TULIP = define(Material.POPPY, 4);
	public final static MaterialData FLOWER_ORANGE_TULIP = define(Material.POPPY, 5);
	public final static MaterialData FLOWER_WHITE_TULIP = define(Material.POPPY, 6);
	public final static MaterialData FLOWER_PINK_TULIP = define(Material.POPPY, 7);
	public final static MaterialData FLOWER_OXEYE_DAISY = define(Material.POPPY, 8);
	
	public final static MaterialData MUSHROOM_BROWN = define(Material.BROWN_MUSHROOM);
	public final static MaterialData MUSHROOM_RED = define(Material.RED_MUSHROOM);
	public final static MaterialData GOLD_BLOCK = define(Material.GOLD_BLOCK);
	public final static MaterialData IRON_BLOCK = define(Material.IRON_BLOCK);
	
	public final static MaterialData STONE_DOUBLE_SLAB = define(Material.DOUBLE_STEP, 0);
	public final static MaterialData SANDSTONE_DOUBLE_SLAB = define(Material.DOUBLE_STEP, 1);
	public final static MaterialData STONEWOOD_DOUBLE_SLAB = define(Material.DOUBLE_STEP, 2);
	public final static MaterialData COBBLESTONE_DOUBLE_SLAB = define(Material.DOUBLE_STEP, 3);
	public final static MaterialData BRICK_DOUBLE_SLAB = define(Material.DOUBLE_STEP, 4);
	public final static MaterialData STONE_BRICKS_DOUBLE_SLAB = define(Material.DOUBLE_STEP, 5);
	public final static MaterialData NETHER_BRICK_DOUBLE_SLAB = define(Material.DOUBLE_STEP, 6);
	public final static MaterialData QUARTZ_DOUBLE_SLAB = define(Material.DOUBLE_STEP, 7);
	public final static MaterialData SANDSTONE_RED_DOUBLE_SLAB = define(Material.DOUBLE_STONE_SLAB2, 0);
	
	public final static MaterialData STONE_SLAB = define(Material.STEP, 0);
	public final static MaterialData SANDSTONE_SLAB = define(Material.STEP, 1);
	public final static MaterialData STONEWOOD_SLAB = define(Material.STEP, 2);
	public final static MaterialData COBBLESTONE_SLAB = define(Material.STEP, 3);
	public final static MaterialData BRICK_SLAB = define(Material.STEP, 4);
	public final static MaterialData STONE_BRICKS_SLAB = define(Material.STEP, 5);
	public final static MaterialData NETHER_BRICK_SLAB = define(Material.STEP, 6);
	public final static MaterialData QUARTZ_SLAB = define(Material.STEP, 7);
	public final static MaterialData SANDSTONE_RED_SLAB = define(Material.STONE_SLAB2, 0);
	public final static MaterialData STONE_UPPER_SLAB = define(Material.STEP, 0 + 8);
	public final static MaterialData SANDSTONE_UPPER_SLAB = define(Material.STEP, 1 + 8);
	public final static MaterialData STONEWOOD_UPPER_SLAB = define(Material.STEP, 2 + 8);
	public final static MaterialData COBBLESTONE_UPPER_SLAB = define(Material.STEP, 3 + 8);
	public final static MaterialData BRICK_UPPER_SLAB = define(Material.STEP, 4 + 8);
	public final static MaterialData STONE_BRICKS_UPPER_SLAB = define(Material.STEP, 5 + 8);
	public final static MaterialData NETHER_BRICK_UPPER_SLAB = define(Material.STEP, 6 + 8);
	public final static MaterialData QUARTZ_UPPER_SLAB = define(Material.STEP, 7 + 8);
	public final static MaterialData SANDSTONE_RED_UPPER_SLAB = define(Material.STONE_SLAB2, 0 + 8);

	public final static MaterialData BRICK = define(Material.BRICK); //TODO: wrong name
	public final static MaterialData TNT = define(Material.TNT);
	public final static MaterialData BOOKSHELF = define(Material.BOOKSHELF);

	public final static MaterialData MOSSY_COBBLESTONE = define(Material.MOSSY_COBBLESTONE, 0); //TODO: wrong name; data variant
	public final static MaterialData OBSIDIAN = define(Material.OBSIDIAN);
	public final static MaterialData TORCH = define(Material.TORCH, 0); //TODO: data variant
	public final static MaterialData FIRE = define(Material.FIRE, 0); //TODO: data variant
	public final static MaterialData MOB_SPAWNER = define(Material.MOB_SPAWNER, 0); //TODO: data variant
	public final static MaterialData WOOD_STAIRS = define(Material.WOOD_STAIRS, 0); //TODO: wrong name; data variant
	public final static MaterialData CHEST = define(Material.CHEST, 0); //TODO: data variant
	public final static MaterialData REDSTONE_WIRE = define(Material.REDSTONE_WIRE, 0); //TODO: data variant
	
	public final static MaterialData DIAMOND_ORE = define(Material.DIAMOND_ORE);
	public final static MaterialData DIAMOND_BLOCK = define(Material.DIAMOND_BLOCK);
	public final static MaterialData WORKBENCH = define(Material.WORKBENCH); //TODO: wrong name
	public final static MaterialData CROPS = define(Material.CROPS, 0); //TODO: wrong name; data variant
	public final static MaterialData SOIL = define(Material.SOIL, 0); //TODO: wrong name; data variant
	public final static MaterialData FURNACE = define(Material.FURNACE, 0); //TODO: data variant
	public final static MaterialData BURNING_FURNACE = define(Material.BURNING_FURNACE, 0); //TODO: wrong name; data variant
	public final static MaterialData SIGN_POST = define(Material.SIGN_POST, 0); //TODO: wrong name; data variant
	public final static MaterialData WOODEN_DOOR = define(Material.OAK_DOOR, 0); //TODO: data variant
	public final static MaterialData LADDER = define(Material.LADDER, 0); //TODO: data variant
	public final static MaterialData RAILS = define(Material.RAILS, 0); //TODO: wrong name; data variant
	public final static MaterialData COBBLESTONE_STAIRS = define(Material.COBBLESTONE_STAIRS, 0); //TODO: wrong name; data variant
	public final static MaterialData WALL_SIGN = define(Material.WALL_SIGN, 0); //TODO: data variant
	public final static MaterialData LEVER = define(Material.LEVER, 0); //TODO: data variant
	public final static MaterialData STONE_PLATE = define(Material.STONE_PLATE, 0); //TODO: wrong name; data variant
	public final static MaterialData IRON_DOOR_BLOCK = define(Material.IRON_DOOR_BLOCK, 0); //TODO: wrong name; data variant
	public final static MaterialData WOODEN_PLATE = define(Material.WOOD_PLATE, 0); //TODO: wrong name; data variant
	public final static MaterialData REDSTONE_ORE = define(Material.REDSTONE_ORE);
	public final static MaterialData GLOWING_REDSTONE_ORE = define(Material.GLOWING_REDSTONE_ORE); //TODO: wrong name
	public final static MaterialData REDSTONE_TORCH_OFF = define(Material.REDSTONE_TORCH_OFF, 0); //TODO: wrong name; data variant
	public final static MaterialData REDSTONE_TORCH_ON = define(Material.REDSTONE_TORCH_ON, 0); //TODO: wrong name; data variant
	public final static MaterialData STONE_BUTTON = define(Material.STONE_BUTTON, 0); //TODO: wrong name; data variant
	public final static MaterialData SNOW = define(Material.SNOW, 0); //TODO: wrong name; data variant
	public final static MaterialData ICE = define(Material.ICE);
	public final static MaterialData SNOW_BLOCK = define(Material.SNOW_BLOCK); //TODO: wrong name
	public final static MaterialData CACTUS = define(Material.CACTUS, 0); //TODO: data variant
	public final static MaterialData CLAY = define(Material.CLAY);
	public final static MaterialData SUGAR_CANE_BLOCK = define(Material.SUGAR_CANE_BLOCK, 0); //TODO: wrong name; data variant
	public final static MaterialData JUKEBOX = define(Material.JUKEBOX, 0); //TODO: data variant

	//TODO: it turns out Fences wood type is controlled via MetaData?
	public final static MaterialData FENCE = define(Material.SPRUCE_FENCE);
//	public final static MaterialData FENCE_OAK = define(Material.SPRUCE_FENCE, TreeSpecies.GENERIC);
//	public final static MaterialData FENCE_REDWOOD = define(Material.SPRUCE_FENCE, TreeSpecies.REDWOOD);
//	public final static MaterialData FENCE_BIRCH = define(Material.SPRUCE_FENCE, TreeSpecies.BIRCH);
//	public final static MaterialData FENCE_JUNGLE = define(Material.SPRUCE_FENCE, TreeSpecies.JUNGLE);
//	public final static MaterialData FENCE_ACACIA = define(Material.SPRUCE_FENCE, TreeSpecies.ACACIA);
//	public final static MaterialData FENCE_DARK_OAK = define(Material.SPRUCE_FENCE, TreeSpecies.DARK_OAK);

	public final static MaterialData PUMPKIN = define(Material.PUMPKIN, 0); //TODO: data variant
	public final static MaterialData NETHERRACK = define(Material.NETHERRACK);
	public final static MaterialData SOUL_SAND = define(Material.SOUL_SAND, 0); //TODO: data variant
	public final static MaterialData GLOWSTONE = define(Material.GLOWSTONE);
	public final static MaterialData PORTAL = define(Material.PORTAL);
	public final static MaterialData JACK_O_LATERN = define(Material.JACK_O_LANTERN, 0); //TODO: wrong name; data variant
	public final static MaterialData CAKE_BLOCK = define(Material.CAKE_BLOCK, 0); //TODO: wrong name; data variant
	public final static MaterialData DIODE_BLOCK_OFF = define(Material.DIODE_BLOCK_OFF, 0); //TODO: wrong name; data variant
	public final static MaterialData DIODE_BLOCK_ON = define(Material.DIODE_BLOCK_ON, 0); //TODO: wrong name; data variant
	
	public final static MaterialData STAINED_GLASS = define(Material.STAINED_GLASS);
	public final static MaterialData STAINED_GLASS_WHITE = define(Material.STAINED_GLASS, DyeColor.WHITE);
	public final static MaterialData STAINED_GLASS_ORANGE = define(Material.STAINED_GLASS, DyeColor.ORANGE);
	public final static MaterialData STAINED_GLASS_MAGENTA = define(Material.STAINED_GLASS, DyeColor.MAGENTA);
	public final static MaterialData STAINED_GLASS_LIGHT_BLUE = define(Material.STAINED_GLASS, DyeColor.LIGHT_BLUE);
	public final static MaterialData STAINED_GLASS_YELLOW = define(Material.STAINED_GLASS, DyeColor.YELLOW);
	public final static MaterialData STAINED_GLASS_LIME = define(Material.STAINED_GLASS, DyeColor.LIME);
	public final static MaterialData STAINED_GLASS_PINK = define(Material.STAINED_GLASS, DyeColor.PINK);
	public final static MaterialData STAINED_GLASS_GRAY = define(Material.STAINED_GLASS, DyeColor.GRAY);
	public final static MaterialData STAINED_GLASS_SILVER = define(Material.STAINED_GLASS, DyeColor.LIGHT_GRAY);
	public final static MaterialData STAINED_GLASS_CYAN = define(Material.STAINED_GLASS, DyeColor.CYAN);
	public final static MaterialData STAINED_GLASS_PURPLE = define(Material.STAINED_GLASS, DyeColor.PURPLE);
	public final static MaterialData STAINED_GLASS_BLUE = define(Material.STAINED_GLASS, DyeColor.BLUE);
	public final static MaterialData STAINED_GLASS_BROWN = define(Material.STAINED_GLASS, DyeColor.BROWN);
	public final static MaterialData STAINED_GLASS_GREEN = define(Material.STAINED_GLASS, DyeColor.GREEN);
	public final static MaterialData STAINED_GLASS_RED = define(Material.STAINED_GLASS, DyeColor.RED);
	public final static MaterialData STAINED_GLASS_BLACK = define(Material.STAINED_GLASS, DyeColor.BLACK);
	
	public final static MaterialData TRAP_DOOR = define(Material.TRAP_DOOR, 0); //TODO: wrong name; data variant
	public final static MaterialData MONSTER_EGGS = define(Material.MONSTER_EGGS, 0); //TODO: wrong name; data variant

	public final static MaterialData STONE_BRICKS = define(Material.STONE_BRICKS);
	public final static MaterialData STONE_BRICKS_MOSSY = define(Material.STONE_BRICKS, 1);
	public final static MaterialData STONE_BRICKS_CRACKED = define(Material.STONE_BRICKS, 2);
	public final static MaterialData STONE_BRICKS_CHISELED = define(Material.STONE_BRICKS, 3);

	public final static MaterialData HUGE_MUSHROOM_1 = define(Material.HUGE_MUSHROOM_1, 0); //TODO: wrong name; data variant
	public final static MaterialData HUGE_MUSHROOM_2 = define(Material.HUGE_MUSHROOM_2, 0); //TODO: wrong name; data variant
	public final static MaterialData IRON_FENCE = define(Material.IRON_BARS); //TODO: wrong name
	public final static MaterialData GLASS_PANE = define(Material.GLASS_PANE); //TODO: wrong name
	public final static MaterialData MELON_BLOCK = define(Material.MELON_BLOCK);
	public final static MaterialData PUMPKIN_STEM = define(Material.PUMPKIN_STEM, 0); //TODO: data variant
	public final static MaterialData MELON_STEM = define(Material.MELON_STEM, 0); //TODO: data variant
	public final static MaterialData VINE = define(Material.VINE, 0); //TODO: data variant
	public final static MaterialData FENCE_GATE = define(Material.SPRUCE_FENCE_GATE, 0); //TODO: data variant
	public final static MaterialData BRICK_STAIRS = define(Material.BRICK_STAIRS, 0); //TODO: data variant
	public final static MaterialData SMOOTH_STAIRS = define(Material.SMOOTH_STAIRS, 0); //TODO: wrong name; data variant
	public final static MaterialData MYCELIUM = define(Material.MYCELIUM); //TODO: wrong name
	public final static MaterialData WATER_LILY = define(Material.WATER_LILY); //TODO: wrong name
	public final static MaterialData NETHER_BRICK = define(Material.NETHER_BRICK);
	public final static MaterialData NETHER_FENCE = define(Material.NETHER_FENCE); //TODO: wrong name
	public final static MaterialData NETHER_BRICK_STAIRS = define(Material.NETHER_BRICK_STAIRS, 0); //TODO: data variant
	public final static MaterialData NETHER_WARTS = define(Material.NETHER_WARTS, 0); //TODO: wrong name; data variant
	public final static MaterialData ENCHANTMENT_TABLE = define(Material.ENCHANTMENT_TABLE); //TODO: wrong name
	public final static MaterialData BREWING_STAND = define(Material.BREWING_STAND, 0); //TODO: data variant
	public final static MaterialData CAULDRON = define(Material.CAULDRON, 0); //TODO: data variant
	public final static MaterialData ENDER_PORTAL = define(Material.ENDER_PORTAL); //TODO: wrong name
	public final static MaterialData ENDER_PORTAL_FRAME = define(Material.ENDER_PORTAL_FRAME, 0); //TODO: wrong name; data variant
	public final static MaterialData END_STONE = define(Material.END_STONE, 0); //TODO: wrong name; data variant
	public final static MaterialData DRAGON_EGG = define(Material.DRAGON_EGG);
	public final static MaterialData REDSTONE_LAMP_OFF = define(Material.REDSTONE_LAMP_OFF); //TODO: wrong name
	public final static MaterialData REDSTONE_LAMP_ON = define(Material.REDSTONE_LAMP_ON); //TODO: wrong name

	public final static MaterialData WOOD_OAK_DOUBLE_SLAB = define(Material.WOOD_DOUBLE_STEP, TreeSpecies.GENERIC);
	public final static MaterialData WOOD_REDWOOD_DOUBLE_SLAB = define(Material.WOOD_DOUBLE_STEP, TreeSpecies.REDWOOD);
	public final static MaterialData WOOD_BIRCH_DOUBLE_SLAB = define(Material.WOOD_DOUBLE_STEP, TreeSpecies.BIRCH);
	public final static MaterialData WOOD_JUNGLE_DOUBLE_SLAB = define(Material.WOOD_DOUBLE_STEP, TreeSpecies.JUNGLE);
	public final static MaterialData WOOD_ACACIA_DOUBLE_SLAB = define(Material.WOOD_DOUBLE_STEP, TreeSpecies.ACACIA);
	public final static MaterialData WOOD_DARK_OAK_DOUBLE_SLAB = define(Material.WOOD_DOUBLE_STEP, TreeSpecies.DARK_OAK);

	public final static MaterialData WOOD_OAK_SLAB = define(Material.WOOD_STEP, TreeSpecies.GENERIC);
	public final static MaterialData WOOD_REDWOOD_SLAB = define(Material.WOOD_STEP, TreeSpecies.REDWOOD);
	public final static MaterialData WOOD_BIRCH_SLAB = define(Material.WOOD_STEP, TreeSpecies.BIRCH);
	public final static MaterialData WOOD_JUNGLE_SLAB = define(Material.WOOD_STEP, TreeSpecies.JUNGLE);
	public final static MaterialData WOOD_ACACIA_SLAB = define(Material.WOOD_STEP, TreeSpecies.ACACIA);
	public final static MaterialData WOOD_DARK_OAK_SLAB = define(Material.WOOD_STEP, TreeSpecies.DARK_OAK);

	public final static MaterialData COCOA = define(Material.COCOA, 0); //TODO: wrong name; data variant
	public final static MaterialData SANDSTONE_STAIRS = define(Material.SANDSTONE_STAIRS, 0); //TODO: data variant
	public final static MaterialData EMERALD_ORE = define(Material.EMERALD_ORE);
	public final static MaterialData ENDER_CHEST = define(Material.ENDER_CHEST, 0); //TODO: data variant
	public final static MaterialData TRIPWIRE_HOOK = define(Material.TRIPWIRE_HOOK, 0); //TODO: data variant
	public final static MaterialData TRIPWIRE = define(Material.TRIPWIRE, 0); //TODO: data variant
	public final static MaterialData EMERALD_BLOCK = define(Material.EMERALD_BLOCK);
	public final static MaterialData SPRUCE_WOOD_STAIRS = define(Material.SPRUCE_WOOD_STAIRS, 0); //TODO: wrong name; data variant
	public final static MaterialData BIRCH_WOOD_STAIRS = define(Material.BIRCH_WOOD_STAIRS, 0); //TODO: wrong name; data variant
	public final static MaterialData JUNGLE_WOOD_STAIRS = define(Material.JUNGLE_WOOD_STAIRS, 0); //TODO: wrong name; data variant
	public final static MaterialData COMMAND = define(Material.COMMAND); //TODO: wrong name
	public final static MaterialData BEACON = define(Material.BEACON);

	public final static MaterialData COBBLE_WALL = define(Material.COBBLE_WALL);
	public final static MaterialData COBBLE_WALL_MOSSY = define(Material.COBBLE_WALL, 1);

	public final static MaterialData FLOWER_POT = define(Material.FLOWER_POT, 0); //TODO: data variant
	public final static MaterialData CARROT = define(Material.CARROT, 0); //TODO: wrong name; data variant
	public final static MaterialData POTATO = define(Material.POTATO, 0); //TODO: wrong name; data variant
	public final static MaterialData WOOD_BUTTON = define(Material.WOOD_BUTTON, 0); //TODO: wrong name; data variant
	public final static MaterialData SKULL = define(Material.SKULL, 0); //TODO: data variant
	public final static MaterialData ANVIL = define(Material.ANVIL, 0); //TODO: data variant
	public final static MaterialData TRAPPED_CHEST = define(Material.TRAPPED_CHEST, 0); //TODO: data variant
	public final static MaterialData GOLD_PLATE = define(Material.GOLD_PLATE, 0); //TODO: wrong name; data variant
	public final static MaterialData IRON_PLATE = define(Material.IRON_PLATE, 0); //TODO: wrong name; data variant
	public final static MaterialData REDSTONE_COMPARATOR_OFF = define(Material.REDSTONE_COMPARATOR_OFF, 0); //TODO: wrong name; data variant
	public final static MaterialData REDSTONE_COMPARATOR_ON = define(Material.REDSTONE_COMPARATOR_OFF, 0); //TODO: wrong name; data variant
	public final static MaterialData DAYLIGHT_DETECTOR = define(Material.DAYLIGHT_DETECTOR, 0); //TODO: data variant
	public final static MaterialData REDSTONE_BLOCK = define(Material.REDSTONE_BLOCK);
	public final static MaterialData QUARTZ_ORE = define(Material.QUARTZ_ORE);
	public final static MaterialData HOPPER = define(Material.HOPPER, 0); //TODO: data variant

	public final static MaterialData QUARTZ_BLOCK = define(Material.QUARTZ_BLOCK);
	public final static MaterialData QUARTZ_CHISELED = define(Material.QUARTZ_BLOCK, 1);
	public final static MaterialData QUARTZ_PILLAR = define(Material.QUARTZ_BLOCK, 2);
	public final static MaterialData QUARTZ_PILLAR_NS = define(Material.QUARTZ_BLOCK, 3);
	public final static MaterialData QUARTZ_PILLAR_EW = define(Material.QUARTZ_BLOCK, 4);

	public final static MaterialData QUARTZ_STAIRS = define(Material.QUARTZ_STAIRS, 0); //TODO: data variant
	public final static MaterialData ACTIVATOR_RAIL = define(Material.ACTIVATOR_RAIL, 0); //TODO: data variant
	public final static MaterialData DROPPER = define(Material.DROPPER, 0); //TODO: data variant

	public final static MaterialData STAINED_CLAY = define(Material.STAINED_CLAY); //TODO: wrong name
	public final static MaterialData STAINED_CLAY_WHITE = define(Material.STAINED_CLAY, DyeColor.WHITE); //TODO: wrong name
	public final static MaterialData STAINED_CLAY_ORANGE = define(Material.STAINED_CLAY, DyeColor.ORANGE); //TODO: wrong name
	public final static MaterialData STAINED_CLAY_MAGENTA = define(Material.STAINED_CLAY, DyeColor.MAGENTA); //TODO: wrong name
	public final static MaterialData STAINED_CLAY_LIGHT_BLUE = define(Material.STAINED_CLAY, DyeColor.LIGHT_BLUE); //TODO: wrong name
	public final static MaterialData STAINED_CLAY_YELLOW = define(Material.STAINED_CLAY, DyeColor.YELLOW); //TODO: wrong name
	public final static MaterialData STAINED_CLAY_LIME = define(Material.STAINED_CLAY, DyeColor.LIME); //TODO: wrong name
	public final static MaterialData STAINED_CLAY_PINK = define(Material.STAINED_CLAY, DyeColor.PINK); //TODO: wrong name
	public final static MaterialData STAINED_CLAY_GRAY = define(Material.STAINED_CLAY, DyeColor.GRAY); //TODO: wrong name
	public final static MaterialData STAINED_CLAY_SILVER = define(Material.STAINED_CLAY, DyeColor.LIGHT_GRAY); //TODO: wrong name
	public final static MaterialData STAINED_CLAY_CYAN = define(Material.STAINED_CLAY, DyeColor.CYAN); //TODO: wrong name
	public final static MaterialData STAINED_CLAY_PURPLE = define(Material.STAINED_CLAY, DyeColor.PURPLE); //TODO: wrong name
	public final static MaterialData STAINED_CLAY_BLUE = define(Material.STAINED_CLAY, DyeColor.BLUE); //TODO: wrong name
	public final static MaterialData STAINED_CLAY_BROWN = define(Material.STAINED_CLAY, DyeColor.BROWN); //TODO: wrong name
	public final static MaterialData STAINED_CLAY_GREEN = define(Material.STAINED_CLAY, DyeColor.GREEN); //TODO: wrong name
	public final static MaterialData STAINED_CLAY_RED = define(Material.STAINED_CLAY, DyeColor.RED); //TODO: wrong name
	public final static MaterialData STAINED_CLAY_BLACK = define(Material.STAINED_CLAY, DyeColor.BLACK); //TODO: wrong name

	public final static MaterialData STAINED_GLASS_PANE = define(Material.STAINED_GLASS_PANE);
	public final static MaterialData STAINED_GLASS_PANE_WHITE = define(Material.STAINED_GLASS_PANE, DyeColor.WHITE);
	public final static MaterialData STAINED_GLASS_PANE_ORANGE = define(Material.STAINED_GLASS_PANE, DyeColor.ORANGE);
	public final static MaterialData STAINED_GLASS_PANE_MAGENTA = define(Material.STAINED_GLASS_PANE, DyeColor.MAGENTA);
	public final static MaterialData STAINED_GLASS_PANE_LIGHT_BLUE = define(Material.STAINED_GLASS_PANE, DyeColor.LIGHT_BLUE);
	public final static MaterialData STAINED_GLASS_PANE_YELLOW = define(Material.STAINED_GLASS_PANE, DyeColor.YELLOW);
	public final static MaterialData STAINED_GLASS_PANE_LIME = define(Material.STAINED_GLASS_PANE, DyeColor.LIME);
	public final static MaterialData STAINED_GLASS_PANE_PINK = define(Material.STAINED_GLASS_PANE, DyeColor.PINK);
	public final static MaterialData STAINED_GLASS_PANE_GRAY = define(Material.STAINED_GLASS_PANE, DyeColor.GRAY);
	public final static MaterialData STAINED_GLASS_PANE_SILVER = define(Material.STAINED_GLASS_PANE, DyeColor.LIGHT_GRAY);
	public final static MaterialData STAINED_GLASS_PANE_CYAN = define(Material.STAINED_GLASS_PANE, DyeColor.CYAN);
	public final static MaterialData STAINED_GLASS_PANE_PURPLE = define(Material.STAINED_GLASS_PANE, DyeColor.PURPLE);
	public final static MaterialData STAINED_GLASS_PANE_BLUE = define(Material.STAINED_GLASS_PANE, DyeColor.BLUE);
	public final static MaterialData STAINED_GLASS_PANE_BROWN = define(Material.STAINED_GLASS_PANE, DyeColor.BROWN);
	public final static MaterialData STAINED_GLASS_PANE_GREEN = define(Material.STAINED_GLASS_PANE, DyeColor.GREEN);
	public final static MaterialData STAINED_GLASS_PANE_RED = define(Material.STAINED_GLASS_PANE, DyeColor.RED);
	public final static MaterialData STAINED_GLASS_PANE_BLACK = define(Material.STAINED_GLASS_PANE, DyeColor.BLACK);
	
	public final static MaterialData ACACIA_STAIRS = define(Material.ACACIA_STAIRS, 0); //TODO: data variant
	public final static MaterialData DARK_OAK_STAIRS = define(Material.DARK_OAK_STAIRS, 0); //TODO: data variant
	public final static MaterialData SLIME_BLOCK = define(Material.SLIME_BLOCK); //TODO: wrong name
	public final static MaterialData BARRIER = define(Material.BARRIER);
	public final static MaterialData IRON_TRAPDOOR = define(Material.IRON_TRAPDOOR, 0); //TODO: data variant

	public final static MaterialData PRISMARINE = define(Material.PRISMARINE);
	public final static MaterialData PRISMARINE_BRICKS = define(Material.PRISMARINE, 1);
	public final static MaterialData PRISMARINE_DARK = define(Material.PRISMARINE, 2);

	public final static MaterialData SEA_LANTERN = define(Material.SEA_LANTERN);
	public final static MaterialData HAY_BLOCK = define(Material.HAY_BLOCK, 0); //TODO: data variant

	public final static MaterialData CARPET = define(Material.CARPET);
	public final static MaterialData CARPET_WHITE = define(Material.CARPET, DyeColor.WHITE);
	public final static MaterialData CARPET_ORANGE = define(Material.CARPET, DyeColor.ORANGE);
	public final static MaterialData CARPET_MAGENTA = define(Material.CARPET, DyeColor.MAGENTA);
	public final static MaterialData CARPET_LIGHT_BLUE = define(Material.CARPET, DyeColor.LIGHT_BLUE);
	public final static MaterialData CARPET_YELLOW = define(Material.CARPET, DyeColor.YELLOW);
	public final static MaterialData CARPET_LIME = define(Material.CARPET, DyeColor.LIME);
	public final static MaterialData CARPET_PINK = define(Material.CARPET, DyeColor.PINK);
	public final static MaterialData CARPET_GRAY = define(Material.CARPET, DyeColor.GRAY);
	public final static MaterialData CARPET_SILVER = define(Material.CARPET, DyeColor.LIGHT_GRAY);
	public final static MaterialData CARPET_CYAN = define(Material.CARPET, DyeColor.CYAN);
	public final static MaterialData CARPET_PURPLE = define(Material.CARPET, DyeColor.PURPLE);
	public final static MaterialData CARPET_BLUE = define(Material.CARPET, DyeColor.BLUE);
	public final static MaterialData CARPET_BROWN = define(Material.CARPET, DyeColor.BROWN);
	public final static MaterialData CARPET_GREEN = define(Material.CARPET, DyeColor.GREEN);
	public final static MaterialData CARPET_RED = define(Material.CARPET, DyeColor.RED);
	public final static MaterialData CARPET_BLACK = define(Material.CARPET, DyeColor.BLACK);

	public final static MaterialData HARD_CLAY = define(Material.HARD_CLAY); //TODO: wrong name
	public final static MaterialData COAL_BLOCK = define(Material.COAL_BLOCK);
	public final static MaterialData PACKED_ICE = define(Material.PACKED_ICE);
	public final static MaterialData DOUBLE_PLANT = define(Material.DOUBLE_PLANT, 0); //TODO: data variant
	public final static MaterialData STANDING_BANNER = define(Material.STANDING_BANNER, 0); //TODO: data variant
	public final static MaterialData WALL_BANNER = define(Material.WALL_BANNER, 0); //TODO: data variant
	public final static MaterialData DAYLIGHT_DETECTOR_INVERTED = define(Material.DAYLIGHT_DETECTOR_INVERTED, 0); //TODO: data variant
	
	public final static MaterialData RED_SANDSTONE = define(Material.RED_SANDSTONE);
	public final static MaterialData RED_SANDSTONE_CHISELED = define(Material.RED_SANDSTONE, 1);
	public final static MaterialData RED_SANDSTONE_SMOOTH = define(Material.RED_SANDSTONE, 2);

	public final static MaterialData RED_SANDSTONE_STAIRS = define(Material.RED_SANDSTONE_STAIRS, 0); //TODO: data variant
	public final static MaterialData DOUBLE_STONE_SLAB2 = define(Material.DOUBLE_STONE_SLAB2, 0); //TODO: data variant
	public final static MaterialData STONE_SLAB2 = define(Material.STONE_SLAB2, 0); //TODO: data variant
	public final static MaterialData SPRUCE_FENCE_GATE = define(Material.SPRUCE_FENCE_GATE);
	public final static MaterialData BIRCH_FENCE_GATE = define(Material.BIRCH_FENCE_GATE);
	public final static MaterialData JUNGLE_FENCE_GATE = define(Material.JUNGLE_FENCE_GATE);
	public final static MaterialData DARK_OAK_FENCE_GATE = define(Material.DARK_OAK_FENCE_GATE);
	public final static MaterialData ACACIA_FENCE_GATE = define(Material.ACACIA_FENCE_GATE);
	public final static MaterialData SPRUCE_FENCE = define(Material.SPRUCE_FENCE);
	public final static MaterialData BIRCH_FENCE = define(Material.BIRCH_FENCE);
	public final static MaterialData JUNGLE_FENCE = define(Material.JUNGLE_FENCE);
	public final static MaterialData DARK_OAK_FENCE = define(Material.DARK_OAK_FENCE);
	public final static MaterialData ACACIA_FENCE = define(Material.ACACIA_FENCE);
	public final static MaterialData SPRUCE_DOOR = define(Material.SPRUCE_DOOR, 0); //TODO: data variant
	public final static MaterialData BIRCH_DOOR = define(Material.BIRCH_DOOR, 0); //TODO: data variant
	public final static MaterialData JUNGLE_DOOR = define(Material.JUNGLE_DOOR, 0); //TODO: data variant
	public final static MaterialData ACACIA_DOOR = define(Material.ACACIA_DOOR, 0); //TODO: data variant
	public final static MaterialData DARK_OAK_DOOR = define(Material.DARK_OAK_DOOR, 0); //TODO: data variant

	public final static MaterialData END_ROD = define(Material.END_ROD);
	public final static MaterialData CHORUS_PLANT = define(Material.CHORUS_PLANT);
	public final static MaterialData CHORUS_FLOWER = define(Material.CHORUS_FLOWER);
	public final static MaterialData PURPUR_BLOCK = define(Material.PURPUR_BLOCK);
	public final static MaterialData PURPUR_PILLAR = define(Material.PURPUR_PILLAR);
	public final static MaterialData PURPUR_STAIRS = define(Material.PURPUR_STAIRS, 0); //TODO: data variant
	public final static MaterialData PURPUR_DOUBLE_SLAB = define(Material.PURPUR_DOUBLE_SLAB, 0); //TODO: data variant
	public final static MaterialData PURPUR_SLAB = define(Material.PURPUR_SLAB, 0); //TODO: data variant
	public final static MaterialData END_BRICKS = define(Material.END_BRICKS, 0); //TODO: data variant
	public final static MaterialData BEETROOT_BLOCK = define(Material.BEETROOT_BLOCK, 0); //TODO: wrong name; data variant
	public final static MaterialData GRASS_PATH = define(Material.GRASS_PATH);
	public final static MaterialData END_GATEWAY = define(Material.END_GATEWAY);
	public final static MaterialData COMMAND_REPEATING = define(Material.COMMAND_REPEATING); //TODO: wrong name
	public final static MaterialData COMMAND_CHAIN = define(Material.COMMAND_CHAIN); //TODO: wrong name
	public final static MaterialData FROSTED_ICE = define(Material.FROSTED_ICE, 0); //TODO: data variant
	public final static MaterialData MAGMA = define(Material.MAGMA);
	public final static MaterialData NETHER_WART_BLOCK = define(Material.NETHER_WART_BLOCK);
	public final static MaterialData RED_NETHER_BRICK = define(Material.RED_NETHER_BRICK);
	public final static MaterialData BONE_BLOCK = define(Material.BONE_BLOCK);
	public final static MaterialData STRUCTURE_VOID = define(Material.STRUCTURE_VOID);
	
	public final static MaterialData OBSERVER = define(Material.OBSERVER);
	public final static MaterialData SHULKER_BOX = define(Material.BLACK_SHULKER_BOX);
	public final static MaterialData SHULKER_BOX_WHITE = define(Material.WHITE_SHULKER_BOX);
	public final static MaterialData SHULKER_BOX_ORANGE = define(Material.ORANGE_SHULKER_BOX);
	public final static MaterialData SHULKER_BOX_MAGENTA = define(Material.MAGENTA_SHULKER_BOX);
	public final static MaterialData SHULKER_BOX_LIGHT_BLUE = define(Material.LIGHT_BLUE_SHULKER_BOX);
	public final static MaterialData SHULKER_BOX_YELLOW = define(Material.YELLOW_SHULKER_BOX);
	public final static MaterialData SHULKER_BOX_LIME = define(Material.LIME_SHULKER_BOX);
	public final static MaterialData SHULKER_BOX_PINK = define(Material.PINK_SHULKER_BOX);
	public final static MaterialData SHULKER_BOX_GRAY = define(Material.GRAY_SHULKER_BOX);
	public final static MaterialData SHULKER_BOX_SILVER = define(Material.SILVER_SHULKER_BOX);
	public final static MaterialData SHULKER_BOX_CYAN = define(Material.CYAN_SHULKER_BOX);
	public final static MaterialData SHULKER_BOX_PURPLE = define(Material.PURPLE_SHULKER_BOX);
	public final static MaterialData SHULKER_BOX_BLUE = define(Material.BLUE_SHULKER_BOX);
	public final static MaterialData SHULKER_BOX_BROWN = define(Material.BROWN_SHULKER_BOX);
	public final static MaterialData SHULKER_BOX_GREEN = define(Material.GREEN_SHULKER_BOX);
	public final static MaterialData SHULKER_BOX_RED = define(Material.RED_SHULKER_BOX);
	public final static MaterialData SHULKER_BOX_BLACK = define(Material.BLACK_SHULKER_BOX);
	
	public final static MaterialData TERRACOTTA_WHITE = define(Material.BLACK_GLAZED_TERRACOTTA);
	public final static MaterialData TERRACOTTA_ORANGE = define(Material.ORANGE_GLAZED_TERRACOTTA);
	public final static MaterialData TERRACOTTA_MAGENTA = define(Material.MAGENTA_GLAZED_TERRACOTTA);
	public final static MaterialData TERRACOTTA_LIGHT_BLUE = define(Material.LIGHT_BLUE_GLAZED_TERRACOTTA);
	public final static MaterialData TERRACOTTA_YELLOW = define(Material.YELLOW_GLAZED_TERRACOTTA);
	public final static MaterialData TERRACOTTA_LIME = define(Material.LIME_GLAZED_TERRACOTTA);
	public final static MaterialData TERRACOTTA_PINK = define(Material.PINK_GLAZED_TERRACOTTA);
	public final static MaterialData TERRACOTTA_GRAY = define(Material.GRAY_GLAZED_TERRACOTTA);
	public final static MaterialData TERRACOTTA_SILVER = define(Material.SILVER_GLAZED_TERRACOTTA);
	public final static MaterialData TERRACOTTA_CYAN = define(Material.CYAN_GLAZED_TERRACOTTA);
	public final static MaterialData TERRACOTTA_PURPLE = define(Material.PURPLE_GLAZED_TERRACOTTA);
	public final static MaterialData TERRACOTTA_BLUE = define(Material.BLUE_GLAZED_TERRACOTTA);
	public final static MaterialData TERRACOTTA_BROWN = define(Material.BROWN_GLAZED_TERRACOTTA);
	public final static MaterialData TERRACOTTA_GREEN = define(Material.GREEN_GLAZED_TERRACOTTA);
	public final static MaterialData TERRACOTTA_RED = define(Material.RED_GLAZED_TERRACOTTA);
	public final static MaterialData TERRACOTTA_BLACK = define(Material.BLACK_GLAZED_TERRACOTTA);

	public final static MaterialData CONCRETE = define(Material.CONCRETE);
	public final static MaterialData CONCRETE_WHITE = define(Material.CONCRETE, DyeColor.WHITE);
	public final static MaterialData CONCRETE_ORANGE = define(Material.CONCRETE, DyeColor.ORANGE);
	public final static MaterialData CONCRETE_MAGENTA = define(Material.CONCRETE, DyeColor.MAGENTA);
	public final static MaterialData CONCRETE_LIGHT_BLUE = define(Material.CONCRETE, DyeColor.LIGHT_BLUE);
	public final static MaterialData CONCRETE_YELLOW = define(Material.CONCRETE, DyeColor.YELLOW);
	public final static MaterialData CONCRETE_LIME = define(Material.CONCRETE, DyeColor.LIME);
	public final static MaterialData CONCRETE_PINK = define(Material.CONCRETE, DyeColor.PINK);
	public final static MaterialData CONCRETE_GRAY = define(Material.CONCRETE, DyeColor.GRAY);
	public final static MaterialData CONCRETE_SILVER = define(Material.CONCRETE, DyeColor.LIGHT_GRAY);
	public final static MaterialData CONCRETE_CYAN = define(Material.CONCRETE, DyeColor.CYAN);
	public final static MaterialData CONCRETE_PURPLE = define(Material.CONCRETE, DyeColor.PURPLE);
	public final static MaterialData CONCRETE_BLUE = define(Material.CONCRETE, DyeColor.BLUE);
	public final static MaterialData CONCRETE_BROWN = define(Material.CONCRETE, DyeColor.BROWN);
	public final static MaterialData CONCRETE_GREEN = define(Material.CONCRETE, DyeColor.GREEN);
	public final static MaterialData CONCRETE_RED = define(Material.CONCRETE, DyeColor.RED);
	public final static MaterialData CONCRETE_BLACK = define(Material.CONCRETE, DyeColor.BLACK);

	public final static MaterialData CONCRETE_POWDER = define(Material.CONCRETE_POWDER);
	public final static MaterialData CONCRETE_POWDER_WHITE = define(Material.CONCRETE_POWDER, DyeColor.WHITE);
	public final static MaterialData CONCRETE_POWDER_ORANGE = define(Material.CONCRETE_POWDER, DyeColor.ORANGE);
	public final static MaterialData CONCRETE_POWDER_MAGENTA = define(Material.CONCRETE_POWDER, DyeColor.MAGENTA);
	public final static MaterialData CONCRETE_POWDER_LIGHT_BLUE = define(Material.CONCRETE_POWDER, DyeColor.LIGHT_BLUE);
	public final static MaterialData CONCRETE_POWDER_YELLOW = define(Material.CONCRETE_POWDER, DyeColor.YELLOW);
	public final static MaterialData CONCRETE_POWDER_LIME = define(Material.CONCRETE_POWDER, DyeColor.LIME);
	public final static MaterialData CONCRETE_POWDER_PINK = define(Material.CONCRETE_POWDER, DyeColor.PINK);
	public final static MaterialData CONCRETE_POWDER_GRAY = define(Material.CONCRETE_POWDER, DyeColor.GRAY);
	public final static MaterialData CONCRETE_POWDER_SILVER = define(Material.CONCRETE_POWDER, DyeColor.LIGHT_GRAY);
	public final static MaterialData CONCRETE_POWDER_CYAN = define(Material.CONCRETE_POWDER, DyeColor.CYAN);
	public final static MaterialData CONCRETE_POWDER_PURPLE = define(Material.CONCRETE_POWDER, DyeColor.PURPLE);
	public final static MaterialData CONCRETE_POWDER_BLUE = define(Material.CONCRETE_POWDER, DyeColor.BLUE);
	public final static MaterialData CONCRETE_POWDER_BROWN = define(Material.CONCRETE_POWDER, DyeColor.BROWN);
	public final static MaterialData CONCRETE_POWDER_GREEN = define(Material.CONCRETE_POWDER, DyeColor.GREEN);
	public final static MaterialData CONCRETE_POWDER_RED = define(Material.CONCRETE_POWDER, DyeColor.RED);
	public final static MaterialData CONCRETE_POWDER_BLACK = define(Material.CONCRETE_POWDER, DyeColor.BLACK);

	
	// THIS SHOULD BE THE LAST ONE... because it is
	public final static MaterialData STRUCTURE_BLOCK = define(Material.STRUCTURE_BLOCK, 0); //TODO: data variant

	@Deprecated // Use WATER_STATIONARY instead
	public final static MaterialData WATER = WATER_STATIONARY;
	@Deprecated // Use WATER_STATIONARY instead
	public final static MaterialData WATER = WATER_STATIONARY;
	@Deprecated // Use LAVA_STATIONARY instead
	public final static MaterialData LAVA = LAVA_STATIONARY; 
	@Deprecated // Use LAVA_STATIONARY instead
	public final static MaterialData LAVA = LAVA_STATIONARY; 
	@Deprecated // Use LEAVES_OAK instead
	public final static MaterialData LEAVES = LEAVES_OAK;
	@Deprecated // Use WOOD_OAK instead
	public final static MaterialData WOOD = WOOD_OAK;
	@Deprecated // Use SAPLING_OAK instead
	public final static MaterialData SAPLING = SAPLING_OAK;
	@Deprecated // Use LEAVES_OAK instead
	public final static MaterialData LOG = LOG_OAK;
	@Deprecated // Use SPONGE_DRY instead
	public final static MaterialData SPONGE = SPONGE_DRY;
	@Deprecated // Use TALL_GRASS instead
	public final static MaterialData TALL_GRASS = TALL_GRASS;
	@Deprecated // Use FLOWER_DANDELION instead
	public final static MaterialData DANDELION = FLOWER_DANDELION;
	@Deprecated // Use FLOWER_POPPY instead
	public final static MaterialData POPPY = FLOWER_POPPY;
	@Deprecated // Use MUSHROOM_BROWN instead
	public final static MaterialData BROWN_MUSHROOM = MUSHROOM_BROWN;
	@Deprecated // Use MUSHROOM_RED instead
	public final static MaterialData RED_MUSHROOM = MUSHROOM_RED;
	@Deprecated // Use STONE_DOUBLE_SLAB instead
	public final static MaterialData DOUBLE_STEP = STONE_DOUBLE_SLAB;
	@Deprecated // Use STONE_SLAB instead
	public final static MaterialData STEP = STONE_SLAB;
	@Deprecated // Use WOOD_OAK_DOUBLE_SLAB instead
	public final static MaterialData WOOD_DOUBLE_STEP = WOOD_OAK_DOUBLE_SLAB;
	@Deprecated // Use WOOD_OAK_DOUBLE_SLAB instead
	public final static MaterialData WOOD_DOUBLE_SLAB = WOOD_OAK_DOUBLE_SLAB;
	@Deprecated // Use WOOD_OAK_SLAB instead
	public final static MaterialData WOOD_STEP = WOOD_OAK_SLAB;
	@Deprecated // Use WOOD_OAK_SLAB instead
	public final static MaterialData WOOD_SLAB = WOOD_OAK_SLAB;
	@Deprecated // Use LEAVES_OAK instead
	public final static MaterialData LEAVES_2 = LEAVES_OAK;
	@Deprecated // Use LOG_OAK instead
	public final static MaterialData LOG_2 = LOG_OAK;
	
	public static MaterialData microSnow(double realAmount) {
		int amount = Math.min(7, NoiseGenerator.floor((realAmount - Math.floor(realAmount)) * 8.0));
		return define(Material.SNOW, amount);
	}
	
	@SuppressWarnings("deprecation")
	protected static void assertTest(Material material) {
		assert(material.getId() > 255);
	}
	
	@SuppressWarnings("deprecation")
	protected static MaterialData define(Material material, DyeColor color) {
		assertTest(material);
		return new MaterialData(material, color.getDyeData());
	}

	private static MaterialData define(Material material, TreeSpecies species) {
		return define(material, species, 0);
	}
	
	private static MaterialData define(Material material, TreeSpecies species, int orWith) {
		switch (material) {
		case WOOD:
		case SAPLING:
		case FENCE:
			switch (species) {
			case GENERIC:
				return define(material, 0);
			case REDWOOD:
				return define(material, 1);
			case BIRCH:
				return define(material, 2);
			case JUNGLE:
				return define(material, 3);
			case ACACIA:
				return define(material, 4);
			case DARK_OAK:
				return define(material, 5);
			default:
				return null;
			}
		case LOG:
		case LOG_2:
			switch (species) {
			case GENERIC:
				return define(Material.LOG, 0);
			case REDWOOD:
				return define(Material.LOG, 1);
			case BIRCH:
				return define(Material.LOG, 2);
			case JUNGLE:
				return define(Material.LOG, 3);
			case ACACIA:
				return define(Material.LOG_2, 0);
			case DARK_OAK:
				return define(Material.LOG_2, 1);
			default:
				return null;
			}
		case LEAVES:
		case LEAVES_2:
			switch (species) {
			case GENERIC:
				return define(Material.LEAVES, 0, orWith);
			case REDWOOD:
				return define(Material.LEAVES, 1, orWith);
			case BIRCH:
				return define(Material.LEAVES, 2, orWith);
			case JUNGLE:
				return define(Material.LEAVES, 3, orWith);
			case ACACIA:
				return define(Material.LEAVES_2, 0, orWith);
			case DARK_OAK:
				return define(Material.LEAVES_2, 1, orWith);
			default:
				return null;
			}
		case WOOD_STEP:
		case STEP: // this will be converted to the above
			switch (species) {
			case GENERIC:
				return define(Material.WOOD_STEP, 0);
			case REDWOOD:
				return define(Material.WOOD_STEP, 1);
			case BIRCH:
				return define(Material.WOOD_STEP, 2);
			case JUNGLE:
				return define(Material.WOOD_STEP, 3);
			case ACACIA:
				return define(Material.WOOD_STEP, 4);
			case DARK_OAK:
				return define(Material.WOOD_STEP, 5);
			default:
				return null;
			}
		case WOOD_DOUBLE_STEP:
		case DOUBLE_STEP: // this will be converted to the above
			switch (species) {
			case GENERIC:
				return define(Material.WOOD_DOUBLE_STEP, 0);
			case REDWOOD:
				return define(Material.WOOD_DOUBLE_STEP, 1);
			case BIRCH:
				return define(Material.WOOD_DOUBLE_STEP, 2);
			case JUNGLE:
				return define(Material.WOOD_DOUBLE_STEP, 3);
			case ACACIA:
				return define(Material.WOOD_DOUBLE_STEP, 4);
			case DARK_OAK:
				return define(Material.WOOD_DOUBLE_STEP, 5);
			default:
				return null;
			}
		default:
		    throw new IllegalArgumentException("Invalid block type for tree species");
		}
	}
	
}
