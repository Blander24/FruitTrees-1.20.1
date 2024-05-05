package net.benji.fruittrees;

import net.benji.fruittrees.block.ModBlocks;
import net.benji.fruittrees.item.ModItemGroups;
import net.fabricmc.api.ModInitializer;

import net.benji.fruittrees.item.ModItems;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FruitTrees implements ModInitializer {
	public static final String MOD_ID = "fruittrees";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MANGO_LEAVES, RenderLayer.getTranslucent());

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}