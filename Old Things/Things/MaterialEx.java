package me.daddychurchill.XWorld.Things;

import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.TreeSpecies;
import org.bukkit.material.MaterialData;

public enum MaterialEx {

	//BLOCKS
//	AIR(Material.AIR),
//	STONE(Material.STONE), 
	GRANITE(Material.STONE, 1),
	POLISHED_GRANITE(Material.STONE, 2),
	DIORITE(Material.STONE, 3),
	POLISHED_DIORITE(Material.STONE, 4),
	ANDESITE(Material.STONE, 5),
	POLISHED_ANDESITE(Material.STONE, 6),
//	GRASS(Material.GRASS),
//	DIRT(Material.DIRT), 
	COARSE_DIRT(Material.DIRT, 1),
	PODZOL(Material.DIRT, 2),
//	COBBLESTONE(Material.COBBLESTONE),
//	@Deprecated
//	WOOD(Material.WOOD), 
	SPRUCE_WOOD(Material.WOOD, TreeSpecies.GENERIC),
	REDWOOD_WOOD(Material.WOOD, TreeSpecies.REDWOOD),
	BIRCH_WOOD(Material.WOOD, TreeSpecies.BIRCH),
	JUNGLE_WOOD(Material.WOOD, TreeSpecies.JUNGLE),
	ACACIA_WOOD(Material.WOOD, TreeSpecies.ACACIA),
	DARK_OAK_WOOD(Material.WOOD, TreeSpecies.DARK_OAK),
//	@Deprecated
//	SAPLING(Material.SAPLING), 
	SPRUCE_SAPLING(Material.SAPLING, TreeSpecies.GENERIC),
	REDWOOD_SAPLING(Material.SAPLING, TreeSpecies.REDWOOD),
	BIRCH_SAPLING(Material.SAPLING, TreeSpecies.BIRCH),
	JUNGLE_SAPLING(Material.SAPLING, TreeSpecies.JUNGLE),
	ACACIA_SAPLING(Material.SAPLING, TreeSpecies.ACACIA),
	DARK_OAK_SAPLING(Material.SAPLING, TreeSpecies.DARK_OAK),
//	BEDROCK(Material.BEDROCK),
//	WATER(Material.WATER),
//	WATER(Material.WATER),
//	LAVA(Material.LAVA),
//	LAVA(Material.LAVA),
//	SAND(Material.SAND),
	RED_SAND(Material.SAND, 1),
//	GRAVEL(Material.GRAVEL),
//	GOLD_ORE(Material.GOLD_ORE),
//	IRON_ORE(Material.IRON_ORE),
//	COAL_ORE(Material.COAL_ORE),
//	@Deprecated
//	LOG(Material.LOG),
	SPRUCE_LOG(Material.LOG, TreeSpecies.GENERIC),
	REDWOOD_LOG(Material.LOG, TreeSpecies.REDWOOD),
	BIRCH_LOG(Material.LOG, TreeSpecies.BIRCH),
	JUNGLE_LOG(Material.LOG, TreeSpecies.JUNGLE),
	ACACIA_LOG(Material.LOG, TreeSpecies.ACACIA),
	DARK_OAK_LOG(Material.LOG, TreeSpecies.DARK_OAK),
//	@Deprecated
//	LEAVES(Material.LEAVES),
	SPRUCE_LEAVES(Material.LEAVES, TreeSpecies.GENERIC),
	REDWOOD_LEAVES(Material.LEAVES, TreeSpecies.REDWOOD),
	BIRCH_LEAVES(Material.LEAVES, TreeSpecies.BIRCH),
	JUNGLE_LEAVES(Material.LEAVES, TreeSpecies.JUNGLE),
	ACACIA_LEAVES(Material.LEAVES, TreeSpecies.ACACIA),
	DARK_OAK_LEAVES(Material.LEAVES, TreeSpecies.DARK_OAK),
//	@Deprecated
//	SPONGE(Material.SPONGE),
	DRY_SPONGE(Material.SPONGE, 0),
	WET_SPONGE(Material.SPONGE, 1),
//	GLASS(Material.GLASS),
//	LAPIS_ORE(Material.LAPIS_ORE),
//	LAPIS_BLOCK(Material.LAPIS_BLOCK),
//	DISPENSER(Material.DISPENSER),
//	SANDSTONE(Material.SANDSTONE),
	CHISELED_SANDSTONE(Material.SANDSTONE, 1),
	SMOOTH_SANDSTONE(Material.SANDSTONE, 2),
//	NOTE_BLOCK(Material.NOTE_BLOCK),
//	BED_BLOCK(Material.BED_BLOCK),
	////POWERED_RAIL(Material.POWERED_RAIL),
	////DETECTOR_RAIL(Material.DETECTOR_RAIL),
	////PISTON_STICKY_BASE(Material.PISTON_STICKY_BASE),
//	WEB(Material.WEB),
//	@Deprecated
//	TALL_GRASS(Material.TALL_GRASS),
	SHRUB(Material.TALL_GRASS, 0), 
	TALL_GRASS(Material.TALL_GRASS, 1), 
	FERN(Material.TALL_GRASS, 2), 
//	DEAD_BUSH(Material.DEAD_BUSH),
	////PISTON_BASE(Material.PISTON_BASE),
	////PISTON_EXTENSION(Material.PISTON_EXTENSION),
//	@Deprecated
//	WOOL(Material.WOOL),
	WHITE_WOOL(Material.WOOL, DyeColor.WHITE),
	ORANGE_WOOL(Material.WOOL, DyeColor.ORANGE),
	MAGENTA_WOOL(Material.WOOL, DyeColor.MAGENTA),
	LIGHT_BLUE_WOOL(Material.WOOL, DyeColor.LIGHT_BLUE),
	YELLOW_WOOL(Material.WOOL, DyeColor.YELLOW),
	LIME_WOOL(Material.WOOL, DyeColor.LIME),
	PINK_WOOL(Material.WOOL, DyeColor.PINK),
	GRAY_WOOL(Material.WOOL, DyeColor.GRAY),
	SILVER_WOOL(Material.WOOL, DyeColor.SILVER),
	CYAN_WOOL(Material.WOOL, DyeColor.CYAN),
	PURPLE_WOOL(Material.WOOL, DyeColor.PURPLE),
	BLUE_WOOL(Material.WOOL, DyeColor.BLUE),
	BROWN_WOOL(Material.WOOL, DyeColor.BROWN),
	GREEN_WOOL(Material.WOOL, DyeColor.GREEN),
	RED_WOOL(Material.WOOL, DyeColor.RED),
	BLACK_WOOL(Material.WOOL, DyeColor.BLACK),
	////PISTON_MOVING_PIECE(Material.PISTON_MOVING_PIECE),
//	@Deprecated
//	DANDELION(Material.DANDELION),
	DANDELION_FLOWER(Material.DANDELION),
//	@Deprecated
//	POPPY(Material.POPPY),
	POPPY_FLOWER(Material.POPPY, 0),
	BLUE_ORCHID_FLOWER(Material.POPPY, 1),
	ALLIUM_FLOWER(Material.POPPY, 2),
	AZURE_BLUET_FLOWER(Material.POPPY, 3),
	RED_TULIP_FLOWER(Material.POPPY, 4),
	ORANGE_TULIP_FLOWER(Material.POPPY, 5),
	WHITE_TULIP_FLOWER(Material.POPPY, 6),
	PINK_TULIP_FLOWER(Material.POPPY, 7),
	OXEYE_FLOWER(Material.POPPY, 8),
//	BROWN_MUSHROOM(Material.BROWN_MUSHROOM),
//	RED_MUSHROOM(Material.RED_MUSHROOM),
//	GOLD_BLOCK(Material.GOLD_BLOCK),
//	IRON_BLOCK(Material.IRON_BLOCK),
//	@Deprecated
//	DOUBLE_STEP(Material.DOUBLE_STEP),
	STONE_DOUBLE_SLAB(Material.DOUBLE_STEP, 0),
	SANDSTONE_DOUBLE_SLAB(Material.DOUBLE_STEP, 1),
	STONEWOOD_DOUBLE_SLAB(Material.DOUBLE_STEP, 2),
	COBBLESTONE_DOUBLE_SLAB(Material.DOUBLE_STEP, 3),
	BRICK_DOUBLE_SLAB(Material.DOUBLE_STEP, 4),
	SMOOTH_DOUBLE_SLAB(Material.DOUBLE_STEP, 5),
	NETHER_DOUBLE_SLAB(Material.DOUBLE_STEP, 6),
	QUARTZ_DOUBLE_SLAB(Material.DOUBLE_STEP, 7),
	RED_SANDSTONE_DOUBLE_SLAB(Material.DOUBLE_STONE_SLAB2, 0),
//	@Deprecated
//	STEP(Material.STEP),
	STONE_SLAB(Material.STEP, 0),
	SANDSTONE_SLAB(Material.STEP, 1),
	STONEWOOD_SLAB(Material.STEP, 2),
	COBBLESTONE_SLAB(Material.STEP, 3),
	BRICK_SLAB(Material.STEP, 4),
	SMOOTH_SLAB(Material.STEP, 5),
	NETHER_SLAB(Material.STEP, 6),
	QUARTZ_SLAB(Material.STEP, 7),
	RED_SANDSTONE_SLAB(Material.STONE_SLAB2, 8),
//	UPPER_STONE_SLAB(Material.STEP, 0 + 8),
//	UPPER_SANDSTONE_SLAB(Material.STEP, 1 + 8),
//	UPPER_STONEWOOD_SLAB(Material.STEP, 2 + 8),
//	UPPER_COBBLESTONE_SLAB(Material.STEP, 3 + 8),
//	UPPER_BRICK_SLAB(Material.STEP, 4 + 8),
//	UPPER_SMOOTH_SLAB(Material.STEP, 5 + 8),
//	UPPER_NETHER_SLAB(Material.STEP, 6 + 8),
//	UPPER_QUARTZ_SLAB(Material.STEP, 7 + 8),
//	UPPER_RED_SANDSTONE_SLAB(Material.STONE_SLAB2, 0 + 8),
//	BRICK(Material.BRICK),
//	TNT(Material.TNT),
//	BOOKSHELF(Material.BOOKSHELF),
//	MOSSY_COBBLESTONE(Material.MOSSY_COBBLESTONE),
//	OBSIDIAN(Material.OBSIDIAN),
//	TORCH(Material.TORCH),
//	FIRE(Material.FIRE),
//	MOB_SPAWNER(Material.MOB_SPAWNER), //@@@
//	WOOD_STAIRS(Material.WOOD_STAIRS), //###
//	CHEST(Material.CHEST),
//	REDSTONE_WIRE(Material.REDSTONE_WIRE),
//	DIAMOND_ORE(Material.DIAMOND_ORE),
//	DIAMOND_BLOCK(Material.DIAMOND_BLOCK),
//	WORKBENCH(Material.WORKBENCH),
//	CROPS(Material.CROPS),
//	SOIL(Material.SOIL),
//	FURNACE(Material.FURNACE),
//	BURNING_FURNACE(Material.BURNING_FURNACE),
//	SIGN_POST(Material.SIGN_POST), //###
//	WOODEN_DOOR(Material.WOODEN_DOOR), //###
//	LADDER(Material.LADDER), //###
//	RAILS(Material.RAILS),
//	COBBLESTONE_STAIRS(Material.COBBLESTONE_STAIRS), //###
//	WALL_SIGN(Material.WALL_SIGN),
//	LEVER(Material.LEVER),
//	STONE_PLATE(Material.STONE_PLATE),
//	IRON_DOOR_BLOCK(Material.IRON_DOOR_BLOCK),
//	WOOD_PLATE(Material.WOOD_PLATE),
//	REDSTONE_ORE(Material.REDSTONE_ORE),
//	GLOWING_REDSTONE_ORE(Material.GLOWING_REDSTONE_ORE),
//	REDSTONE_TORCH_OFF(Material.REDSTONE_TORCH_OFF),
//	REDSTONE_TORCH_ON(Material.REDSTONE_TORCH_ON),
//	STONE_BUTTON(Material.STONE_BUTTON),
//	SNOW(Material.SNOW), //@@@
//	ICE(Material.ICE),
//	SNOW_BLOCK(Material.SNOW_BLOCK),
//	CACTUS(Material.CACTUS),
//	CLAY(Material.CLAY),
//	SUGAR_CANE_BLOCK(Material.SUGAR_CANE_BLOCK),
//	JUKEBOX(Material.JUKEBOX),
//	FENCE(Material.FENCE),
//	PUMPKIN(Material.PUMPKIN),
//	NETHERRACK(Material.NETHERRACK),
//	SOUL_SAND(Material.SOUL_SAND),
//	GLOWSTONE(Material.GLOWSTONE),
//	////PORTAL(Material.PORTAL),
//	JACK_O_LANTERN(Material.JACK_O_LANTERN),
//	CAKE_BLOCK(Material.CAKE_BLOCK),
//	////DIODE_BLOCK_OFF(Material.DIODE_BLOCK_OFF),
//	////DIODE_BLOCK_ON(Material.DIODE_BLOCK_ON),
//	@Deprecated
//	STAINED_GLASS(Material.STAINED_GLASS),
	WHITE_STAINED_GLASS(Material.STAINED_GLASS, DyeColor.WHITE),
	ORANGE_STAINED_GLASS(Material.STAINED_GLASS, DyeColor.ORANGE),
	MAGENTA_STAINED_GLASS(Material.STAINED_GLASS, DyeColor.MAGENTA),
	LIGHT_BLUE_STAINED_GLASS(Material.STAINED_GLASS, DyeColor.LIGHT_BLUE),
	YELLOW_STAINED_GLASS(Material.STAINED_GLASS, DyeColor.YELLOW),
	LIME_STAINED_GLASS(Material.STAINED_GLASS, DyeColor.LIME),
	PINK_STAINED_GLASS(Material.STAINED_GLASS, DyeColor.PINK),
	GRAY_STAINED_GLASS(Material.STAINED_GLASS, DyeColor.GRAY),
	SILVER_STAINED_GLASS(Material.STAINED_GLASS, DyeColor.SILVER),
	CYAN_STAINED_GLASS(Material.STAINED_GLASS, DyeColor.CYAN),
	PURPLE_STAINED_GLASS(Material.STAINED_GLASS, DyeColor.PURPLE),
	BLUE_STAINED_GLASS(Material.STAINED_GLASS, DyeColor.BLUE),
	BROWN_STAINED_GLASS(Material.STAINED_GLASS, DyeColor.BROWN),
	GREEN_STAINED_GLASS(Material.STAINED_GLASS, DyeColor.GREEN),
	RED_STAINED_GLASS(Material.STAINED_GLASS, DyeColor.RED),
	BLACK_STAINED_GLASS(Material.STAINED_GLASS, DyeColor.BLACK),
//	TRAP_DOOR(Material.TRAP_DOOR),
//	@Deprecated
//	MONSTER_EGGS(Material.MONSTER_EGGS),
//	STONE_SILVERFISH_BLOCK(Material.MONSTER_EGGS),
//	COBBLESTONE_SILVERFISH_BLOCK(Material.MONSTER_EGGS, 1),
//	SMOOTH_SILVERFISH_BLOCK(Material.MONSTER_EGGS, 2),
//	MOSSY_SILVERFISH_BLOCK(Material.MONSTER_EGGS, 3),
//	CRACKED_SILVERFISH_BLOCK(Material.MONSTER_EGGS, 4),
//	CHISELED_SILVERFISH_BLOCK(Material.MONSTER_EGGS, 5),
//	STONE_BRICKS(Material.STONE_BRICKS),
	MOSSY_STONE_BRICKS(Material.STONE_BRICKS, 1),
	CRACKED_STONE_BRICKS(Material.STONE_BRICKS, 2),
	CHISELED_STONE_BRICKS(Material.STONE_BRICKS, 3),
	////HUGE_MUSHROOM_1(Material.HUGE_MUSHROOM_1),
	////HUGE_MUSHROOM_2(Material.HUGE_MUSHROOM_2),
//	IRON_FENCE(Material.IRON_FENCE),
//	GLASS_PANE(Material.GLASS_PANE),
//	MELON_BLOCK(Material.MELON_BLOCK),
//	PUMPKIN_STEM(Material.PUMPKIN_STEM),
//	MELON_STEM(Material.MELON_STEM),
//	VINE(Material.VINE),
//	FENCE_GATE(Material.FENCE_GATE),
//	BRICK_STAIRS(Material.BRICK_STAIRS), //###
//	SMOOTH_STAIRS(Material.SMOOTH_STAIRS), //###
//	MYCELIUM(Material.MYCELIUM),
//	WATER_LILY(Material.WATER_LILY),
//	NETHER_BRICK(Material.NETHER_BRICK),
//	NETHER_FENCE(Material.NETHER_FENCE),
//	NETHER_BRICK_STAIRS(Material.NETHER_BRICK_STAIRS), //###
//	NETHER_WARTS(Material.NETHER_WARTS),
//	ENCHANTMENT_TABLE(Material.ENCHANTMENT_TABLE),
//	BREWING_STAND(Material.BREWING_STAND),
//	CAULDRON(Material.CAULDRON),
//	////ENDER_PORTAL(Material.ENDER_PORTAL),
//	////ENDER_PORTAL_FRAME(Material.ENDER_PORTAL_FRAME),
//	END_STONE(Material.END_STONE),
//	DRAGON_EGG(Material.DRAGON_EGG),
//	REDSTONE_LAMP_OFF(Material.REDSTONE_LAMP_OFF),
//	REDSTONE_LAMP_ON(Material.REDSTONE_LAMP_ON),
//	@Deprecated
//	WOOD_DOUBLE_STEP(Material.WOOD_DOUBLE_STEP),
	SPRUCE_DOUBLE_SLAB(Material.WOOD_DOUBLE_STEP, TreeSpecies.GENERIC),
	REDWOOD_DOUBLE_SLAB(Material.WOOD_DOUBLE_STEP, TreeSpecies.REDWOOD),
	BIRCH_DOUBLE_SLAB(Material.WOOD_DOUBLE_STEP, TreeSpecies.BIRCH),
	JUNGLE_DOUBLE_SLAB(Material.WOOD_DOUBLE_STEP, TreeSpecies.JUNGLE),
	ACACIA_DOUBLE_SLAB(Material.WOOD_DOUBLE_STEP, TreeSpecies.ACACIA),
	DARK_OAK_DOUBLE_SLAB(Material.WOOD_DOUBLE_STEP, TreeSpecies.DARK_OAK),
//	@Deprecated
//	WOOD_STEP(Material.WOOD_STEP),
	SPRUCE_SLAB(Material.WOOD_STEP, TreeSpecies.GENERIC),
	REDWOOD_SLAB(Material.WOOD_STEP, TreeSpecies.REDWOOD),
	BIRCH_SLAB(Material.WOOD_STEP, TreeSpecies.BIRCH),
	JUNGLE_SLAB(Material.WOOD_STEP, TreeSpecies.JUNGLE),
	ACACIA_SLAB(Material.WOOD_STEP, TreeSpecies.ACACIA),
	DARK_OAK_SLAB(Material.WOOD_STEP, TreeSpecies.DARK_OAK, 8),
//	UPPER_SPRUCE_SLAB(Material.WOOD_STEP, TreeSpecies.GENERIC, 8),
//	UPPER_REDWOOD_SLAB(Material.WOOD_STEP, TreeSpecies.REDWOOD, 8),
//	UPPER_BIRCH_SLAB(Material.WOOD_STEP, TreeSpecies.BIRCH, 8),
//	UPPER_JUNGLE_SLAB(Material.WOOD_STEP, TreeSpecies.JUNGLE, 8),
//	UPPER_ACACIA_SLAB(Material.WOOD_STEP, TreeSpecies.ACACIA, 8),
//	UPPER_DARK_OAK_SLAB(Material.WOOD_STEP, TreeSpecies.DARK_OAK, 8),
//	COCOA(Material.COCOA),
//	SANDSTONE_STAIRS(Material.SANDSTONE_STAIRS), //###
//	EMERALD_ORE(Material.EMERALD_ORE),
//	ENDER_CHEST(Material.ENDER_CHEST),
//	TRIPWIRE_HOOK(Material.TRIPWIRE_HOOK),
//	TRIPWIRE(Material.TRIPWIRE),
//	EMERALD_BLOCK(Material.EMERALD_BLOCK),
//	SPRUCE_WOOD_STAIRS(Material.SPRUCE_WOOD_STAIRS), //###
//	BIRCH_WOOD_STAIRS(Material.BIRCH_WOOD_STAIRS), //###
//	JUNGLE_WOOD_STAIRS(Material.JUNGLE_WOOD_STAIRS), //###
//	////COMMAND(Material.COMMAND),
//	BEACON(Material.BEACON),
//	COBBLE_WALL(Material.COBBLE_WALL),
	MOSSY_COBBLE_WALL(Material.COBBLE_WALL, 1),
//	FLOWER_POT(Material.FLOWER_POT), //[|]
//	CARROT(Material.CARROT),
//	POTATO(Material.POTATO),
//	WOOD_BUTTON(Material.WOOD_BUTTON),
//	SKULL(Material.SKULL),
//	ANVIL(Material.ANVIL), //@@@
//	TRAPPED_CHEST(Material.TRAPPED_CHEST),
//	GOLD_PLATE(Material.GOLD_PLATE),
//	IRON_PLATE(Material.IRON_PLATE),
//	REDSTONE_COMPARATOR_OFF(Material.REDSTONE_COMPARATOR_OFF),
//	REDSTONE_COMPARATOR_ON(Material.REDSTONE_COMPARATOR_ON),
//	DAYLIGHT_DETECTOR(Material.DAYLIGHT_DETECTOR),
//	REDSTONE_BLOCK(Material.REDSTONE_BLOCK),
//	QUARTZ_ORE(Material.QUARTZ_ORE),
//	HOPPER(Material.HOPPER),
//	QUARTZ_BLOCK(Material.QUARTZ_BLOCK),
//	CHISELED_QUARTZ_BLOCK(Material.QUARTZ_BLOCK, 1),
//	UD_PILLAR_QUARTZ_BLOCK(Material.QUARTZ_BLOCK, 2),
//	NS_PILLAR_QUARTZ_BLOCK(Material.QUARTZ_BLOCK, 3),
//	EW_PILLAR_QUARTZ_BLOCK(Material.QUARTZ_BLOCK, 4),
//	QUARTZ_STAIRS(Material.QUARTZ_STAIRS), //###
//	ACTIVATOR_RAIL(Material.ACTIVATOR_RAIL),
//	DROPPER(Material.DROPPER),
//	@Deprecated
//	STAINED_CLAY(Material.STAINED_CLAY),
	WHITE_STAINED_CLAY(Material.STAINED_CLAY, DyeColor.WHITE),
	ORANGE_STAINED_CLAY(Material.STAINED_CLAY, DyeColor.ORANGE),
	MAGENTA_STAINED_CLAY(Material.STAINED_CLAY, DyeColor.MAGENTA),
	LIGHT_BLUE_STAINED_CLAY(Material.STAINED_CLAY, DyeColor.LIGHT_BLUE),
	YELLOW_STAINED_CLAY(Material.STAINED_CLAY, DyeColor.YELLOW),
	LIME_STAINED_CLAY(Material.STAINED_CLAY, DyeColor.LIME),
	PINK_STAINED_CLAY(Material.STAINED_CLAY, DyeColor.PINK),
	GRAY_STAINED_CLAY(Material.STAINED_CLAY, DyeColor.GRAY),
	SILVER_STAINED_CLAY(Material.STAINED_CLAY, DyeColor.SILVER),
	CYAN_STAINED_CLAY(Material.STAINED_CLAY, DyeColor.CYAN),
	PURPLE_STAINED_CLAY(Material.STAINED_CLAY, DyeColor.PURPLE),
	BLUE_STAINED_CLAY(Material.STAINED_CLAY, DyeColor.BLUE),
	BROWN_STAINED_CLAY(Material.STAINED_CLAY, DyeColor.BROWN),
	GREEN_STAINED_CLAY(Material.STAINED_CLAY, DyeColor.GREEN),
	RED_STAINED_CLAY(Material.STAINED_CLAY, DyeColor.RED),
	BLACK_STAINED_CLAY(Material.STAINED_CLAY, DyeColor.BLACK),
//	@Deprecated
//	STAINED_GLASS_PANE(Material.STAINED_GLASS_PANE),
	WHITE_STAINED_GLASS_PANE(Material.STAINED_GLASS_PANE, DyeColor.WHITE),
	ORANGE_STAINED_GLASS_PANE(Material.STAINED_GLASS_PANE, DyeColor.ORANGE),
	MAGENTA_STAINED_GLASS_PANE(Material.STAINED_GLASS_PANE, DyeColor.MAGENTA),
	LIGHT_BLUE_STAINED_GLASS_PANE(Material.STAINED_GLASS_PANE, DyeColor.LIGHT_BLUE),
	YELLOW_STAINED_GLASS_PANE(Material.STAINED_GLASS_PANE, DyeColor.YELLOW),
	LIME_STAINED_GLASS_PANE(Material.STAINED_GLASS_PANE, DyeColor.LIME),
	PINK_STAINED_GLASS_PANE(Material.STAINED_GLASS_PANE, DyeColor.PINK),
	GRAY_STAINED_GLASS_PANE(Material.STAINED_GLASS_PANE, DyeColor.GRAY),
	SILVER_STAINED_GLASS_PANE(Material.STAINED_GLASS_PANE, DyeColor.SILVER),
	CYAN_STAINED_GLASS_PANE(Material.STAINED_GLASS_PANE, DyeColor.CYAN),
	PURPLE_STAINED_GLASS_PANE(Material.STAINED_GLASS_PANE, DyeColor.PURPLE),
	BLUE_STAINED_GLASS_PANE(Material.STAINED_GLASS_PANE, DyeColor.BLUE),
	BROWN_STAINED_GLASS_PANE(Material.STAINED_GLASS_PANE, DyeColor.BROWN),
	GREEN_STAINED_GLASS_PANE(Material.STAINED_GLASS_PANE, DyeColor.GREEN),
	RED_STAINED_GLASS_PANE(Material.STAINED_GLASS_PANE, DyeColor.RED),
	BLACK_STAINED_GLASS_PANE(Material.STAINED_GLASS_PANE, DyeColor.BLACK),
//	@Deprecated
//	LEAVES_2(Material.LEAVES_2),
//	@Deprecated
//	LOG_2(Material.LOG_2),
//	ACACIA_STAIRS(Material.ACACIA_STAIRS), //###
//	DARK_OAK_STAIRS(Material.DARK_OAK_STAIRS), //###
//	SLIME_BLOCK(Material.SLIME_BLOCK),
//	////BARRIER(Material.BARRIER),
//	IRON_TRAPDOOR(Material.IRON_TRAPDOOR),
//	PRISMARINE(Material.PRISMARINE),
	BRICKS_PRISMARINE(Material.PRISMARINE, 1),
	DARK_PRISMARINE(Material.PRISMARINE, 1),
//	SEA_LANTERN(Material.SEA_LANTERN),
//	@Deprecated
//	HAY_BLOCK(Material.HAY_BLOCK),
//	UP_HAY_BLOCK(Material.HAY_BLOCK),
//	NS_HAY_BLOCK(Material.HAY_BLOCK, 1),
//	EW_HAY_BLOCK(Material.HAY_BLOCK, 2),
//	@Deprecated
//	CARPET(Material.CARPET),
	WHITE_CARPET(Material.CARPET, DyeColor.WHITE),
	ORANGE_CARPET(Material.CARPET, DyeColor.ORANGE),
	MAGENTA_CARPET(Material.CARPET, DyeColor.MAGENTA),
	LIGHT_BLUE_CARPET(Material.CARPET, DyeColor.LIGHT_BLUE),
	YELLOW_CARPET(Material.CARPET, DyeColor.YELLOW),
	LIME_CARPET(Material.CARPET, DyeColor.LIME),
	PINK_CARPET(Material.CARPET, DyeColor.PINK),
	GRAY_CARPET(Material.CARPET, DyeColor.GRAY),
	SILVER_CARPET(Material.CARPET, DyeColor.SILVER),
	CYAN_CARPET(Material.CARPET, DyeColor.CYAN),
	PURPLE_CARPET(Material.CARPET, DyeColor.PURPLE),
	BLUE_CARPET(Material.CARPET, DyeColor.BLUE),
	BROWN_CARPET(Material.CARPET, DyeColor.BROWN),
	GREEN_CARPET(Material.CARPET, DyeColor.GREEN),
	RED_CARPET(Material.CARPET, DyeColor.RED),
	BLACK_CARPET(Material.CARPET, DyeColor.BLACK),
//	HARD_CLAY(Material.HARD_CLAY),
//	COAL_BLOCK(Material.COAL_BLOCK),
//	PACKED_ICE(Material.PACKED_ICE),
//	DOUBLE_PLANT(Material.DOUBLE_PLANT), //@@@
//	STANDING_BANNER(Material.STANDING_BANNER),
//	WALL_BANNER(Material.WALL_BANNER),
//	DAYLIGHT_DETECTOR_INVERTED(Material.DAYLIGHT_DETECTOR_INVERTED),
//	RED_SANDSTONE(Material.RED_SANDSTONE),
	CHISELED_RED_SANDSTONE(Material.RED_SANDSTONE, 1),
	SMOOTH_RED_SANDSTONE(Material.RED_SANDSTONE, 2),
//	RED_SANDSTONE_STAIRS(Material.RED_SANDSTONE_STAIRS), //###
//	@Deprecated
//	DOUBLE_STONE_SLAB2(Material.DOUBLE_STONE_SLAB2),
//	@Deprecated
//	STONE_SLAB2(Material.STONE_SLAB2),
//	SPRUCE_FENCE_GATE(Material.SPRUCE_FENCE_GATE),
//	BIRCH_FENCE_GATE(Material.BIRCH_FENCE_GATE),
//	JUNGLE_FENCE_GATE(Material.JUNGLE_FENCE_GATE),
//	DARK_OAK_FENCE_GATE(Material.DARK_OAK_FENCE_GATE),
//	ACACIA_FENCE_GATE(Material.ACACIA_FENCE_GATE),
//	SPRUCE_FENCE(Material.SPRUCE_FENCE),
//	BIRCH_FENCE(Material.BIRCH_FENCE),
//	JUNGLE_FENCE(Material.JUNGLE_FENCE),
//	DARK_OAK_FENCE(Material.DARK_OAK_FENCE),
//	ACACIA_FENCE(Material.ACACIA_FENCE),
//	SPRUCE_DOOR(Material.SPRUCE_DOOR), //###
//	BIRCH_DOOR(Material.BIRCH_DOOR), //###
//	JUNGLE_DOOR(Material.JUNGLE_DOOR), //###
//	ACACIA_DOOR(Material.ACACIA_DOOR), //###
//	DARK_OAK_DOOR(Material.DARK_OAK_DOOR), //###
//	END_ROD(Material.END_ROD),
//	CHORUS_PLANT(Material.CHORUS_PLANT),
//	CHORUS_FLOWER(Material.CHORUS_FLOWER),
//	PURPUR_BLOCK(Material.PURPUR_BLOCK),
//	PURPUR_PILLAR(Material.PURPUR_PILLAR),
//	PURPUR_STAIRS(Material.PURPUR_STAIRS), //###
//	PURPUR_DOUBLE_SLAB(Material.PURPUR_DOUBLE_SLAB),
//	PURPUR_SLAB(Material.PURPUR_SLAB),
//	UPPER_PURPUR_SLAB(Material.PURPUR_SLAB, 8),
//	END_BRICKS(Material.END_BRICKS),
//	BEETROOT_BLOCK(Material.BEETROOT_BLOCK),
//	GRASS_PATH(Material.GRASS_PATH),
//	////END_GATEWAY(Material.END_GATEWAY),
//	////COMMAND_REPEATING(Material.COMMAND_REPEATING),
//	////COMMAND_CHAIN(Material.COMMAND_CHAIN),
//	FROSTED_ICE(Material.FROSTED_ICE),
//	MAGMA(Material.MAGMA),
//	NETHER_WART_BLOCK(Material.NETHER_WART_BLOCK),
//	RED_NETHER_BRICK(Material.RED_NETHER_BRICK),
//	@Deprecated
//	BONE_BLOCK(Material.BONE_BLOCK),
//	UP_BONE_BLOCK(Material.BONE_BLOCK),
//	NS_BONE_BLOCK(Material.BONE_BLOCK, 1),
//	EW_BONE_BLOCK(Material.BONE_BLOCK, 2),
//	////STRUCTURE_VOID(Material.STRUCTURE_VOID),
//	////OBSERVER(Material.OBSERVER),
//	WHITE_SHULKER_BOX(Material.WHITE_SHULKER_BOX),
//	ORANGE_SHULKER_BOX(Material.ORANGE_SHULKER_BOX),
//	MAGENTA_SHULKER_BOX(Material.MAGENTA_SHULKER_BOX),
//	LIGHT_BLUE_SHULKER_BOX(Material.LIGHT_BLUE_SHULKER_BOX),
//	YELLOW_SHULKER_BOX(Material.YELLOW_SHULKER_BOX),
//	LIME_SHULKER_BOX(Material.LIME_SHULKER_BOX),
//	PINK_SHULKER_BOX(Material.PINK_SHULKER_BOX),
//	GRAY_SHULKER_BOX(Material.GRAY_SHULKER_BOX),
//	SILVER_SHULKER_BOX(Material.SILVER_SHULKER_BOX),
//	CYAN_SHULKER_BOX(Material.CYAN_SHULKER_BOX),
//	PURPLE_SHULKER_BOX(Material.PURPLE_SHULKER_BOX),
//	BLUE_SHULKER_BOX(Material.BLUE_SHULKER_BOX),
//	BROWN_SHULKER_BOX(Material.BROWN_SHULKER_BOX),
//	GREEN_SHULKER_BOX(Material.GREEN_SHULKER_BOX),
//	RED_SHULKER_BOX(Material.RED_SHULKER_BOX),
//	BLACK_SHULKER_BOX(Material.BLACK_SHULKER_BOX),
//	WHITE_GLAZED_TERRACOTTA(Material.WHITE_GLAZED_TERRACOTTA),
//	ORANGE_GLAZED_TERRACOTTA(Material.ORANGE_GLAZED_TERRACOTTA),
//	MAGENTA_GLAZED_TERRACOTTA(Material.MAGENTA_GLAZED_TERRACOTTA),
//	LIGHT_BLUE_GLAZED_TERRACOTTA(Material.LIGHT_BLUE_GLAZED_TERRACOTTA),
//	YELLOW_GLAZED_TERRACOTTA(Material.YELLOW_GLAZED_TERRACOTTA),
//	LIME_GLAZED_TERRACOTTA(Material.LIME_GLAZED_TERRACOTTA),
//	PINK_GLAZED_TERRACOTTA(Material.PINK_GLAZED_TERRACOTTA),
//	GRAY_GLAZED_TERRACOTTA(Material.GRAY_GLAZED_TERRACOTTA),
//	SILVER_GLAZED_TERRACOTTA(Material.SILVER_GLAZED_TERRACOTTA),
//	CYAN_GLAZED_TERRACOTTA(Material.CYAN_GLAZED_TERRACOTTA),
//	PURPLE_GLAZED_TERRACOTTA(Material.PURPLE_GLAZED_TERRACOTTA),
//	BLUE_GLAZED_TERRACOTTA(Material.BLUE_GLAZED_TERRACOTTA),
//	BROWN_GLAZED_TERRACOTTA(Material.BROWN_GLAZED_TERRACOTTA),
//	GREEN_GLAZED_TERRACOTTA(Material.GREEN_GLAZED_TERRACOTTA),
//	RED_GLAZED_TERRACOTTA(Material.RED_GLAZED_TERRACOTTA),
//	BLACK_GLAZED_TERRACOTTA(Material.BLACK_GLAZED_TERRACOTTA),
//	@Deprecated
//	CONCRETE(Material.CONCRETE),
	WHITE_CONCRETE(Material.CONCRETE, DyeColor.WHITE),
	ORANGE_CONCRETE(Material.CONCRETE, DyeColor.ORANGE),
	MAGENTA_CONCRETE(Material.CONCRETE, DyeColor.MAGENTA),
	LIGHT_BLUE_CONCRETE(Material.CONCRETE, DyeColor.LIGHT_BLUE),
	YELLOW_CONCRETE(Material.CONCRETE, DyeColor.YELLOW),
	LIME_CONCRETE(Material.CONCRETE, DyeColor.LIME),
	PINK_CONCRETE(Material.CONCRETE, DyeColor.PINK),
	GRAY_CONCRETE(Material.CONCRETE, DyeColor.GRAY),
	SILVER_CONCRETE(Material.CONCRETE, DyeColor.SILVER),
	CYAN_CONCRETE(Material.CONCRETE, DyeColor.CYAN),
	PURPLE_CONCRETE(Material.CONCRETE, DyeColor.PURPLE),
	BLUE_CONCRETE(Material.CONCRETE, DyeColor.BLUE),
	BROWN_CONCRETE(Material.CONCRETE, DyeColor.BROWN),
	GREEN_CONCRETE(Material.CONCRETE, DyeColor.GREEN),
	RED_CONCRETE(Material.CONCRETE, DyeColor.RED),
	BLACK_CONCRETE(Material.CONCRETE, DyeColor.BLACK),
//	@Deprecated
//	CONCRETE_POWDER(Material.CONCRETE_POWDER),
	WHITE_CONCRETE_POWDER(Material.CONCRETE_POWDER, DyeColor.WHITE),
	ORANGE_CONCRETE_POWDER(Material.CONCRETE_POWDER, DyeColor.ORANGE),
	MAGENTA_CONCRETE_POWDER(Material.CONCRETE_POWDER, DyeColor.MAGENTA),
	LIGHT_BLUE_CONCRETE_POWDER(Material.CONCRETE_POWDER, DyeColor.LIGHT_BLUE),
	YELLOW_CONCRETE_POWDER(Material.CONCRETE_POWDER, DyeColor.YELLOW),
	LIME_CONCRETE_POWDER(Material.CONCRETE_POWDER, DyeColor.LIME),
	PINK_CONCRETE_POWDER(Material.CONCRETE_POWDER, DyeColor.PINK),
	GRAY_CONCRETE_POWDER(Material.CONCRETE_POWDER, DyeColor.GRAY),
	SILVER_CONCRETE_POWDER(Material.CONCRETE_POWDER, DyeColor.SILVER),
	CYAN_CONCRETE_POWDER(Material.CONCRETE_POWDER, DyeColor.CYAN),
	PURPLE_CONCRETE_POWDER(Material.CONCRETE_POWDER, DyeColor.PURPLE),
	BLUE_CONCRETE_POWDER(Material.CONCRETE_POWDER, DyeColor.BLUE),
	BROWN_CONCRETE_POWDER(Material.CONCRETE_POWDER, DyeColor.BROWN),
	GREEN_CONCRETE_POWDER(Material.CONCRETE_POWDER, DyeColor.GREEN),
	RED_CONCRETE_POWDER(Material.CONCRETE_POWDER, DyeColor.RED),
	BLACK_CONCRETE_POWDER(Material.CONCRETE_POWDER, DyeColor.BLACK),
	////STRUCTURE_BLOCK(Material.STRUCTURE_BLOCK);

//	//ITEMS
//	IRON_SPADE(Material.IRON_SPADE),
//	IRON_PICKAXE(Material.IRON_PICKAXE),
//	IRON_AXE(Material.IRON_AXE),
//	FLINT_AND_STEEL(Material.FLINT_AND_STEEL),
//	APPLE(Material.APPLE),
//	BOW(Material.BOW),
//	ARROW(Material.ARROW),
//	COAL(Material.COAL), //@@@
//	DIAMOND(Material.DIAMOND),
//	IRON_INGOT(Material.IRON_INGOT),
//	GOLD_INGOT(Material.GOLD_INGOT),
//	IRON_SWORD(Material.IRON_SWORD),
//	WOOD_SWORD(Material.WOOD_SWORD),
//	WOOD_SPADE(Material.WOOD_SPADE),
//	WOOD_PICKAXE(Material.WOOD_PICKAXE),
//	WOOD_AXE(Material.WOOD_AXE),
//	STONE_SWORD(Material.STONE_SWORD),
//	STONE_SPADE(Material.STONE_SPADE),
//	STONE_PICKAXE(Material.STONE_PICKAXE),
//	STONE_AXE(Material.STONE_AXE),
//	DIAMOND_SWORD(Material.DIAMOND_SWORD),
//	DIAMOND_SPADE(Material.DIAMOND_SPADE),
//	DIAMOND_PICKAXE(Material.DIAMOND_PICKAXE),
//	DIAMOND_AXE(Material.DIAMOND_AXE),
//	STICK(Material.STICK),
//	BOWL(Material.BOWL),
//	MUSHROOM_SOUP(Material.MUSHROOM_SOUP),
//	GOLD_SWORD(Material.GOLD_SWORD),
//	GOLD_SPADE(Material.GOLD_SPADE),
//	GOLD_PICKAXE(Material.GOLD_PICKAXE),
//	GOLD_AXE(Material.GOLD_AXE),
//	STRING(Material.STRING),
//	FEATHER(Material.FEATHER),
//	SULPHUR(Material.SULPHUR),
//	WOOD_HOE(Material.WOOD_HOE),
//	STONE_HOE(Material.STONE_HOE),
//	IRON_HOE(Material.IRON_HOE),
//	DIAMOND_HOE(Material.DIAMOND_HOE),
//	GOLD_HOE(Material.GOLD_HOE),
//	SEEDS(Material.SEEDS),
//	WHEAT(Material.WHEAT),
//	BREAD(Material.BREAD),
//	LEATHER_HELMET(Material.LEATHER_HELMET),
//	LEATHER_CHESTPLATE(Material.LEATHER_CHESTPLATE),
//	LEATHER_LEGGINGS(Material.LEATHER_LEGGINGS),
//	LEATHER_BOOTS(Material.LEATHER_BOOTS),
//	CHAINMAIL_HELMET(Material.CHAINMAIL_HELMET),
//	CHAINMAIL_CHESTPLATE(Material.CHAINMAIL_CHESTPLATE),
//	CHAINMAIL_LEGGINGS(Material.CHAINMAIL_LEGGINGS),
//	CHAINMAIL_BOOTS(Material.CHAINMAIL_BOOTS),
//	IRON_HELMET(Material.IRON_HELMET),
//	IRON_CHESTPLATE(Material.IRON_CHESTPLATE),
//	IRON_LEGGINGS(Material.IRON_LEGGINGS),
//	IRON_BOOTS(Material.IRON_BOOTS),
//	DIAMOND_HELMET(Material.DIAMOND_HELMET),
//	DIAMOND_CHESTPLATE(Material.DIAMOND_CHESTPLATE),
//	DIAMOND_LEGGINGS(Material.DIAMOND_LEGGINGS),
//	DIAMOND_BOOTS(Material.DIAMOND_BOOTS),
//	GOLD_HELMET(Material.GOLD_HELMET),
//	GOLD_CHESTPLATE(Material.GOLD_CHESTPLATE),
//	GOLD_LEGGINGS(Material.GOLD_LEGGINGS),
//	GOLD_BOOTS(Material.GOLD_BOOTS),
//	FLINT(Material.FLINT),
//	PORK(Material.PORK),
//	GRILLED_PORK(Material.GRILLED_PORK),
//	PAINTING(Material.PAINTING),
//	GOLDEN_APPLE(Material.GOLDEN_APPLE), //@@@
//	SIGN(Material.SIGN),
//	WOOD_DOOR(Material.WOOD_DOOR),
//	BUCKET(Material.BUCKET),
//	WATER_BUCKET(Material.WATER_BUCKET),
//	LAVA_BUCKET(Material.LAVA_BUCKET),
//	MINECART(Material.MINECART),
//	SADDLE(Material.SADDLE),
//	IRON_DOOR(Material.IRON_DOOR),
//	REDSTONE(Material.REDSTONE),
//	SNOW_BALL(Material.SNOW_BALL),
//	BOAT(Material.BOAT),
//	LEATHER(Material.LEATHER),
//	MILK_BUCKET(Material.MILK_BUCKET),
//	CLAY_BRICK(Material.CLAY_BRICK),
//	CLAY_BALL(Material.CLAY_BALL),
//	SUGAR_CANE(Material.SUGAR_CANE),
//	PAPER(Material.PAPER),
//	BOOK(Material.BOOK),
//	SLIME_BALL(Material.SLIME_BALL),
//	STORAGE_MINECART(Material.STORAGE_MINECART),
//	POWERED_MINECART(Material.POWERED_MINECART),
//	EGG(Material.EGG),
//	COMPASS(Material.COMPASS),
//	FISHING_ROD(Material.FISHING_ROD),
//	WATCH(Material.WATCH),
//	GLOWSTONE_DUST(Material.GLOWSTONE_DUST),
//	RAW_FISH(Material.RAW_FISH), //@@@
//	COOKED_FISH(Material.COOKED_FISH), //@@@
//	INK_SACK(Material.INK_SACK), //@@@
//	BONE(Material.BONE),
//	SUGAR(Material.SUGAR),
//	CAKE(Material.CAKE),
//	BED(Material.BED),
//	DIODE(Material.DIODE),
//	COOKIE(Material.COOKIE),
//	MAP(Material.MAP), //@@@
//	SHEARS(Material.SHEARS),
//	MELON(Material.MELON),
//	PUMPKIN_SEEDS(Material.PUMPKIN_SEEDS),
//	MELON_SEEDS(Material.MELON_SEEDS),
//	RAW_BEEF(Material.RAW_BEEF),
//	COOKED_BEEF(Material.COOKED_BEEF),
//	RAW_CHICKEN(Material.RAW_CHICKEN),
//	COOKED_CHICKEN(Material.COOKED_CHICKEN),
//	ROTTEN_FLESH(Material.ROTTEN_FLESH),
//	ENDER_PEARL(Material.ENDER_PEARL),
//	BLAZE_ROD(Material.BLAZE_ROD),
//	GHAST_TEAR(Material.GHAST_TEAR),
//	GOLD_NUGGET(Material.GOLD_NUGGET),
//	NETHER_STALK(Material.NETHER_STALK),
//	POTION(Material.POTION), //@@@
//	GLASS_BOTTLE(Material.GLASS_BOTTLE),
//	SPIDER_EYE(Material.SPIDER_EYE),
//	FERMENTED_SPIDER_EYE(Material.FERMENTED_SPIDER_EYE),
//	BLAZE_POWDER(Material.BLAZE_POWDER),
//	MAGMA_CREAM(Material.MAGMA_CREAM),
//	BREWING_STAND_ITEM(Material.BREWING_STAND_ITEM),
//	CAULDRON_ITEM(Material.CAULDRON_ITEM),
//	EYE_OF_ENDER(Material.EYE_OF_ENDER),
//	SPECKLED_MELON(Material.SPECKLED_MELON),
//	MONSTER_EGG(Material.MONSTER_EGG), //@@@
//	EXP_BOTTLE(Material.EXP_BOTTLE),
//	FIREBALL(Material.FIREBALL),
//	BOOK_AND_QUILL(Material.BOOK_AND_QUILL),
//	WRITTEN_BOOK(Material.WRITTEN_BOOK),
//	EMERALD(Material.EMERALD),
//	ITEM_FRAME(Material.ITEM_FRAME),
//	FLOWER_POT_ITEM(Material.FLOWER_POT_ITEM),
//	CARROT_ITEM(Material.CARROT_ITEM),
//	POTATO_ITEM(Material.POTATO_ITEM),
//	BAKED_POTATO(Material.BAKED_POTATO),
//	POISONOUS_POTATO(Material.POISONOUS_POTATO),
//	EMPTY_MAP(Material.EMPTY_MAP),
//	GOLDEN_CARROT(Material.GOLDEN_CARROT),
//	SKULL_ITEM(Material.SKULL_ITEM), //@@@
//	CARROT_STICK(Material.CARROT_STICK),
//	NETHER_STAR(Material.NETHER_STAR),
//	PUMPKIN_PIE(Material.PUMPKIN_PIE),
//	FIREWORK(Material.FIREWORK),
//	FIREWORK_CHARGE(Material.FIREWORK_CHARGE),
//	ENCHANTED_BOOK(Material.ENCHANTED_BOOK),
//	REDSTONE_COMPARATOR(Material.REDSTONE_COMPARATOR),
//	NETHER_BRICK_ITEM(Material.NETHER_BRICK_ITEM),
//	QUARTZ(Material.QUARTZ),
//	EXPLOSIVE_MINECART(Material.EXPLOSIVE_MINECART),
//	HOPPER_MINECART(Material.HOPPER_MINECART),
//	PRISMARINE_SHARD(Material.PRISMARINE_SHARD),
//	PRISMARINE_CRYSTALS(Material.PRISMARINE_CRYSTALS),
//	RABBIT(Material.RABBIT),
//	COOKED_RABBIT(Material.COOKED_RABBIT),
//	RABBIT_STEW(Material.RABBIT_STEW),
//	RABBIT_FOOT(Material.RABBIT_FOOT),
//	RABBIT_HIDE(Material.RABBIT_HIDE),
//	ARMOR_STAND(Material.ARMOR_STAND),
//	IRON_BARDING(Material.IRON_BARDING),
//	GOLD_BARDING(Material.GOLD_BARDING),
//	DIAMOND_BARDING(Material.DIAMOND_BARDING),
//	LEASH(Material.LEASH),
//	NAME_TAG(Material.NAME_TAG),
//	COMMAND_MINECART(Material.COMMAND_MINECART),
//	MUTTON(Material.MUTTON),
//	COOKED_MUTTON(Material.COOKED_MUTTON),
//	BANNER(Material.BANNER),
//	END_CRYSTAL(Material.END_CRYSTAL),
//	SPRUCE_DOOR_ITEM(Material.SPRUCE_DOOR_ITEM),
//	BIRCH_DOOR_ITEM(Material.BIRCH_DOOR_ITEM),
//	JUNGLE_DOOR_ITEM(Material.JUNGLE_DOOR_ITEM),
//	ACACIA_DOOR_ITEM(Material.ACACIA_DOOR_ITEM),
//	DARK_OAK_DOOR_ITEM(Material.DARK_OAK_DOOR_ITEM),
//	CHORUS_FRUIT(Material.CHORUS_FRUIT),
//	CHORUS_FRUIT_POPPED(Material.CHORUS_FRUIT_POPPED),
//	BEETROOT(Material.BEETROOT),
//	BEETROOT_SEEDS(Material.BEETROOT_SEEDS),
//	BEETROOT_SOUP(Material.BEETROOT_SOUP),
//	DRAGONS_BREATH(Material.DRAGONS_BREATH),
//	SPLASH_POTION(Material.SPLASH_POTION),
//	SPECTRAL_ARROW(Material.SPECTRAL_ARROW),
//	TIPPED_ARROW(Material.TIPPED_ARROW),
//	LINGERING_POTION(Material.LINGERING_POTION),
//	SHIELD(Material.SHIELD),
//	ELYTRA(Material.ELYTRA),
//	BOAT_SPRUCE(Material.BOAT_SPRUCE),
//	BOAT_BIRCH(Material.BOAT_BIRCH),
//	BOAT_JUNGLE(Material.BOAT_JUNGLE),
//	BOAT_ACACIA(Material.BOAT_ACACIA),
//	BOAT_DARK_OAK(Material.BOAT_DARK_OAK),
//	TOTEM(Material.TOTEM),
//	SHULKER_SHELL(Material.SHULKER_SHELL),
//	IRON_NUGGET(Material.IRON_NUGGET),
//	KNOWLEDGE_BOOK(Material.KNOWLEDGE_BOOK),
//	GOLD_RECORD(Material.GOLD_RECORD),
//	GREEN_RECORD(Material.GREEN_RECORD),
//	RECORD_3(Material.RECORD_3),
//	RECORD_4(Material.RECORD_4),
//	RECORD_5(Material.RECORD_5),
//	RECORD_6(Material.RECORD_6),
//	RECORD_7(Material.RECORD_7),
//	RECORD_8(Material.RECORD_8),
//	RECORD_9(Material.RECORD_9),
//	RECORD_10(Material.RECORD_10),
//	RECORD_11(Material.RECORD_11),
//	RECORD_12(Material.RECORD_12),
	/* at the end */ ;
	
	// CONSTRUCTORS
	private final MaterialData materialData;
//	private final Constructor<? extends MaterialData> materialData;
//	private static Material[] byId;
//	private static final Map<String, Material> BY_NAME;	
	
	// PUBLIC APIs
	public MaterialData getMaterialData() {
	    return this.materialData;//.getDeclaringClass();
	}
	
	public Material getMaterial() {
		return this.getMaterialData().getItemType();
	}
	
	@SuppressWarnings("deprecation")
	public boolean isItem() {
		return this.materialData.getItemTypeId() > 255;
	}
	
	@SuppressWarnings("deprecation")
	public boolean hasData() {
		return this.materialData.getData() > 0;
	}
	
	@SuppressWarnings("deprecation")
	private MaterialEx(MaterialData data) {
		assert(data.getItemTypeId() > 255);
		this.materialData = data;
	}

//	@SuppressWarnings("deprecation")
//	private MaterialEx(Material material, Class<? extends MaterialData> data) {
//		this.materialData = data;
//	}

	private MaterialEx(Material material) {
		this(new MaterialData(material));
	}
	
	@SuppressWarnings("deprecation")
	private MaterialEx(Material material, int data) {
		this(new MaterialData(material, (byte)data));
	}
	
	@SuppressWarnings("deprecation")
	private MaterialEx(Material material, DyeColor color) {
		this(new MaterialData(material, color.getDyeData()));
	}
	
	private MaterialEx(Material material, TreeSpecies species) {
		this(define(material, species, 0));
	}
	
	private MaterialEx(Material material, TreeSpecies species, int orWith) {
		this(define(material, species, orWith));
	}
	
	@SuppressWarnings("deprecation")
	private static MaterialData define(Material material, int data) {
		return new MaterialData(material, (byte)data);
	}
	
	@SuppressWarnings("deprecation")
	protected static MaterialData define(Material material, int data, int orWith) {
		return new MaterialData(material, (byte)(data + orWith));
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
				return define(Material.LEAVES, 0);
			case REDWOOD:
				return define(Material.LEAVES, 1);
			case BIRCH:
				return define(Material.LEAVES, 2);
			case JUNGLE:
				return define(Material.LEAVES, 3);
			case ACACIA:
				return define(Material.LEAVES_2, 0);
			case DARK_OAK:
				return define(Material.LEAVES_2, 1);
			default:
				return null;
			}
		case WOOD_STEP:
		case STEP: // this will be converted to the above
			switch (species) {
			case GENERIC:
				return define(Material.WOOD_STEP, 0, orWith);
			case REDWOOD:
				return define(Material.WOOD_STEP, 1, orWith);
			case BIRCH:
				return define(Material.WOOD_STEP, 2, orWith);
			case JUNGLE:
				return define(Material.WOOD_STEP, 3, orWith);
			case ACACIA:
				return define(Material.WOOD_STEP, 4, orWith);
			case DARK_OAK:
				return define(Material.WOOD_STEP, 5, orWith);
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
