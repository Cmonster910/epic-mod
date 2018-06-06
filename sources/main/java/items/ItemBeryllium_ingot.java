package items;

import com.Cmonster03.OreMod.Reference;
import com.Cmonster03.OreMod.creativetabs.TabElements;

import net.minecraft.item.Item;

public class ItemBeryllium_ingot extends Item {

	public ItemBeryllium_ingot() {
		setUnlocalizedName(Reference.OreModItems.BERYLLIUM_INGOT.getUnlocalizedName());
		setRegistryName(Reference.OreModItems.BERYLLIUM_INGOT.getRegistryName());
		setCreativeTab(TabElements.tab_elements);
	}
}
