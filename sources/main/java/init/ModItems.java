package init;

import com.Cmonster03.OreMod.Reference;

import items.ItemBeryllium_ingot;
import items.ItemLithium_ingot;
import items.ItemModFood;
import items.ItemOpal;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item lithium_ingot;
	public static Item lithium_apple;
	public static Item beryllium_ingot;
	public static Item opal;

	public static void init() {
		lithium_ingot = new ItemLithium_ingot();
		beryllium_ingot = new ItemBeryllium_ingot();
		lithium_apple = new ItemModFood("lithium_apple", 6, 6, false, new PotionEffect(Potion.getPotionById(10), 50, 255), new PotionEffect(Potion.getPotionById(22), 600, 255));
		opal = new ItemOpal();
	}

	public static void register() {
		GameRegistry.register(lithium_ingot);
		GameRegistry.register(lithium_apple);
		GameRegistry.register(beryllium_ingot);
		GameRegistry.register(opal);
	}
	
	public static void registerRenders() {
		registerRender (lithium_ingot);
		registerRender (lithium_apple);
		registerRender (beryllium_ingot);
		registerRender (opal);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
