package com.Cmonster03.OreMod.proxy;

import com.Cmonster03.OreMod.OreMod;
import com.Cmonster03.OreMod.client.gui.GuiHandler;

import init.ModArmor;
import init.ModBlocks;
import init.ModItems;
import init.ModTools;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		ModTools.registerRenders();
		ModArmor.registerRenders();
		NetworkRegistry.INSTANCE.registerGuiHandler(OreMod.instance, new GuiHandler());
	}

}
