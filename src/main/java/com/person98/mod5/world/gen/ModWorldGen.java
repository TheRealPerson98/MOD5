package com.person98.mod5.world.gen;


import com.person98.mod5.Mod5;

public class ModWorldGen {
    public static void generateWorldGen() {
        Mod5.LOGGER.info("loaded ModWorldGen");
        ModTreeGeneration.generateTrees();
        ModEntitySpawns.addSpawns();

    }
}
