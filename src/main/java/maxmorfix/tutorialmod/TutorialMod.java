package maxmorfix.tutorialmod;

import maxmorfix.tutorialmod.block.ModBlocks;
import maxmorfix.tutorialmod.item.ModItemGroups;
import maxmorfix.tutorialmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and
	public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}