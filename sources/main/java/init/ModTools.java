package init;

import com.Cmonster03.OreMod.Reference;

import items.ItemModAxe;
import items.ItemModHoe;
import items.ItemModPickaxe;
import items.ItemModShovel;
import items.ItemModSword;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModTools {
	
	public static final ToolMaterial lithium_material = EnumHelper.addToolMaterial(Reference.MOD_ID + ":lithium", 1, 150, 6.0F, 1.0F, 25);
	public static final ToolMaterial opal_material = EnumHelper.addToolMaterial(Reference.MOD_ID + ":opal", 3, 700, 7.0F, 2.0F, 10);
	
	public static ItemPickaxe lithium_pickaxe;
	public static ItemModAxe lithium_axe;
	public static ItemHoe lithium_hoe;
	public static ItemSpade lithium_shovel;
	public static ItemSword lithium_sword;
	public static ItemPickaxe opal_pickaxe;
	public static ItemModAxe opal_axe;
	public static ItemHoe opal_hoe;
	public static ItemSpade opal_shovel;
	public static ItemSword opal_sword;
	
	public static void init() {
		lithium_pickaxe = new ItemModPickaxe(lithium_material, "lithium_pickaxe");
		lithium_axe = new ItemModAxe(lithium_material, "lithium_axe");
		lithium_hoe = new ItemModHoe(lithium_material, "lithium_hoe");
		lithium_shovel = new ItemModShovel(lithium_material, "lithium_shovel");
		lithium_sword = new ItemModSword(lithium_material, "lithium_sword");
		opal_pickaxe = new ItemModPickaxe(opal_material, "opal_pickaxe");
		opal_axe = new ItemModAxe(opal_material, "opal_axe");
		opal_hoe = new ItemModHoe(opal_material, "opal_hoe");
		opal_shovel = new ItemModShovel(opal_material, "opal_shovel");
		opal_sword = new ItemModSword(opal_material, "opal_sword");
		
	}
	
	public static void register() {
		GameRegistry.register(lithium_pickaxe);
		GameRegistry.register(lithium_axe);
		GameRegistry.register(lithium_hoe);
		GameRegistry.register(lithium_shovel);
		GameRegistry.register(lithium_sword);
		GameRegistry.register(opal_pickaxe);
		GameRegistry.register(opal_axe);
		GameRegistry.register(opal_hoe);
		GameRegistry.register(opal_shovel);
		GameRegistry.register(opal_sword);
	}
	
	public static void registerRenders(){
		registerRender (lithium_pickaxe);
		registerRender (lithium_axe);
		registerRender (lithium_hoe);
		registerRender (lithium_shovel);
		registerRender (lithium_sword);
		registerRender (opal_pickaxe);
		registerRender (opal_axe);
		registerRender (opal_hoe);
		registerRender (opal_shovel);
		registerRender (opal_sword);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}



