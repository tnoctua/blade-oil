package me.tnoctua.bladeoil.datagen.provider;

import me.tnoctua.bladeoil.init.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.entity.EntityType;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.EntityTypeTags;

import java.util.concurrent.CompletableFuture;

public class EntityTagProvider extends FabricTagProvider<EntityType<?>> {

    public EntityTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.ENTITY_TYPE, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.WEAK_TO_HOLY_OIL)
                .forceAddTag(EntityTypeTags.UNDEAD);
        getOrCreateTagBuilder(ModTags.WEAK_TO_INSECTOID_OIL)
                .forceAddTag(EntityTypeTags.ARTHROPOD);
        getOrCreateTagBuilder(ModTags.WEAK_TO_DAVY_JONES_OIL)
                .forceAddTag(EntityTypeTags.AQUATIC);
        getOrCreateTagBuilder(ModTags.WEAK_TO_ENDSPAWN_OIL)
                .add(EntityType.ENDERMITE)
                .add(EntityType.ENDER_DRAGON)
                .add(EntityType.ENDERMAN)
                .add(EntityType.SHULKER);
        getOrCreateTagBuilder(ModTags.WEAK_TO_HANGED_MAN_OIL)
                .forceAddTag(EntityTypeTags.ILLAGER)
                .add(EntityType.PLAYER)
                .add(EntityType.VILLAGER)
                .add(EntityType.WANDERING_TRADER)
                .add(EntityType.WITCH);
        getOrCreateTagBuilder(ModTags.WEAK_TO_RELICT_OIL)
                .add(EntityType.ALLAY)
                .add(EntityType.BREEZE)
                .add(EntityType.CREAKING)
                .add(EntityType.CREEPER)
                .add(EntityType.GHAST)
                .add(EntityType.SLIME)
                .add(EntityType.SNIFFER)
                .add(EntityType.VEX)
                .add(EntityType.WARDEN);
        getOrCreateTagBuilder(ModTags.WEAK_TO_HELLSPAWN_OIL)
                .add(EntityType.BLAZE)
                .add(EntityType.HOGLIN)
                .add(EntityType.MAGMA_CUBE)
                .add(EntityType.PIGLIN)
                .add(EntityType.PIGLIN_BRUTE)
                .add(EntityType.STRIDER);
    }

}
