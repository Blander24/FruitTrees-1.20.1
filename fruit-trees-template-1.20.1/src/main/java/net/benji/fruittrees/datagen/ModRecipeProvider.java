package net.benji.fruittrees.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.benji.fruittrees.block.ModBlocks;
import net.benji.fruittrees.item.ModItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> MANGO_SMELTABLES = List.of(ModItems.MANGO);
    private static final List<ItemConvertible> MANGO_BLASTABLES = List.of(ModItems.COOKED_MANGO);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, MANGO_SMELTABLES, RecipeCategory.MISC, ModItems.COOKED_MANGO,
                0.7f, 200, "mango");
        offerBlasting(exporter, MANGO_BLASTABLES, RecipeCategory.MISC, ModItems.MANGO_INGOT,
                0.7f, 100, "mango");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MANGO_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.MANGO_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MANGO_PICKAXE, 1)
                .pattern("MMM")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('M', ModItems.MANGO_INGOT)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.MANGO_INGOT), conditionsFromItem(ModItems.MANGO_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MANGO_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MANGO_AXE, 1)
                .pattern("MM")
                .pattern("SM")
                .pattern("S ")
                .input('S', Items.STICK)
                .input('M', ModItems.MANGO_INGOT)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.MANGO_INGOT), conditionsFromItem(ModItems.MANGO_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MANGO_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MANGO_HOE, 1)
                .pattern("MM")
                .pattern("S ")
                .pattern("S ")
                .input('S', Items.STICK)
                .input('M', ModItems.MANGO_INGOT)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.MANGO_INGOT), conditionsFromItem(ModItems.MANGO_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MANGO_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MANGO_SHOVEL, 1)
                .pattern("M")
                .pattern("S")
                .pattern("S")
                .input('S', Items.STICK)
                .input('M', ModItems.MANGO_INGOT)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.MANGO_INGOT), conditionsFromItem(ModItems.MANGO_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MANGO_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MANGO_SWORD, 1)
                .pattern("M")
                .pattern("M")
                .pattern("S")
                .input('S', Items.STICK)
                .input('M', ModItems.MANGO_INGOT)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.MANGO_INGOT), conditionsFromItem(ModItems.MANGO_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MANGO_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MANGO_HELMET, 1)
                .pattern("MMM")
                .pattern("M M")
                .input('M', ModItems.MANGO_INGOT)
                .criterion(hasItem(ModItems.MANGO_INGOT), conditionsFromItem(ModItems.MANGO_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MANGO_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MANGO_CHESTPLATE, 1)
                .pattern("M M")
                .pattern("MMM")
                .pattern("MMM")
                .input('M', ModItems.MANGO_INGOT)
                .criterion(hasItem(ModItems.MANGO_INGOT), conditionsFromItem(ModItems.MANGO_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MANGO_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MANGO_LEGGINGS, 1)
                .pattern("MMM")
                .pattern("M M")
                .pattern("M M")
                .input('M', ModItems.MANGO_INGOT)
                .criterion(hasItem(ModItems.MANGO_INGOT), conditionsFromItem(ModItems.MANGO_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MANGO_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MANGO_BOOTS, 1)
                .pattern("M M")
                .pattern("M M")
                .input('M', ModItems.MANGO_INGOT)
                .criterion(hasItem(ModItems.MANGO_INGOT), conditionsFromItem(ModItems.MANGO_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MANGO_BOOTS)));

    }
}