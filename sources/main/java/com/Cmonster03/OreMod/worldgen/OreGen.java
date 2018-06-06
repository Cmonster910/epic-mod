package com.Cmonster03.OreMod.worldgen;

import java.util.Random;

import init.ModBlocks;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class OreGen implements IWorldGenerator {
	//@formatter:off
	
	private WorldGenerator gen_lithium_ore;
	private WorldGenerator gen_opal_ore;
	
	//@formatter:on
	
	public OreGen() {
		this.gen_lithium_ore = new WorldGenMinable(ModBlocks.lithium_ore.getDefaultState(), 10, BlockMatcher.forBlock(Blocks.STONE));
		this.gen_opal_ore = new WorldGenMinable(ModBlocks.opal_ore.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.STONE));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.getDimension()) {
		case 0: //Overworld
			this.runGenerator(this.gen_lithium_ore, world, random, chunkX, chunkZ, 16, 1, 63);
			this.runGenerator(this.gen_opal_ore, world, random, chunkX, chunkZ, 3, 1, 30);
			
			break;
		case -1: //Nether
			
			break;
		
		case 1: //End
			
			break;
		}
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
	    if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
	        throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

	    int heightDiff = maxHeight - minHeight + 1;
	    for (int i = 0; i < chancesToSpawn; i ++) {
	        int x = chunk_X * 16 + rand.nextInt(16);
	        int y = minHeight + rand.nextInt(heightDiff);
	        int z = chunk_Z * 16 + rand.nextInt(16);
	        generator.generate(world, rand, new BlockPos(x, y, z));
	    }
	}
	
}
