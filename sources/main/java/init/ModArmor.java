package init;

import com.Cmonster03.OreMod.Reference;

import items.ItemModArmor;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModArmor {
	
	public static ArmorMaterial lithium_material = EnumHelper.addArmorMaterial("lithium", Reference.MOD_ID + ":lithium", 15, new int[] {2,5,4,1}, 25, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F);
	public static ArmorMaterial opal_material = EnumHelper.addArmorMaterial("opal", Reference.MOD_ID + ":opal", 25, new int[] {2,7,5,2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
	
	public static ItemArmor lithium_helmet;
	public static ItemArmor lithium_chestplate;
	public static ItemArmor lithium_leggings;
	public static ItemArmor lithium_boots;
	public static ItemArmor opal_helmet;
	public static ItemArmor opal_chestplate;
	public static ItemArmor opal_leggings;
	public static ItemArmor opal_boots;
	
	public static void init() {
		lithium_helmet = new ItemModArmor(lithium_material, 1, EntityEquipmentSlot.HEAD, "lithium_helmet");
		lithium_chestplate = new ItemModArmor(lithium_material, 1, EntityEquipmentSlot.CHEST, "lithium_chestplate");
		lithium_leggings = new ItemModArmor(lithium_material, 2, EntityEquipmentSlot.LEGS, "lithium_leggings");
		lithium_boots = new ItemModArmor(lithium_material, 1, EntityEquipmentSlot.FEET, "lithium_boots");
		opal_helmet = new ItemModArmor(opal_material, 1, EntityEquipmentSlot.HEAD, "opal_helmet");
		opal_chestplate = new ItemModArmor(opal_material, 1, EntityEquipmentSlot.CHEST, "opal_chestplate");
		opal_leggings = new ItemModArmor(opal_material, 2, EntityEquipmentSlot.LEGS, "opal_leggings");
		opal_boots = new ItemModArmor(opal_material, 1, EntityEquipmentSlot.FEET, "opal_boots");
		
	}
	
	public static void register(){
		GameRegistry.register(lithium_helmet);
		GameRegistry.register(lithium_chestplate);
		GameRegistry.register(lithium_leggings);
		GameRegistry.register(lithium_boots);
		GameRegistry.register(opal_helmet);
		GameRegistry.register(opal_chestplate);
		GameRegistry.register(opal_leggings);
		GameRegistry.register(opal_boots);
		
	}
	
	public static void registerRenders() {
		registerRender (lithium_helmet);
		registerRender (lithium_chestplate);
		registerRender (lithium_leggings);
		registerRender (lithium_boots);
		registerRender (opal_helmet);
		registerRender (opal_chestplate);
		registerRender (opal_leggings);
		registerRender (opal_boots);
		
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
