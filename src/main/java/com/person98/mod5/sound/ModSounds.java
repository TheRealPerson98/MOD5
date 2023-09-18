package com.person98.mod5.sound;

import com.person98.mod5.Mod5;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent BAR_BRAWL = registerSoundEvent("bar_brawl");


    private static SoundEvent registerSoundEvent(String name) {
        Identifier identifier = new Identifier(Mod5.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, identifier, SoundEvent.of(identifier));
    }

    public static void registerSounds() {
        Mod5.LOGGER.info("Registering Mod Sounds for " + Mod5.MOD_ID);
    }
}