package com.nazzimods.woi.init;

import java.util.Random;

import com.nazzimods.woi.reference.Names;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class OreGeneration implements IWorldGenerator {

	public static void init() {
		registerGenerations();
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case -1:
			generateNether(world, random, chunkX, chunkZ);
			break;
		case 0:
			generateOverworld(world, random, chunkX, chunkZ);
			break;
		case 1:
			generateEnd(world, random, chunkX, chunkZ);
			break;
		}
	}

	public void generateNether(World world, Random random, int x, int z) {

	}

	public void generateOverworld(World world, Random random, int x, int z) {
		generateOre(ModBlocks.oreLuskium, world, random, x, z, 2, 10, 5, 0, 100, Blocks.stone);
		generateOre(ModBlocks.oreBismuth, world, random, x, z, 2, 10, 5, 0, 100, Blocks.stone);
		generateOre(ModBlocks.oreAdamantine, world, random, x, z, 2, 10, 5, 0, 100, Blocks.stone);
		generateOre(ModBlocks.oreRunite, world, random, x, z, 2, 10, 5, 0, 100, Blocks.stone);
		generateOre(ModBlocks.oreOshite, world, random, x, z, 2, 10, 5, 0, 100, Blocks.stone);
	}

	public void generateEnd(World world, Random random, int x, int z) {

	}

	public void generateOre(Block block, World world, Random random, int chunkX, int chunkZ, int minVienSize, int maxVienSize, int chance, int minY, int maxY, Block generateIn) {
		int vienSize = minVienSize + random.nextInt(maxVienSize - minVienSize);
		int heightRange = maxY - minY;
		WorldGenMinable gen = new WorldGenMinable(block, vienSize, generateIn);
		for (int i = 0; i < chance; i++) {
			int xRand = chunkX * 16 + random.nextInt(16);
			int yRand = random.nextInt(heightRange) + minY;
			int zRand = chunkZ * 16 + random.nextInt(16);
			gen.generate(world, random, xRand, yRand, zRand);
		}
	}
	
	private static void registerGenerations() {
		GameRegistry.registerWorldGenerator(new OreGeneration(), 0);
	}

}
