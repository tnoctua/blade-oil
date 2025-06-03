package me.tnoctua.bladeoil.datagen.provider;

import me.tnoctua.bladeoil.BladeOil;
import me.tnoctua.nmodutils.datagen.NModLangProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class EnglishLangProvider extends NModLangProvider {

    public EnglishLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(BladeOil.REGISTRY, dataOutput, "en_us", registryLookup);
    }
}
