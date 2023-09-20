package com.person98.mod5;

import com.person98.mod5.block.ModBlocks;
import com.person98.mod5.entity.ModEntities;
import com.person98.mod5.item.ModItemGroup;
import com.person98.mod5.item.ModItems;
import com.person98.mod5.sound.ModSounds;
import com.person98.mod5.util.ModRegistries;
import com.person98.mod5.world.gen.ModWorldGen;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mod5 implements ModInitializer {
	public static final String MOD_ID = "mod5";
    public static final Logger LOGGER = LoggerFactory.getLogger("mod5");

	@Override
	public void onInitialize() {

		ModItemGroup.registerItemGroups();

		ModItems.registerModItems();

		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuffs();

		ModSounds.registerSounds();

		ModEntities.registerModEntities();

		ModWorldGen.generateWorldGen();

	}

}