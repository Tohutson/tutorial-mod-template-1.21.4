package net.treyhutson.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.treyhutson.tutorialmod.block.ModBlocks;
import net.treyhutson.tutorialmod.entity.ModEntities;
import net.treyhutson.tutorialmod.entity.client.MantisModel;
import net.treyhutson.tutorialmod.entity.custom.MantisEntity;
import net.treyhutson.tutorialmod.item.ModItemGroups;
import net.treyhutson.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorial-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModEntities.registerModEntities();

		FabricDefaultAttributeRegistry.register(ModEntities.MANTIS, MantisEntity.createAttributes());
	}
}