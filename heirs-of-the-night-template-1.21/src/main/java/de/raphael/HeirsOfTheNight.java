package de.raphael;

import de.raphael.item.ModItemGroups;
import de.raphael.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HeirsOfTheNight implements ModInitializer {
	public static final String MOD_ID = "heirs-of-the-night";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
	}
}