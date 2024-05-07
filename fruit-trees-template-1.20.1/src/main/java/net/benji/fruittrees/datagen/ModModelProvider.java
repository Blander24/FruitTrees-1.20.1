package net.benji.fruittrees.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.benji.fruittrees.block.ModBlocks;
import net.benji.fruittrees.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MANGO_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MANGO_LEAVES);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.MANGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_MANGO, Models.GENERATED);

        itemModelGenerator.register(ModItems.MANGO_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.MANGO_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MANGO_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MANGO_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MANGO_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MANGO_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MANGO_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MANGO_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MANGO_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MANGO_BOOTS));

    }
}