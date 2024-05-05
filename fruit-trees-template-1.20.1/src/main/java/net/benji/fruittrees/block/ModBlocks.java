package net.benji.fruittrees.block;

import net.benji.fruittrees.FruitTrees;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block MANGO_BLOCK = registerBlock("mango_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).sounds(BlockSoundGroup.HONEY)));
    public static final Block MANGO_LEAVES = registerBlock("mango_leaves",
            new Block(FabricBlockSettings.copyOf(Blocks.FLOWERING_AZALEA_LEAVES).nonOpaque()));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(FruitTrees.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(FruitTrees.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        FruitTrees.LOGGER.info("Registering ModBlocks for " + FruitTrees.MOD_ID);
    }
}
