package com.kakarotvg.omega.generation;

import java.util.Random;

import com.kakarotvg.omega.handlers.blocks.BlockHandler;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGen implements IWorldGenerator {
    
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.dimensionId) {
            case 1:
                generateEnd(world, random, chunkX * 16, chunkZ * 16);
            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
            case -1:
                generateNether(world, random, chunkX * 16, chunkZ ^ 16);
        }
    }
    
    private void generateEnd(World world, Random random, int chunkX, int chunkZ) {
        
    }
    
    private void generateSurface(World world, Random random, int x, int z) {
        // urotark
        this.addOreSpawn(BlockHandler.urotarkore, 0, world, random, x, z, 16, 16, 4 + random.nextInt(4), 12, 2, 32, Blocks.stone);
        // pearl
        this.addOreSpawn(BlockHandler.urotarkore, 1, world, random, x, z, 16, 16, 4 + random.nextInt(4), 12, 2, 32, Blocks.stone);
        // sapphire
        this.addOreSpawn(BlockHandler.urotarkore, 2, world, random, x, z, 16, 16, 4 + random.nextInt(4), 12, 2, 32, Blocks.stone);
        // muscovite
        this.addOreSpawn(BlockHandler.muscoviteore, 0, world, random, x, z, 16, 16, 3 + random.nextInt(4), 11, 2, 28, Blocks.stone);
        // ruby
        this.addOreSpawn(BlockHandler.muscoviteore, 1, world, random, x, z, 16, 16, 3 + random.nextInt(4), 11, 2, 28, Blocks.stone);
        // uriotyke
        this.addOreSpawn(BlockHandler.muscoviteore, 2, world, random, x, z, 16, 16, 3 + random.nextInt(4), 11, 2, 28, Blocks.stone);
        // gilder
        this.addOreSpawn(BlockHandler.gilderore, 0, world, random, x, z, 16, 16, 3 + random.nextInt(4), 10, 2, 24, Blocks.stone);
        // selovar
        this.addOreSpawn(BlockHandler.gilderore, 1, world, random, x, z, 16, 16, 3 + random.nextInt(4), 10, 2, 24, Blocks.stone);
        // parfilian
        this.addOreSpawn(BlockHandler.gilderore, 2, world, random, x, z, 16, 16, 3 + random.nextInt(4), 10, 2, 24, Blocks.stone);
        // barium
        this.addOreSpawn(BlockHandler.bariumore, 0, world, random, x, z, 16, 16, 3 + random.nextInt(4), 9, 2, 20, Blocks.stone);
        // radium
        this.addOreSpawn(BlockHandler.bariumore, 1, world, random, x, z, 16, 16, 3 + random.nextInt(4), 9, 2, 20, Blocks.stone);
        // gallum
        this.addOreSpawn(BlockHandler.bariumore, 2, world, random, x, z, 16, 16, 3 + random.nextInt(4), 9, 2, 20, Blocks.stone);
        // vanadium
        this.addOreSpawn(BlockHandler.vanadiumore, 0, world, random, x, z, 16, 16, 3 + random.nextInt(4), 8, 2, 16, Blocks.stone);
        // scandium
        this.addOreSpawn(BlockHandler.vanadiumore, 1, world, random, x, z, 16, 16, 3 + random.nextInt(4), 8, 2, 16, Blocks.stone);
        // bismuth
        this.addOreSpawn(BlockHandler.bismuthore, 0, world, random, x, z, 16, 16, 3 + random.nextInt(4), 7, 2, 12, Blocks.stone);
        // indium
        this.addOreSpawn(BlockHandler.bismuthore, 1, world, random, x, z, 16, 16, 3 + random.nextInt(4), 7, 2, 12, Blocks.stone);
        // platinum
        this.addOreSpawn(BlockHandler.platinumore, 0, world, random, x, z, 16, 16, 3 + random.nextInt(4), 6, 2, 10, Blocks.stone);
        // darkness
        this.addOreSpawn(BlockHandler.darknessore, 0, world, random, x, z, 16, 16, 3 + random.nextInt(4), 2, 2, 8, Blocks.stone);
        // light
        this.addOreSpawn(BlockHandler.darknessore, 1, world, random, x, z, 16, 16, 3 + random.nextInt(4), 2, 2, 8, Blocks.stone);
        // omega
        this.addOreSpawn(BlockHandler.omegaore, 0, world, random, x, z, 16, 16, 3 + random.nextInt(4), 1, 2, 8, Blocks.stone);
        // berionvar
        this.addOreSpawn(BlockHandler.berionvarore, 0, world, random, x, z, 16, 16, 3 + random.nextInt(4), 5, 2, 8, Blocks.stone);
        // charviole
        this.addOreSpawn(BlockHandler.berionvarore, 1, world, random, x, z, 16, 16, 3 + random.nextInt(4), 5, 2, 8, Blocks.stone);
        // firlvear
        this.addOreSpawn(BlockHandler.firlvearore, 0, world, random, x, z, 16, 16, 3 + random.nextInt(4), 4, 2, 8, Blocks.stone);
        // selmenrer
        this.addOreSpawn(BlockHandler.firlvearore, 1, world, random, x, z, 16, 16, 3 + random.nextInt(4), 4, 2, 8, Blocks.stone);
        // verilion
        this.addOreSpawn(BlockHandler.verilionore, 0, world, random, x, z, 16, 16, 3 + random.nextInt(4), 2, 2, 8, Blocks.stone);
        // vielvor
        this.addOreSpawn(BlockHandler.verilionore, 1, world, random, x, z, 16, 16, 3 + random.nextInt(4), 2, 2, 8, Blocks.stone);
        
    }
    
    private void generateNether(World world, Random random, int chunkX, int chunkZ) {
        
    }
    
    /**
     * Adds an Ore Spawn to Minecraft. Simply register all Ores to spawn with
     * this method in your Generation method in your IWorldGeneration extending
     * Class
     * 
     * @param The
     *            Block to spawn
     * @param The
     *            blocks metadata
     * @param The
     *            World to spawn in
     * @param A
     *            Random object for retrieving random positions within the world
     *            to spawn the Block
     * @param An
     *            int for passing the X-Coordinate for the Generation method
     * @param An
     *            int for passing the Z-Coordinate for the Generation method
     * @param An
     *            int for setting the maximum X-Coordinate values for spawning
     *            on the X-Axis on a Per-Chunk basis
     * @param An
     *            int for setting the maximum Z-Coordinate values for spawning
     *            on the Z-Axis on a Per-Chunk basis
     * @param An
     *            int for setting the maximum size of a vein
     * @param An
     *            int for the Number of chances available for the Block to spawn
     *            per-chunk
     * @param An
     *            int for the minimum Y-Coordinate height at which this block
     *            may spawn
     * @param An
     *            int for the maximum Y-Coordinate height at which this block
     *            may spawn
     * @param The
     *            target block id (stone being 1)
     **/
    public void addOreSpawn(Block block, int metadata, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY, Block target) {
        int maxPossY = minY + (maxY - 1);
        assert maxY > minY : "The maximum Y must be greater than the Minimum Y";
        assert maxX > 0 && maxX <= 16 : "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
        assert minY > 0 : "addOreSpawn: The Minimum Y must be greater than 0";
        assert maxY < 256 && maxY > 0 : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
        assert maxZ > 0 && maxZ <= 16 : "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";
        
        int diffBtwnMinMaxY = maxY - minY;
        for (int x = 0; x < chancesToSpawn; x++) {
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(diffBtwnMinMaxY);
            int posZ = blockZPos + random.nextInt(maxZ);
            (new WorldGenMinable(block, metadata, maxVeinSize, target)).generate(world, random, posX, posY, posZ);
        }
    }
    
}
