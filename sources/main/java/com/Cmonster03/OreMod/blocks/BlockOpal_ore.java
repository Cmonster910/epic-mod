package com.Cmonster03.OreMod.blocks;

import java.util.Random;

import com.Cmonster03.OreMod.Reference;

import init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockOpal_ore extends Block {
	
	public BlockOpal_ore() {
		super(Material.ROCK);
		this.setUnlocalizedName(Reference.OreModBlocks.OPAL_ORE.getUnlocalizedName());
		this.setRegistryName(Reference.OreModBlocks.OPAL_ORE.getRegistryName());
		this.setHardness(3.0F);
		this.setResistance(20F);
		this.setHarvestLevel("pickaxe", 2);
	}
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.opal;
	}
	
	@Override
	public int quantityDropped(Random rand) {
		return 1 + rand.nextInt(2);
	}

}
