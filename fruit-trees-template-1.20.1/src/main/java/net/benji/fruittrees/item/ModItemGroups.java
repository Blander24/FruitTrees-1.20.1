package net.benji.fruittrees.item;

import net.benji.fruittrees.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.benji.fruittrees.FruitTrees;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup FRUIT_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(FruitTrees.MOD_ID, "mango_ingot"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.fruits"))
                    .icon(() -> new ItemStack(ModItems.MANGO_INGOT)).entries((displayContext, entries) -> {
                        // Mango Section
                            // Blocks & Items
                            entries.add(ModItems.MANGO);
                            entries.add(ModItems.COOKED_MANGO);
                            entries.add(ModItems.MANGO_INGOT);
                            entries.add(ModBlocks.MANGO_BLOCK);
                            entries.add(ModBlocks.MANGO_LEAVES);

                            // Tools
                            entries.add(ModItems.MANGO_PICKAXE);
                            entries.add(ModItems.MANGO_AXE);
                            entries.add(ModItems.MANGO_HOE);
                            entries.add(ModItems.MANGO_SHOVEL);
                            entries.add(ModItems.MANGO_SWORD);

                            // Armor
                            entries.add(ModItems.MANGO_HELMET);
                            entries.add(ModItems.MANGO_CHESTPLATE);
                            entries.add(ModItems.MANGO_LEGGINGS);
                            entries.add(ModItems.MANGO_BOOTS);


                    }).build());

    public static void registerItemGroups() {
        FruitTrees.LOGGER.info("Registering Item Groups for " + FruitTrees.MOD_ID);
    }
}
