//If not working check the .addIngrediant function
package me.cj.main;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	// @SuppressWarnings("deprecation")

	public void onEnable() {

		// Crafting Table
		RottenFleshToLeather();
		Lead();
		Slime();
		NameTag();
		JukeBox();
		Saddle();
		QuartzToNetherQuartz();
		GlowstoneToDust();
		Grass();
		Mossy_Cobblestone();
		StoneBricks();
		PackedIce();
		GoldenApple();
		WooltoString();
		ChainedArmor();
		MossyCobbleWallToCobbleWall();
		PolishedGraniteToGranite();
		PolishedDioriteToDiorite();
		PolishedAndesiteToAndesite();
		NetherwartBlockToNetherwart();
		Spiderweb();
		SlabsToPlank();
		ItemFrameToLeather();
		// Furnace
		GoldSwordToGold();
		IronDoorToIron();

	}

	private void ItemFrameToLeather() {
		NamespacedKey key = new NamespacedKey(this, "leather");
		ShapelessRecipe FrameToLeather = new ShapelessRecipe(key, new ItemStack(Material.LEATHER));
		FrameToLeather.addIngredient(Material.ITEM_FRAME);
		Bukkit.addRecipe(FrameToLeather);
	}

	@SuppressWarnings("deprecation")
	private void SlabsToPlank() {
		String shapes[][] = { { "#  ", "#  ", "   " }, { " # ", " # ", "   " }, { "  #", "  #", "   " }, { "   ", "#  ", "#  " }, { "   ", " # ", " # " }, { "   ", "  #", "  #" } };

		for (int woodByte = 0; woodByte < 6; woodByte++) {
			for (int shapeNum = 0; shapeNum < 6; shapeNum++) {
				ShapedRecipe WoodToSlab = new ShapedRecipe(new ItemStack(Material.WOOD, 1, (short) 0, (byte) woodByte));
				WoodToSlab.shape(shapes[shapeNum]).setIngredient('#', Material.WOOD_STEP, (byte) woodByte);
				Bukkit.getServer().addRecipe(WoodToSlab);
			}
		}
	}

	private void Spiderweb() {
		ShapedRecipe SpiderWeb = new ShapedRecipe(new ItemStack(Material.WEB));
		SpiderWeb.shape(new String[] { "# #", " # ", "# #" }).setIngredient('#', Material.STRING);
		Bukkit.getServer().addRecipe(SpiderWeb);
	}

	private void NetherwartBlockToNetherwart() {
		ShapelessRecipe NetherwartBlockToNetherwart = new ShapelessRecipe(new ItemStack(Material.NETHER_WARTS, 9));
		NetherwartBlockToNetherwart.addIngredient(Material.APPLE);
		Bukkit.getServer().addRecipe(NetherwartBlockToNetherwart);
	}

	private void IronDoorToIron() {
		FurnaceRecipe IronDoorToIron = new FurnaceRecipe(new ItemStack(Material.IRON_INGOT, 2), Material.IRON_DOOR);
		Bukkit.getServer().addRecipe(IronDoorToIron);
	}

	private void GoldSwordToGold() {
		FurnaceRecipe GoldSwordToGold = new FurnaceRecipe(new ItemStack(Material.GOLD_INGOT, 2), Material.GOLD_SWORD);
		Bukkit.getServer().addRecipe(GoldSwordToGold);
	}

	@SuppressWarnings("deprecation")
	private void PolishedAndesiteToAndesite() {
		ShapelessRecipe PolishedAndesiteToAndesite = new ShapelessRecipe(new ItemStack(Material.STONE, 1, (byte) 5));
		PolishedAndesiteToAndesite.addIngredient(Material.STONE, (byte) 6);
		Bukkit.getServer().addRecipe(PolishedAndesiteToAndesite);
	}

	@SuppressWarnings("deprecation")
	private void PolishedGraniteToGranite() {
		ShapelessRecipe PolishedGraniteToGranite = new ShapelessRecipe(new ItemStack(Material.STONE, 1, (byte) 1));
		PolishedGraniteToGranite.addIngredient(Material.STONE, (byte) 2);
		Bukkit.getServer().addRecipe(PolishedGraniteToGranite);

	}

	@SuppressWarnings("deprecation")
	private void PolishedDioriteToDiorite() {
		ShapelessRecipe PolishedDioriteToDiorite = new ShapelessRecipe(new ItemStack(Material.STONE, 1, (byte) 3));
		PolishedDioriteToDiorite.addIngredient(Material.STONE, (byte) 4);
		Bukkit.getServer().addRecipe(PolishedDioriteToDiorite);

	}

	@SuppressWarnings("deprecation")
	private void MossyCobbleWallToCobbleWall() {
		ShapelessRecipe MossyCobbleWallToCobbleWall = new ShapelessRecipe(new ItemStack(Material.COBBLE_WALL));
		MossyCobbleWallToCobbleWall.addIngredient(Material.COBBLE_WALL, (byte) 1);
		Bukkit.getServer().addRecipe(MossyCobbleWallToCobbleWall);
	}

	private void ChainedArmor() {
		// Helmet
		ShapedRecipe ChainedHelmet = new ShapedRecipe(new ItemStack(Material.CHAINMAIL_HELMET));
		ChainedHelmet.shape(new String[] { "###", "# #", "   " }).setIngredient('#', Material.IRON_FENCE);
		Bukkit.getServer().addRecipe(ChainedHelmet);
		// Chest
		ShapedRecipe ChainedChestplate = new ShapedRecipe(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
		ChainedChestplate.shape(new String[] { "# #", "###", "###" }).setIngredient('#', Material.IRON_FENCE);
		Bukkit.getServer().addRecipe(ChainedChestplate);
		// Leggings
		ShapedRecipe ChainedLeggings = new ShapedRecipe(new ItemStack(Material.CHAINMAIL_LEGGINGS));
		ChainedLeggings.shape(new String[] { "###", "# #", "# #" }).setIngredient('#', Material.IRON_FENCE);
		Bukkit.getServer().addRecipe(ChainedLeggings);
		// Boots
		ShapedRecipe ChainedBoots = new ShapedRecipe(new ItemStack(Material.CHAINMAIL_BOOTS));
		ChainedBoots.shape(new String[] { "   ", "# #", "# #" }).setIngredient('#', Material.IRON_FENCE);
		Bukkit.getServer().addRecipe(ChainedBoots);
	}

	@SuppressWarnings("deprecation")
	private void WooltoString() {
		// Wool to string
		for (int woolColorByte = 0; woolColorByte < 16; woolColorByte++) {
			ShapelessRecipe string = new ShapelessRecipe(new ItemStack(Material.STRING, 4));
			string.addIngredient(Material.WOOL, (byte) woolColorByte);
			Bukkit.getServer().addRecipe(string);
		}
	}

	private void GoldenApple() {
		ShapedRecipe GoldenApple = new ShapedRecipe(new ItemStack(Material.GOLDEN_APPLE));
		GoldenApple.shape(new String[] { "###", "#^#", "###" }).setIngredient('#', Material.GOLD_NUGGET).setIngredient('^', Material.APPLE);
		Bukkit.getServer().addRecipe(GoldenApple);
	}

	private void PackedIce() {
		String shapes[][] = { { "## ", "## ", "   " }, { " ##", " ##", "   " }, { "   ", "## ", "##" }, { "   ", " ##", " ##" } };

		for (int shapeNum = 0; shapeNum < 4; shapeNum++) {
			ShapedRecipe PackedIce = new ShapedRecipe(new ItemStack(Material.PACKED_ICE));
			PackedIce.shape(shapes[shapeNum]).setIngredient('#', Material.ICE);
			Bukkit.getServer().addRecipe(PackedIce);
		}
	}

	@SuppressWarnings("deprecation")
	private void StoneBricks() {
		// -----Stone Bricks-----
		/*
		 * Stone Brick (byte) 0 // Mossy - (byte) 1 // Cracked - (byte) 2 //
		 * Chiseled - (byte)3
		 */

		for (int smoothBrickByte = 0; smoothBrickByte < 4; smoothBrickByte++) {
			ShapelessRecipe stoneBrickToCobbleStoneBrick = new ShapelessRecipe(new ItemStack(Material.COBBLESTONE));
			stoneBrickToCobbleStoneBrick.addIngredient(Material.SMOOTH_BRICK, (byte) smoothBrickByte);
			Bukkit.getServer().addRecipe(stoneBrickToCobbleStoneBrick);
			if (smoothBrickByte == 0) { // Skips the mossy stone brick
				smoothBrickByte++;
			}
		}

		// Mossy Stone Brick to Stone Brick
		ShapelessRecipe msbtsb = new ShapelessRecipe(new ItemStack(Material.SMOOTH_BRICK));
		msbtsb.addIngredient(Material.SMOOTH_BRICK, (byte) 1);
		Bukkit.getServer().addRecipe(msbtsb);
	}

	private void Mossy_Cobblestone() {
		ShapedRecipe mossyCobblestone = new ShapedRecipe(new ItemStack(Material.MOSSY_COBBLESTONE, 5));
		mossyCobblestone.shape(new String[] { "#^#", "^#^", "#^#" }).setIngredient('#', Material.COBBLESTONE).setIngredient('^', Material.SEEDS);
		Bukkit.getServer().addRecipe(mossyCobblestone);
	}

	private void Grass() {
		String shapes[][] = { { "^  ", "#  ", "   " }, { " ^ ", " # ", "   " }, { "  ^", "  #", "   " }, { "   ", "^  ", "#  " }, { "   ", " ^ ", " # " }, { "   ", "  ^", "  #" } };

		for (int shapeNum = 0; shapeNum < 6; shapeNum++) {
			ShapedRecipe grass1 = new ShapedRecipe(new ItemStack(Material.GRASS));
			grass1.shape(shapes[shapeNum]).setIngredient('^', Material.SEEDS).setIngredient('#', Material.DIRT);
			Bukkit.getServer().addRecipe(grass1);
		}
	}

	private void GlowstoneToDust() {
		ShapelessRecipe glowstonedust = new ShapelessRecipe(new ItemStack(Material.GLOWSTONE_DUST, 4));
		glowstonedust.addIngredient(Material.GLOWSTONE);
		Bukkit.getServer().addRecipe(glowstonedust);
	}

	private void QuartzToNetherQuartz() {
		ShapelessRecipe QuartsNetherQuartz = new ShapelessRecipe(new ItemStack(Material.QUARTZ, 4));
		QuartsNetherQuartz.addIngredient(Material.QUARTZ_BLOCK);
		Bukkit.getServer().addRecipe(QuartsNetherQuartz);
	}

	private void Saddle() {
		ShapedRecipe saddle = new ShapedRecipe(new ItemStack(Material.SADDLE));
		saddle.shape(new String[] { "###", "! !", "# #" }).setIngredient('#', Material.LEATHER).setIngredient('!', Material.STRING);
		Bukkit.getServer().addRecipe(saddle);
	}

	@SuppressWarnings("deprecation")
	private void JukeBox() {
		for (int woodType = 0; woodType < 6; woodType++) {
			ShapedRecipe jukebox = new ShapedRecipe(new ItemStack(Material.JUKEBOX));
			jukebox.shape(new String[] { "# #", "#@#", "###" }).setIngredient('#', Material.WOOD, (byte) woodType).setIngredient('@', Material.REDSTONE);
			Bukkit.getServer().addRecipe(jukebox);
		}
	}

	private void NameTag() {
		ShapelessRecipe nametag = new ShapelessRecipe(new ItemStack(Material.NAME_TAG));
		nametag.addIngredient(Material.IRON_INGOT).addIngredient(Material.STRING);
		Bukkit.getServer().addRecipe(nametag);
	}

	private void Slime() {
		ShapelessRecipe slimeball = new ShapelessRecipe(new ItemStack(Material.SLIME_BALL));
		slimeball.addIngredient(Material.VINE);
		Bukkit.getServer().addRecipe(slimeball);

	}

	private void Lead() {
		ShapedRecipe lead = new ShapedRecipe(new ItemStack(Material.LEASH));
		lead.shape(new String[] { "## ", "## ", "  #" }).setIngredient('#', Material.STRING);
		Bukkit.getServer().addRecipe(lead);

	}

	// Leather Recipies
	private void RottenFleshToLeather() {
		String shapes[][] = { { "###", "   ", "   " }, { "   ", "###", "   " }, { "   ", "   ", "###" }, { "#  ", "#  ", "#  " }, { " # ", " # ", " # " }, { "  #", "  #", "  #" },
				{ "#  ", " # ", "  #" }, { "  #", " # ", "#  " } };

		for (int shapeNum = 0; shapeNum < 8; shapeNum++) {
			ShapedRecipe leather = new ShapedRecipe(new ItemStack(Material.LEATHER));
			leather.shape(shapes[shapeNum]).setIngredient('#', Material.ROTTEN_FLESH);
			Bukkit.getServer().addRecipe(leather);
		}
	}

	public void onDisable() {
		Bukkit.getServer().clearRecipes();
	}

	public ItemStack setName(ItemStack is, String name) {
		ItemMeta m = is.getItemMeta();
		m.setDisplayName(name);
		is.setItemMeta(m);
		return is;
	}
}
