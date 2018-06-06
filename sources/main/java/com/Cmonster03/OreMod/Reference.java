package com.Cmonster03.OreMod;

public class Reference {
	
	public static final String MOD_ID = "cmo";
	public static final String NAME = "OreMod";
	public static final String VERSION = "0.1";
	public static final String ACCEPTED_VERSIONS = "[1.11.2]";
	
	public static final String CLIENT_PROXY_CLASS = "com.Cmonster03.OreMod.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.Cmonster03.OreMod.proxy.ServerProxy";
	
	public static enum OreModItems {
		LITHIUM_INGOT("lithium_ingot", "itemLithium_ingot"),
		BERYLLIUM_INGOT("beryllium_ingot", "itemBeryllium_ingot"),
		OPAL("opal", "itemOpal");
		
		private String unlocalizedName;
		private String registryName;
		
		OreModItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName(){
			return registryName;
		}
	}
	
	public static enum OreModBlocks {
		LITHIUM_BLOCK("lithium_block", "blockLithium_block"),
		LITHIUM_ORE("lithium_ore", "blockLithium_ore"),
		OPAL_ORE("opal_ore", "blockOpal_ore");
		
		private String unlocalizedName;
		private String registryName;
		
		OreModBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName(){
			return registryName;
		}
	}
}
