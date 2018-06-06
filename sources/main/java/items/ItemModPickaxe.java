package items;

import com.Cmonster03.OreMod.Reference;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.ResourceLocation;

public class ItemModPickaxe extends ItemPickaxe {

	public ItemModPickaxe(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
	
	}

}
