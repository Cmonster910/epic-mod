package com.Cmonster03.OreMod.blocks;

import java.util.Random;

import com.Cmonster03.OreMod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockLithium_ore extends Block {
	
	public BlockLithium_ore() {
		super(Material.ROCK);
		this.setUnlocalizedName(Reference.OreModBlocks.LITHIUM_ORE.getUnlocalizedName());
		this.setRegistryName(Reference.OreModBlocks.LITHIUM_ORE.getRegistryName());
		this.setHardness(3.0F);
		this.setResistance(20F);
		this.setHarvestLevel("pickaxe", 1);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(this);
	}

}
