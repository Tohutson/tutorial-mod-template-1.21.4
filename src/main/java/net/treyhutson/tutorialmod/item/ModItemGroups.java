package net.treyhutson.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.treyhutson.tutorialmod.TutorialMod;
import net.treyhutson.tutorialmod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup PINK_GARNET_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(TutorialMod.MOD_ID, "pink_garnet_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.pink_garnet_items"))
                    .entries(((displayContext, entries) -> {
                        entries.add(new ItemStack(ModItems.PINK_GARNET));
                        entries.add(new ItemStack(ModItems.RAW_PINK_GARNET));

                        entries.add(ModItems.CHISEL);

                        entries.add(ModItems.MANTIS_SPAWN_EGG);
                    })).build());

    public static final ItemGroup PINK_GARNET_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(TutorialMod.MOD_ID, "pink_garnet_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.PINK_GARNET_BLOCK))
                    .displayName(Text.translatable("itemgroup.tutorial-mod.pink_garnet_blocks"))
                    .entries(((displayContext, entries) -> {
                        entries.add(new ItemStack(ModBlocks.PINK_GARNET_BLOCK));
                        entries.add(new ItemStack(ModBlocks.RAW_PINK_GARNET_BLOCK));
                        entries.add(new ItemStack(ModBlocks.PINK_GARNET_ORE));
                        entries.add(new ItemStack(ModBlocks.PINK_GARNET_DEEPSLATE_ORE));
                    })).build());


    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}
