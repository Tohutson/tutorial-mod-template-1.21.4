package net.treyhutson.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.treyhutson.tutorialmod.TutorialMod;
import net.treyhutson.tutorialmod.entity.ModEntities;
import net.treyhutson.tutorialmod.item.custom.ChiselItem;

import java.util.function.Function;

public class ModItems {
    public static final Item PINK_GARNET = registerItem("pink_garnet", Item::new, new Item.Settings());
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", Item::new, new Item.Settings());

    public static final Item CHISEL = registerItem("chisel", ChiselItem::new, new Item.Settings().maxDamage(32));

    public static final Item MANTIS_SPAWN_EGG = registerItem(
            "mantis_spawn_egg",
            settings -> new SpawnEggItem(ModEntities.MANTIS, settings),
            new Item.Settings()
    );

    public static Item registerItem(String path, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, path));
        return Items.register(registryKey, factory, settings);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering ModItems for " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_GARNET);
            entries.add(RAW_PINK_GARNET);
        });
    }
}
