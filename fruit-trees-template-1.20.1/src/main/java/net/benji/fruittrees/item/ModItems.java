package net.benji.fruittrees.item;

import net.benji.fruittrees.FruitTrees;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.benji.fruittrees.FruitTrees;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item MANGO_INGOT = registerItem("mango_ingot", new Item(new FabricItemSettings()));
    public static final Item MANGO = registerItem("mango", new Item(new FabricItemSettings().food(ModFoodComponents.MANGO)));
    public static final Item COOKED_MANGO = registerItem("cooked_mango", new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_MANGO)));

    public static final Item MANGO_PICKAXE = registerItem("mango_pickaxe",
            new PickaxeItem(ModToolMaterial.MANGO, 4, 2.0f, new FabricItemSettings()));
    public static final Item MANGO_AXE = registerItem("mango_axe",
            new AxeItem(ModToolMaterial.MANGO, 5, 1.0f, new FabricItemSettings()));
    public static final Item MANGO_SHOVEL = registerItem("mango_shovel",
            new ShovelItem(ModToolMaterial.MANGO, 3, 0f, new FabricItemSettings()));
    public static final Item MANGO_HOE = registerItem("mango_hoe",
            new HoeItem(ModToolMaterial.MANGO, 2, 2.0f, new FabricItemSettings()));
    public static final Item MANGO_SWORD = registerItem("mango_sword",
            new SwordItem(ModToolMaterial.MANGO, 6, 2f, new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {

    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(FruitTrees.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FruitTrees.LOGGER.info("Registering Mod Items for " + FruitTrees.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}