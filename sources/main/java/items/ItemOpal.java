package items;



import java.util.List;

import com.Cmonster03.OreMod.Reference;
import com.Cmonster03.OreMod.creativetabs.TabElements;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemOpal extends Item {

	public ItemOpal() {
		setUnlocalizedName(Reference.OreModItems.OPAL.getUnlocalizedName());
		setRegistryName(Reference.OreModItems.OPAL.getRegistryName());
		setCreativeTab(TabElements.tab_elements);
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
	{
	list.add("No joke, this is what opal looks like.");
	}
}
