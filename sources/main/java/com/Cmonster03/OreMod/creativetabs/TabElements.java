package com.Cmonster03.OreMod.creativetabs;

import init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabElements {

public static CreativeTabs tab_elements = new CreativeTabs("tab_elements") {
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.lithium_ingot);
	}
};

}