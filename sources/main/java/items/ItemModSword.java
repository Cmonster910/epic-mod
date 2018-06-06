package items;

import com.Cmonster03.OreMod.Reference;

import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;

public class ItemModSword extends ItemSword {
	
	public ItemModSword(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
	
	}

}
