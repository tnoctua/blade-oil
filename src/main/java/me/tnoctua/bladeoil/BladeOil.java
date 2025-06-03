package me.tnoctua.bladeoil;

import me.tnoctua.bladeoil.init.ModComponents;
import me.tnoctua.bladeoil.init.ModItemGroups;
import me.tnoctua.bladeoil.init.ModItems;
import me.tnoctua.bladeoil.init.ModTags;
import me.tnoctua.nmodutils.util.ModRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static me.tnoctua.bladeoil.BladeOilConfig.MOD_ID;
import static me.tnoctua.nmodutils.util.Utils.addTranslation;

public class BladeOil implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Blade Oil");
	public static final ModContainer MOD = FabricLoader.getInstance().getModContainer(MOD_ID).isPresent()
			? FabricLoader.getInstance().getModContainer(MOD_ID).get() : null;
	public static final ModRegistry REGISTRY = new ModRegistry(MOD_ID);

	@Override
	public void onInitialize() {
		BladeOilConfig.init(); // Initialize configuration system
		ModTags.init(); // Initialize item tags
		ModComponents.init(); // Initialize components
		ModItems.init(); // Initialize items
		ModItemGroups.init(); // Initialize item groups
	}

	static {
		addTranslation("title.%s".formatted(MOD_ID));
	}

}