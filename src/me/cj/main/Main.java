//If not working check the .addIngrediant function
package me.cj.main;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	static final Material[] woodTypes = { Material.OAK_WOOD, Material.SPRUCE_WOOD, Material.BIRCH_WOOD, Material.JUNGLE_WOOD, Material.ACACIA_WOOD, Material.DARK_OAK_WOOD };
	static final Material[] woodPlankTypes = { Material.OAK_PLANKS, Material.SPRUCE_PLANKS, Material.BIRCH_PLANKS, Material.JUNGLE_PLANKS, Material.ACACIA_PLANKS, Material.DARK_OAK_PLANKS };
	static final Material[] woodSlabTypes = { Material.OAK_SLAB, Material.SPRUCE_SLAB, Material.BIRCH_SLAB, Material.JUNGLE_SLAB, Material.ACACIA_SLAB, Material.DARK_OAK_SLAB };
	static final Material[] woolColors = { Material.WHITE_WOOL, Material.ORANGE_WOOL, Material.MAGENTA_WOOL, Material.LIGHT_BLUE_WOOL, Material.YELLOW_WOOL, Material.LIME_WOOL, Material.PINK_WOOL,
			Material.GRAY_WOOL, Material.LIGHT_GRAY_WOOL, Material.CYAN_WOOL, Material.PURPLE_WOOL, Material.BLUE_WOOL, Material.BROWN_WOOL, Material.GREEN_WOOL, Material.RED_WOOL,
			Material.BLACK_WOOL };

	static int numberOfRecipes;

	public void onEnable() {
		numberOfRecipes = 0;

		// Crafting
		chainedArmor();
		glowstoneToDust();
		goldenApple();
		grassBlock();
		itemFrameToLeather();
		jukeBox();
		lead();
		mossyCobbleToCobble();
		mossyCobbleWallToCobbleWall();
		mossyCobblestone();
		mossyStoneBrickToStoneBrick();
		nameTag();
		netherwartBlockToNetherwart();
		polishedAndesiteToAndesite();
		polishedDioriteToDiorite();
		polishedGraniteToGranite();
		quartzToNetherQuartz();
		rottenFleshToLeather();
		saddle();
		slabsToPlanks();
		slime();
		spiderweb();
		stoneBricks();
		wooltoString();
		zombieHeadToLeather();
		// Furnace
		goldSwordToGold();
		ironDoorToIron();
		
		getLogger().info(numberOfRecipes + " recipes loaded");
	}

	public void onDisable() {
		Bukkit.getServer().clearRecipes();
	}

	private void addRecipe(ShapedRecipe recipe) {
		Bukkit.getServer().addRecipe(recipe);
		numberOfRecipes++;
	}

	private void addRecipe(ShapelessRecipe recipe) {
		Bukkit.getServer().addRecipe(recipe);
		numberOfRecipes++;
	}

	private void addRecipe(FurnaceRecipe recipe) {
		Bukkit.getServer().addRecipe(recipe);
		numberOfRecipes++;
	}

	private void chainedArmor() {
		// Helmet
		ShapedRecipe ChainedHelmet = new ShapedRecipe(new NamespacedKey(this, "ChainedHelmet"), new ItemStack(Material.CHAINMAIL_HELMET));
		ChainedHelmet.shape(new String[] { "###", "# #", "   " }).setIngredient('#', Material.IRON_BARS);
		addRecipe(ChainedHelmet);
		// Chest
		ShapedRecipe ChainedChestplate = new ShapedRecipe(new NamespacedKey(this, "ChainedChestPlate"), new ItemStack(Material.CHAINMAIL_CHESTPLATE));
		ChainedChestplate.shape(new String[] { "# #", "###", "###" }).setIngredient('#', Material.IRON_BARS);
		addRecipe(ChainedChestplate);
		// Leggings
		ShapedRecipe ChainedLeggings = new ShapedRecipe(new NamespacedKey(this, "ChainedLeggings"), new ItemStack(Material.CHAINMAIL_LEGGINGS));
		ChainedLeggings.shape(new String[] { "###", "# #", "# #" }).setIngredient('#', Material.IRON_BARS);
		addRecipe(ChainedLeggings);
		// Boots
		ShapedRecipe ChainedBoots = new ShapedRecipe(new NamespacedKey(this, "ChainedBoots"), new ItemStack(Material.CHAINMAIL_BOOTS));
		ChainedBoots.shape(new String[] { "   ", "# #", "# #" }).setIngredient('#', Material.IRON_BARS);
		addRecipe(ChainedBoots);
	}

	private void glowstoneToDust() {
		ShapelessRecipe glowstonedust = new ShapelessRecipe(new NamespacedKey(this, "GlowstoneToDust"), new ItemStack(Material.GLOWSTONE_DUST, 4));
		glowstonedust.addIngredient(Material.GLOWSTONE);
		addRecipe(glowstonedust);
	}

	private void goldSwordToGold() {
		FurnaceRecipe GoldSwordToGold = new FurnaceRecipe(new NamespacedKey(this, "GoldSwordToGold"), new ItemStack(Material.GOLD_INGOT, 2), Material.GOLDEN_SWORD, 5, 120);
		addRecipe(GoldSwordToGold);
	}

	private void goldenApple() {
		ShapedRecipe GoldenApple = new ShapedRecipe(new NamespacedKey(this, "GoldenApple"), new ItemStack(Material.GOLDEN_APPLE));
		GoldenApple.shape(new String[] { "###", "#^#", "###" }).setIngredient('#', Material.GOLD_NUGGET).setIngredient('^', Material.APPLE);
		addRecipe(GoldenApple);
	}

	private void grassBlock() {
		String shapes[][] = { { "^  ", "#  ", "   " }, { " ^ ", " # ", "   " }, { "  ^", "  #", "   " }, { "   ", "^  ", "#  " }, { "   ", " ^ ", " # " }, { "   ", "  ^", "  #" } };

		for (int shapeNum = 0; shapeNum < shapes.length; shapeNum++) {
			ShapedRecipe grass = new ShapedRecipe(new NamespacedKey(this, "grass" + shapeNum), new ItemStack(Material.GRASS_BLOCK));
			grass.shape(shapes[shapeNum]).setIngredient('^', Material.WHEAT_SEEDS).setIngredient('#', Material.DIRT);
			addRecipe(grass);
		}
	}

	private void ironDoorToIron() {
		String name = "IronDoorToIron";
		FurnaceRecipe IronDoorToIron = new FurnaceRecipe(new NamespacedKey(this, name), new ItemStack(Material.IRON_INGOT, 2), Material.IRON_DOOR, 5, 200);
		addRecipe(IronDoorToIron);
	}

	private void itemFrameToLeather() {
		ShapelessRecipe FrameToLeather = new ShapelessRecipe(new NamespacedKey(this, "FrameToLeather"), new ItemStack(Material.LEATHER));
		FrameToLeather.addIngredient(Material.ITEM_FRAME);
		addRecipe(FrameToLeather);
	}

	private void jukeBox() {
		for (int woodType = 0; woodType < woodPlankTypes.length; woodType++) {
			ShapedRecipe jukebox = new ShapedRecipe(new NamespacedKey(this, "Jukebox" + woodType), new ItemStack(Material.JUKEBOX));
			jukebox.shape(new String[] { "# #", "#@#", "###" }).setIngredient('#', woodPlankTypes[woodType]).setIngredient('@', Material.REDSTONE);
			addRecipe(jukebox);
		}
	}

	private void lead() {
		String[] shape = { " ##", " ##", "#  " };
		String name = "lead";
		ShapedRecipe lead = new ShapedRecipe(new NamespacedKey(this, name), new ItemStack(Material.LEAD));
		lead.shape(shape).setIngredient('#', Material.STRING);
		addRecipe(lead);
	}

	private void mossyCobbleToCobble() {
		ShapelessRecipe msbtsb = new ShapelessRecipe(new NamespacedKey(this, "mossyCobbleToCobble"), new ItemStack(Material.COBBLESTONE));
		msbtsb.addIngredient(Material.MOSSY_COBBLESTONE);
		addRecipe(msbtsb);
	}

	private void mossyCobbleWallToCobbleWall() {
		ShapelessRecipe MossyCobbleWallToCobbleWall = new ShapelessRecipe(new NamespacedKey(this, "MossyCobbleWallToCobbleWall"), new ItemStack(Material.COBBLESTONE_WALL));
		MossyCobbleWallToCobbleWall.addIngredient(Material.MOSSY_COBBLESTONE_WALL);
		addRecipe(MossyCobbleWallToCobbleWall);
	}

	private void mossyCobblestone() {
		ShapedRecipe mossyCobblestone = new ShapedRecipe(new NamespacedKey(this, "cobbleToMossyCobble"), new ItemStack(Material.MOSSY_COBBLESTONE, 5));
		mossyCobblestone.shape(new String[] { "#^#", "^#^", "#^#" }).setIngredient('#', Material.COBBLESTONE).setIngredient('^', Material.WHEAT_SEEDS);
		addRecipe(mossyCobblestone);
	}

	private void mossyStoneBrickToStoneBrick() {
		// Mossy Stone Brick to Stone Brick
		ShapelessRecipe msbtsb = new ShapelessRecipe(new NamespacedKey(this, "mossyStoneBrickToStoneBrick"), new ItemStack(Material.STONE_BRICKS));
		msbtsb.addIngredient(Material.MOSSY_STONE_BRICKS);
		addRecipe(msbtsb);
	}

	private void nameTag() {
		ShapelessRecipe nametag = new ShapelessRecipe(new NamespacedKey(this, "Nametag"), new ItemStack(Material.NAME_TAG));
		nametag.addIngredient(Material.IRON_INGOT).addIngredient(Material.STRING);
		addRecipe(nametag);
	}

	private void netherwartBlockToNetherwart() {
		ShapelessRecipe NetherwartBlockToNetherwart = new ShapelessRecipe(new NamespacedKey(this, "NetherwartBlockToNetherwart"), new ItemStack(Material.NETHER_WART, 9));
		NetherwartBlockToNetherwart.addIngredient(Material.NETHER_WART_BLOCK);
		addRecipe(NetherwartBlockToNetherwart);
	}

	private void polishedAndesiteToAndesite() {
		ShapelessRecipe PolishedAndesiteToAndesite = new ShapelessRecipe(new NamespacedKey(this, "PolishedAndesiteToAndesite"), new ItemStack(Material.ANDESITE));
		PolishedAndesiteToAndesite.addIngredient(Material.POLISHED_ANDESITE);
		addRecipe(PolishedAndesiteToAndesite);
	}

	private void polishedDioriteToDiorite() {
		ShapelessRecipe PolishedDioriteToDiorite = new ShapelessRecipe(new NamespacedKey(this, "PolishedDioriteToDiorite"), new ItemStack(Material.DIORITE));
		PolishedDioriteToDiorite.addIngredient(Material.DIORITE);
		addRecipe(PolishedDioriteToDiorite);
	}

	private void polishedGraniteToGranite() {
		ShapelessRecipe PolishedGraniteToGranite = new ShapelessRecipe(new NamespacedKey(this, "PolishedGraniteToGranite"), new ItemStack(Material.GRANITE));
		PolishedGraniteToGranite.addIngredient(Material.POLISHED_GRANITE);
		addRecipe(PolishedGraniteToGranite);
	}

	private void quartzToNetherQuartz() {
		ShapelessRecipe QuartsNetherQuartz = new ShapelessRecipe(new NamespacedKey(this, "QuartzToNetherQuartz"), new ItemStack(Material.QUARTZ, 4));
		QuartsNetherQuartz.addIngredient(Material.QUARTZ_BLOCK);
		addRecipe(QuartsNetherQuartz);
	}

	private void rottenFleshToLeather() {
		String[][] shapes = { { "###", "   ", "   " }, { "   ", "###", "   " }, { "   ", "   ", "###" }, { "#  ", "#  ", "#  " }, { " # ", " # ", " # " }, { "  #", "  #", "  #" } };
		String name = "Leather";

		for (int shape = 0; shape < shapes.length; shape++) {
			ShapedRecipe leather = new ShapedRecipe(new NamespacedKey(this, name + shape), new ItemStack(Material.LEATHER));
			leather.shape(shapes[shape]).setIngredient('#', Material.ROTTEN_FLESH);
			addRecipe(leather);
		}
	}

	private void saddle() {
		ShapedRecipe saddle = new ShapedRecipe(new NamespacedKey(this, "Saddle"), new ItemStack(Material.SADDLE));
		saddle.shape(new String[] { "###", "! !", "# #" }).setIngredient('#', Material.LEATHER).setIngredient('!', Material.STRING);
		addRecipe(saddle);
	}

	private void slabsToPlanks() {
		String[][] shapes = { { "#  ", "#  ", "   " }, { " # ", " # ", "   " }, { "  #", "  #", "   " }, { "   ", "#  ", "#  " }, { "   ", " # ", " # " }, { "   ", "  #", "  #" } };

		int recipieNum = 1;

		for (int woodType = 0; woodType < woodPlankTypes.length; woodType++) {
			for (int shape = 0; shape < shapes.length; shape++) {
				ShapedRecipe plank = new ShapedRecipe(new NamespacedKey(this, "Plank" + recipieNum), new ItemStack(woodPlankTypes[woodType]));
				plank.shape(shapes[shape]).setIngredient('#', woodSlabTypes[woodType]);
				addRecipe(plank);
				recipieNum++;
			}
		}
	}

	private void slime() {
		ShapelessRecipe slimeball = new ShapelessRecipe(new NamespacedKey(this, "Slime"), new ItemStack(Material.SLIME_BALL));
		slimeball.addIngredient(Material.VINE);
		addRecipe(slimeball);
	}

	private void spiderweb() {
		ShapedRecipe SpiderWeb = new ShapedRecipe(new NamespacedKey(this, "spiderweb"), new ItemStack(Material.COBWEB));
		SpiderWeb.shape(new String[] { "# #", " # ", "# #" }).setIngredient('#', Material.STRING);
		addRecipe(SpiderWeb);
	}

	private void stoneBricks() {
		Material[] bricks = { Material.STONE_BRICKS, Material.CRACKED_STONE_BRICKS, Material.CHISELED_STONE_BRICKS };

		// Stone Brick / Cracked Brick / Chiseled Brick to Cobblestone
		for (int brick = 0; brick < bricks.length; brick++) {
			ShapelessRecipe stoneBrickToCobbleStoneBrick = new ShapelessRecipe(new NamespacedKey(this, "BrickToCobblestone" + brick), new ItemStack(Material.COBBLESTONE));
			stoneBrickToCobbleStoneBrick.addIngredient(bricks[brick]);
			addRecipe(stoneBrickToCobbleStoneBrick);
		}
	}

	private void wooltoString() {
		// Wool to string
		for (int woolColor = 0; woolColor < woolColors.length; woolColor++) {
			ShapelessRecipe string = new ShapelessRecipe(new NamespacedKey(this, "WoolToString" + woolColor), new ItemStack(Material.STRING, 4));
			string.addIngredient(woolColors[woolColor]);
			addRecipe(string);
		}
	}

	private void zombieHeadToLeather() {
		ShapelessRecipe zombieHeadToLeather = new ShapelessRecipe(new NamespacedKey(this, "ZombieHeadToLeather"), new ItemStack(Material.LEATHER, 2));
		zombieHeadToLeather.addIngredient(Material.ZOMBIE_HEAD);
		addRecipe(zombieHeadToLeather);
	}
}