package me.tnoctua.bladeoil.datagen;

import me.tnoctua.bladeoil.BladeOil;
import me.tnoctua.bladeoil.datagen.provider.*;
import me.tnoctua.nmodutils.datagen.NModEmptyLangProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class BladeOilDataGenerator implements DataGeneratorEntrypoint {

	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(ModelProvider::new);
		pack.addProvider(RecipeProvider::new);
		pack.addProvider(ItemTagProvider::new);
		pack.addProvider(EntityTagProvider::new);
		pack.addProvider((data, registries) -> new NModEmptyLangProvider(BladeOil.REGISTRY, data, registries));
		pack.addProvider(EnglishLangProvider::new);
	}

}
