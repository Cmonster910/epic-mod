package com.Cmonster03.OreMod;

import com.Cmonster03.OreMod.proxy.CommonProxy;
import com.Cmonster03.OreMod.worldgen.OreGen;

import handlers.RecipeHandler;
import init.ModArmor;
import init.ModBlocks;
import init.ModItems;
import init.ModTools;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class OreMod {

	@Instance
	public static OreMod instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
		ModItems.init();
		ModItems.register();
		ModTools.init();
		ModTools.register();
		ModArmor.init();
		ModArmor.register();
		ModBlocks.init();
		ModBlocks.register();
		
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		proxy.init();
		
		GameRegistry.registerWorldGenerator(new OreGen(), 0);
		RecipeHandler.registerCraftingRecipes();
		RecipeHandler.registerFurnaceRecipes();
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event)
	{
		
	}

}
