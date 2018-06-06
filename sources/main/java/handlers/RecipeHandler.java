package handlers;

import init.ModArmor;
import init.ModBlocks;
import init.ModItems;
import init.ModTools;
import items.ItemModAxe;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;
import util.Utils;

public class RecipeHandler {
	
	public static void registerCraftingRecipes() {
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.lithium_block), "LLL", "LLL", "LLL", 'L', ModItems.lithium_ingot);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.lithium_ingot, 9), ModBlocks.lithium_block);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.lithium_apple), "LLL", "LAL", "LLL", 'L', ModItems.lithium_ingot, 'A', Items.APPLE);
		Utils.getLogger().info("registered crafting recipes");
		registerToolRecipe(ModTools.lithium_pickaxe, ModTools.lithium_axe, ModTools.lithium_hoe, ModTools.lithium_shovel, ModTools.lithium_sword, ModItems.lithium_ingot);
		registerToolRecipe(ModTools.opal_pickaxe, ModTools.opal_axe, ModTools.opal_hoe, ModTools.opal_shovel, ModTools.opal_sword, ModItems.opal);
		registerArmorRecipe(ModArmor.lithium_helmet, ModArmor.lithium_chestplate, ModArmor.lithium_leggings, ModArmor.lithium_boots, ModItems.lithium_ingot);
		registerArmorRecipe(ModArmor.opal_helmet, ModArmor.opal_chestplate, ModArmor.opal_leggings, ModArmor.opal_boots, ModItems.opal);
	}

	public static void registerFurnaceRecipes() {
		
		Utils.getLogger().info("registered furnace recipes");
		GameRegistry.addSmelting(ModBlocks.lithium_ore, new ItemStack(ModItems.lithium_ingot), 1F);
		GameRegistry.addSmelting(ModBlocks.opal_ore, new ItemStack(ModItems.opal), 0F);
		
	}
	
	public static void registerToolRecipe(Item pickaxe, Item axe, Item hoe, Item shovel, Item sword, Item ingot) {
		GameRegistry.addRecipe(new ItemStack(pickaxe), new Object[] {"III"," S "," S ", 'I', ingot, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(axe), new Object[] {" II"," SI"," S ", 'I', ingot, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(axe), new Object[] {"II ","IS "," S ", 'I', ingot, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(hoe), new Object[] {"II "," S "," S ", 'I', ingot, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(hoe), new Object[] {" II"," S "," S ", 'I', ingot, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(shovel), new Object[] {" I "," S "," S ", 'I', ingot, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(shovel), new Object[] {"I  ","S  ","S  ", 'I', ingot, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(shovel), new Object[] {"  I","  S","  S", 'I', ingot, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(sword), new Object[] {" I "," I "," S ", 'I', ingot, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(sword), new Object[] {"I  ","I  ","S  ", 'I', ingot, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(sword), new Object[] {"  I","  I","  S", 'I', ingot, 'S', Items.STICK });
	}
	
	public static void registerArmorRecipe(Item helmet, Item chestplate, Item leggings, Item boots, Item ingot) {
		GameRegistry.addRecipe(new ItemStack(helmet), new Object[] { "III","I I","   ",'I',ingot});
		GameRegistry.addRecipe(new ItemStack(helmet), new Object[] { "   ","III","I I",'I',ingot});
		GameRegistry.addRecipe(new ItemStack(chestplate), new Object[] { "I I","III","III",'I',ingot});
		GameRegistry.addRecipe(new ItemStack(leggings), new Object[] { "III","I I","I I",'I',ingot});
		GameRegistry.addRecipe(new ItemStack(boots), new Object[] { "I I","I I","   ",'I',ingot});
		GameRegistry.addRecipe(new ItemStack(boots), new Object[] { "   ","I I","I I",'I',ingot});
	}
}
