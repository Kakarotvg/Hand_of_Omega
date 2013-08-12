package kakarotvg.omega;

import java.util.Random;

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

    private void generateSurface(World world, Random random, int chunkX, int chunkZ) {
        for (int i = 0; i < 4; i++) {
            int coordX = random.nextInt(16) + chunkX;
            int coordY = random.nextInt(16);
            int coordZ = random.nextInt(16) + chunkZ;

            (new WorldGenMinable(BlockHandler.urotarkore.blockID, 12)).generate(world, random, coordX, coordY, coordZ);
        }
        for (int i = 0; i < 4; i++) {
            int coordX = random.nextInt(16) + chunkX;
            int coordY = random.nextInt(16);
            int coordZ = random.nextInt(16) + chunkZ;

            (new WorldGenMinable(BlockHandler.pearlore.blockID, 12)).generate(world, random, coordX, coordY, coordZ);
        }
        for (int i = 0; i < 4; i++) {
            int coordX = random.nextInt(16) + chunkX;
            int coordY = random.nextInt(16);
            int coordZ = random.nextInt(16) + chunkZ;

            (new WorldGenMinable(BlockHandler.sapphireore.blockID, 12)).generate(world, random, coordX, coordY, coordZ);
        }
        for (int i = 0; i < 3.75; i++) {
            int coordX = random.nextInt(16) + chunkX;
            int coordY = random.nextInt(14);
            int coordZ = random.nextInt(16) + chunkZ;

            (new WorldGenMinable(BlockHandler.muscoviteore.blockID, 10)).generate(world, random, coordX, coordY, coordZ);
        }
        for (int i = 0; i < 3.75; i++) {
            int coordX = random.nextInt(16) + chunkX;
            int coordY = random.nextInt(14);
            int coordZ = random.nextInt(16) + chunkZ;

            (new WorldGenMinable(BlockHandler.rubyore.blockID, 10)).generate(world, random, coordX, coordY, coordZ);
        }
        for (int i = 0; i < 3.75; i++) {
            int coordX = random.nextInt(16) + chunkX;
            int coordY = random.nextInt(14);
            int coordZ = random.nextInt(16) + chunkZ;

            (new WorldGenMinable(BlockHandler.uriotykeore.blockID, 10)).generate(world, random, coordX, coordY, coordZ);
        }
        for (int i = 0; i < 3.5; i++) {
            int coordX = random.nextInt(16) + chunkX;
            int coordY = random.nextInt(12);
            int coordZ = random.nextInt(16) + chunkZ;

            (new WorldGenMinable(BlockHandler.gilderore.blockID, 8)).generate(world, random, coordX, coordY, coordZ);
        }
        for (int i = 0; i < 3.5; i++) {
            int coordX = random.nextInt(16) + chunkX;
            int coordY = random.nextInt(12);
            int coordZ = random.nextInt(16) + chunkZ;

            (new WorldGenMinable(BlockHandler.selovarore.blockID, 8)).generate(world, random, coordX, coordY, coordZ);
        }
        for (int i = 0; i < 3.5; i++) {
            int coordX = random.nextInt(16) + chunkX;
            int coordY = random.nextInt(12);
            int coordZ = random.nextInt(16) + chunkZ;

            (new WorldGenMinable(BlockHandler.parfilianore.blockID, 8)).generate(world, random, coordX, coordY, coordZ);
        }
        for (int i = 0; i < 3.25; i++) {
            int coordX = random.nextInt(16) + chunkX;
            int coordY = random.nextInt(10);
            int coordZ = random.nextInt(16) + chunkZ;

            (new WorldGenMinable(BlockHandler.bariumore.blockID, 6)).generate(world, random, coordX, coordY, coordZ);
        }
        for (int i = 0; i < 3.25; i++) {
            int coordX = random.nextInt(16) + chunkX;
            int coordY = random.nextInt(10);
            int coordZ = random.nextInt(16) + chunkZ;

            (new WorldGenMinable(BlockHandler.radiumore.blockID, 6)).generate(world, random, coordX, coordY, coordZ);
        }
        for (int i = 0; i < 3.25; i++) {
            int coordX = random.nextInt(16) + chunkX;
            int coordY = random.nextInt(10);
            int coordZ = random.nextInt(16) + chunkZ;

            (new WorldGenMinable(BlockHandler.gallumore.blockID, 6)).generate(world, random, coordX, coordY, coordZ);
        }
        for (int i = 0; i < 3; i++) {
            int coordX = random.nextInt(16) + chunkX;
            int coordY = random.nextInt(16);
            int coordZ = random.nextInt(16) + chunkZ;

            (new WorldGenMinable(BlockHandler.vanadiumore.blockID, 4)).generate(world, random, coordX, coordY, coordZ);
        }
        for (int i = 0; i < 3; i++) {
            int coordX = random.nextInt(16) + chunkX;
            int coordY = random.nextInt(16);
            int coordZ = random.nextInt(16) + chunkZ;

            (new WorldGenMinable(BlockHandler.scandiumore.blockID, 4)).generate(world, random, coordX, coordY, coordZ);
        }
        for (int i = 0; i < 2; i++) {
            int coordX = random.nextInt(16) + chunkX;
            int coordY = random.nextInt(16);
            int coordZ = random.nextInt(16) + chunkZ;

            (new WorldGenMinable(BlockHandler.bismuthore.blockID, 2)).generate(world, random, coordX, coordY, coordZ);
        }
        for (int i = 0; i < 2; i++) {
            int coordX = random.nextInt(16) + chunkX;
            int coordY = random.nextInt(16);
            int coordZ = random.nextInt(16) + chunkZ;

            (new WorldGenMinable(BlockHandler.indiumore.blockID, 2)).generate(world, random, coordX, coordY, coordZ);
        }
        for (int i = 0; i < 1.5; i++) {
            int coordX = random.nextInt(16) + chunkX;
            int coordY = random.nextInt(16);
            int coordZ = random.nextInt(16) + chunkZ;

            (new WorldGenMinable(BlockHandler.platinumore.blockID, 2)).generate(world, random, coordX, coordY, coordZ);
        }
        for (int i = 0; i < 1; i++) {
            int coordX = random.nextInt(16) + chunkX;
            int coordY = random.nextInt(16);
            int coordZ = random.nextInt(16) + chunkZ;

            (new WorldGenMinable(BlockHandler.darknessore.blockID, 1)).generate(world, random, coordX, coordY, coordZ);
        }
        for (int i = 0; i < 1; i++) {
            int coordX = random.nextInt(16) + chunkX;
            int coordY = random.nextInt(16);
            int coordZ = random.nextInt(16) + chunkZ;

            (new WorldGenMinable(BlockHandler.lightore.blockID, 1)).generate(world, random, coordX, coordY, coordZ);
        }
        for (int i = 0; i < 0.1; i++) {
            int coordX = random.nextInt(16) + chunkX;
            int coordY = random.nextInt(16);
            int coordZ = random.nextInt(16) + chunkZ;

            (new WorldGenMinable(BlockHandler.omegaore.blockID, 1)).generate(world, random, coordX, coordY, coordZ);
        }
        for (int i = 0; i < 0.5; i++) {
            int coordX = random.nextInt(16) + chunkX;
            int coordY = random.nextInt(16);
            int coordZ = random.nextInt(16) + chunkZ;

            (new WorldGenMinable(BlockHandler.berionvarore.blockID, 1)).generate(world, random, coordX, coordY, coordZ);
        }
        for (int i = 0; i < 0.5; i++) {
            int coordX = random.nextInt(16) + chunkX;
            int coordY = random.nextInt(16);
            int coordZ = random.nextInt(16) + chunkZ;

            (new WorldGenMinable(BlockHandler.charvioleore.blockID, 1)).generate(world, random, coordX, coordY, coordZ);
        }
        for (int i = 0; i < 0.5; i++) {
            int coordX = random.nextInt(16) + chunkX;
            int coordY = random.nextInt(16);
            int coordZ = random.nextInt(16) + chunkZ;

            (new WorldGenMinable(BlockHandler.selmenrerore.blockID, 1)).generate(world, random, coordX, coordY, coordZ);
        }
        for (int i = 0; i < 0.5; i++) {
            int coordX = random.nextInt(16) + chunkX;
            int coordY = random.nextInt(16);
            int coordZ = random.nextInt(16) + chunkZ;

            (new WorldGenMinable(BlockHandler.verilionore.blockID, 1)).generate(world, random, coordX, coordY, coordZ);
        }
        for (int i = 0; i < 0.5; i++) {
            int coordX = random.nextInt(16) + chunkX;
            int coordY = random.nextInt(16);
            int coordZ = random.nextInt(16) + chunkZ;

            (new WorldGenMinable(BlockHandler.vielvorore.blockID, 1)).generate(world, random, coordX, coordY, coordZ);
        }
    }

    private void generateNether(World world, Random random, int chunkX, int chunkZ) {

    }

}
