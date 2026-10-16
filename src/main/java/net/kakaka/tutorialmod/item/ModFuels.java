package net.kakaka.tutorialmod.item;

import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModFuels {
    public static void registerModFuels() {
        FuelRegistry.INSTANCE.add(ModItems.STARLIGHT_ASHES, 2400);
    }
}
