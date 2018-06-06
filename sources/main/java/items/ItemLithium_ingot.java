package items;

import com.Cmonster03.OreMod.OreMod;
import com.Cmonster03.OreMod.Reference;
import com.Cmonster03.OreMod.creativetabs.TabElements;

import net.minecraft.item.Item;

public class ItemLithium_ingot extends Item {

	public ItemLithium_ingot() {
		setUnlocalizedName(Reference.OreModItems.LITHIUM_INGOT.getUnlocalizedName());
		setRegistryName(Reference.OreModItems.LITHIUM_INGOT.getRegistryName());
		setCreativeTab(TabElements.tab_elements);
	}
}
