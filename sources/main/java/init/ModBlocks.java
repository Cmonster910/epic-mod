package init;

import net.minecraft.block.Block;

import com.Cmonster03.OreMod.blocks.BlockLithium_block;
import com.Cmonster03.OreMod.blocks.BlockLithium_ore;
import com.Cmonster03.OreMod.blocks.BlockOpal_ore;

import items.ItemBeryllium_ingot;
import items.ItemLithium_ingot;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block lithium_block;
	public static Block lithium_ore;
	public static Block hydrogen_extractor;
	public static Block opal_ore;

	public static void init() {
		lithium_block = new BlockLithium_block();
		lithium_ore = new BlockLithium_ore();
		opal_ore = new BlockOpal_ore();
	}

	public static void register() {
		registerBlock(lithium_block);
		registerBlock(lithium_ore);
		registerBlock(opal_ore);
	
	}
	
	private static void registerBlock(Block block) {
		GameRegistry.register(lithium_block);
		GameRegistry.register(lithium_ore);
		GameRegistry.register(opal_ore);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}

	public static void registerRenders() {
		registerRender (lithium_block);
		registerRender (lithium_ore);
		registerRender (opal_ore);
	}

	private static void registerRender(Block block) {
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
