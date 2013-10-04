package kakarotvg.omega.generation;

import java.util.Random;

import kakarotvg.omega.handlers.blocks.BlockHandler;
import kakarotvg.omega.handlers.liquids.LiquidHandler;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenLakes;
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
        this.addOreSpawn(BlockHandler.urotarkore, 0, world, random, x, z, 16, 16, 4 + random.nextInt(4), 12, 2, 32, 1);
        // pearl
        this.addOreSpawn(BlockHandler.urotarkore, 1, world, random, x, z, 16, 16, 4 + random.nextInt(4), 12, 2, 32, 1);
        // sapphire
        this.addOreSpawn(BlockHandler.urotarkore, 2, world, random, x, z, 16, 16, 4 + random.nextInt(4), 12, 2, 32, 1);
        // muscovite
        this.addOreSpawn(BlockHandler.muscoviteore, 0, world, random, x, z, 16, 16, 3 + random.nextInt(4), 11, 2, 28, 1);
        // ruby
        this.addOreSpawn(BlockHandler.muscoviteore, 1, world, random, x, z, 16, 16, 3 + random.nextInt(4), 11, 2, 28, 1);
        // uriotyke
        this.addOreSpawn(BlockHandler.muscoviteore, 2, world, random, x, z, 16, 16, 3 + random.nextInt(4), 11, 2, 28, 1);
        // gilder
        this.addOreSpawn(BlockHandler.gilderore, 0, world, random, x, z, 16, 16, 3 + random.nextInt(4), 10, 2, 24, 1);
        // selovar
        this.addOreSpawn(BlockHandler.gilderore, 1, world, random, x, z, 16, 16, 3 + random.nextInt(4), 10, 2, 24, 1);
        // parfilian
        this.addOreSpawn(BlockHandler.gilderore, 2, world, random, x, z, 16, 16, 3 + random.nextInt(4), 10, 2, 24, 1);
        // barium
        this.addOreSpawn(BlockHandler.bariumore, 0, world, random, x, z, 16, 16, 3 + random.nextInt(4), 9, 2, 20, 1);
        // radium
        this.addOreSpawn(BlockHandler.bariumore, 1, world, random, x, z, 16, 16, 3 + random.nextInt(4), 9, 2, 20, 1);
        // gallum
        this.addOreSpawn(BlockHandler.bariumore, 2, world, random, x, z, 16, 16, 3 + random.nextInt(4), 9, 2, 20, 1);
        // vanadium
        this.addOreSpawn(BlockHandler.vanadiumore, 0, world, random, x, z, 16, 16, 3 + random.nextInt(4), 8, 2, 16, 1);
        // scandium
        this.addOreSpawn(BlockHandler.vanadiumore, 1, world, random, x, z, 16, 16, 3 + random.nextInt(4), 8, 2, 16, 1);
        // bismuth
        this.addOreSpawn(BlockHandler.bismuthore, 0, world, random, x, z, 16, 16, 3 + random.nextInt(4), 7, 2, 12, 1);
        // indium
        this.addOreSpawn(BlockHandler.bismuthore, 1, world, random, x, z, 16, 16, 3 + random.nextInt(4), 7, 2, 12, 1);
        // platinum
        this.addOreSpawn(BlockHandler.platinumore, 0, world, random, x, z, 16, 16, 3 + random.nextInt(4), 6, 2, 10, 1);
        // darkness
        this.addOreSpawn(BlockHandler.darknessore, 0, world, random, x, z, 16, 16, 3 + random.nextInt(4), 2, 2, 8, 1);
        // light
        this.addOreSpawn(BlockHandler.darknessore, 1, world, random, x, z, 16, 16, 3 + random.nextInt(4), 2, 2, 8, 1);
        // omega
        this.addOreSpawn(BlockHandler.omegaore, 0, world, random, x, z, 16, 16, 3 + random.nextInt(4), 1, 2, 8, 1);
        // berionvar
        this.addOreSpawn(BlockHandler.berionvarore, 0, world, random, x, z, 16, 16, 3 + random.nextInt(4), 5, 2, 8, 1);
        // charviole
        this.addOreSpawn(BlockHandler.berionvarore, 1, world, random, x, z, 16, 16, 3 + random.nextInt(4), 5, 2, 8, 1);
        // firlvear
        this.addOreSpawn(BlockHandler.firlvearore, 0, world, random, x, z, 16, 16, 3 + random.nextInt(4), 4, 2, 8, 1);
        // selmenrer
        this.addOreSpawn(BlockHandler.firlvearore, 1, world, random, x, z, 16, 16, 3 + random.nextInt(4), 4, 2, 8, 1);
        // verilion
        this.addOreSpawn(BlockHandler.verilionore, 0, world, random, x, z, 16, 16, 3 + random.nextInt(4), 2, 2, 8, 1);
        // vielvor
        this.addOreSpawn(BlockHandler.verilionore, 1, world, random, x, z, 16, 16, 3 + random.nextInt(4), 2, 2, 8, 1);
        // tree stuff
        for (int i = 0; i < 20; i++) {
            int xcoord = x + random.nextInt(16);
            int ycoord = random.nextInt(256);
            int zcoord = z + random.nextInt(16);

            (new WorldGenVgTrees(false, 4, 0, 0, false)).generate(world, random, xcoord, ycoord, zcoord);
        }

    }

    private void generateNether(World world, Random random, int chunkX, int chunkZ) {

    }

    /**
     * Adds an Ore Spawn to Minecraft. Simply register all Ores to spawn with this method in your Generation method in your IWorldGeneration extending Class
     * 
     * @param The Block to spawn
     * @param The blocks metadata
     * @param The World to spawn in
     * @param A Random object for retrieving random positions within the world to spawn the Block
     * @param An int for passing the X-Coordinate for the Generation method
     * @param An int for passing the Z-Coordinate for the Generation method
     * @param An int for setting the maximum X-Coordinate values for spawning on the X-Axis on a Per-Chunk basis
     * @param An int for setting the maximum Z-Coordinate values for spawning on the Z-Axis on a Per-Chunk basis
     * @param An int for setting the maximum size of a vein
     * @param An int for the Number of chances available for the Block to spawn per-chunk
     * @param An int for the minimum Y-Coordinate height at which this block may spawn
     * @param An int for the maximum Y-Coordinate height at which this block may spawn
     * @param The target block id (stone being 1)
     **/
    public void addOreSpawn(Block block, int metadata, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY, int target) {
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
            (new WorldGenMinable(block.blockID, metadata, maxVeinSize, target)).generate(world, random, posX, posY, posZ);
        }
    }

}
