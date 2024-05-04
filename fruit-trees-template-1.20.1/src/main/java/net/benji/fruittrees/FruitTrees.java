package net.benji.fruittrees;

import net.benji.fruittrees.block.ModBlocks;
import net.benji.fruittrees.item.ModItemGroups;
import net.fabricmc.api.ModInitializer;

import net.benji.fruittrees.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FruitTrees implements ModInitializer {
	public static final String MOD_ID = "fruittrees";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}