package net.treyhutson.tutorialmod.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.treyhutson.tutorialmod.TutorialMod;
import net.treyhutson.tutorialmod.entity.custom.MantisEntity;

public class ModEntities {
    public static final EntityType<MantisEntity> MANTIS = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(TutorialMod.MOD_ID, "mantis"),
            EntityType.Builder.create(MantisEntity::new, SpawnGroup.CREATURE)
                    .dimensions(1f, 2.5f ).build(RegistryKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of(TutorialMod.MOD_ID, "mantis")))
    );

    public static void registerModEntities () {
        TutorialMod.LOGGER.info("Registering Mod Entities for " +  TutorialMod.MOD_ID);
    }
}
