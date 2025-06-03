package me.tnoctua.bladeoil.datagen.provider;

import me.tnoctua.bladeoil.init.ModItems;
import me.tnoctua.nmodutils.datagen.NModRecipeGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class RecipeProvider extends FabricRecipeProvider {

    public RecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new NModRecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                RegistryWrapper.Impl<Item> itemLookup = registries.getOrThrow(RegistryKeys.ITEM);
                // TODO: Match water bottle, maybe ComponentsIngredient?
                // TODO: Revise recipes to something more sensible

                // Holy Oils
                createShapeless(RecipeCategory.COMBAT, ModItems.HOLY_OIL)
                        .input(Items.POTION)
                        .input(Items.OXEYE_DAISY)
                        .input(Items.ALLIUM)
                        .input(Items.GOLD_NUGGET)
                        .criterion(hasItem(Items.OXEYE_DAISY), conditionsFromItem(Items.OXEYE_DAISY))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.COMBAT, ModItems.ENHANCED_HOLY_OIL)
                        .input(ModItems.HOLY_OIL)
                        .input(Items.GLISTERING_MELON_SLICE)
                        .input(Items.GHAST_TEAR)
                        .input(Items.GOLD_INGOT)
                        .criterion(hasItem(ModItems.HOLY_OIL), conditionsFromItem(ModItems.HOLY_OIL))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.COMBAT, ModItems.SUPERIOR_HOLY_OIL)
                        .input(ModItems.ENHANCED_HOLY_OIL)
                        .input(Items.TORCHFLOWER)
                        .input(Items.WILDFLOWERS)
                        .input(Items.GOLD_INGOT)
                        .criterion(hasItem(ModItems.ENHANCED_HOLY_OIL), conditionsFromItem(ModItems.ENHANCED_HOLY_OIL))
                        .offerTo(exporter);

                // Insectoid Oils
                createShapeless(RecipeCategory.COMBAT, ModItems.INSECTOID_OIL)
                        .input(Items.POTION)
                        .input(Items.SUGAR)
                        .input(Items.SLIME_BALL)
                        .input(Items.BEEF)
                        .criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.SUGAR))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.COMBAT, ModItems.ENHANCED_INSECTOID_OIL)
                        .input(ModItems.INSECTOID_OIL)
                        .input(Items.SUGAR)
                        .input(Items.NETHER_WART)
                        .input(Items.STRING)
                        .criterion(hasItem(ModItems.INSECTOID_OIL), conditionsFromItem(ModItems.INSECTOID_OIL))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.COMBAT, ModItems.SUPERIOR_INSECTOID_OIL)
                        .input(ModItems.ENHANCED_INSECTOID_OIL)
                        .input(Items.TORCHFLOWER)
                        .input(Items.LILY_OF_THE_VALLEY)
                        .input(Items.BONE_MEAL)
                        .criterion(hasItem(ModItems.ENHANCED_INSECTOID_OIL), conditionsFromItem(ModItems.ENHANCED_INSECTOID_OIL))
                        .offerTo(exporter);

                // Davy Jones Oils
                createShapeless(RecipeCategory.COMBAT, ModItems.DAVY_JONES_OIL)
                        .input(Items.POTION)
                        .input(Items.CACTUS_FLOWER)
                        .input(Items.AZURE_BLUET)
                        .input(Items.BONE_MEAL)
                        .criterion(hasItem(Items.CACTUS_FLOWER), conditionsFromItem(Items.CACTUS_FLOWER))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.COMBAT, ModItems.ENHANCED_DAVY_JONES_OIL)
                        .input(ModItems.DAVY_JONES_OIL)
                        .input(Items.NAUTILUS_SHELL)
                        .input(Items.PUFFERFISH)
                        .input(Items.BROWN_MUSHROOM)
                        .criterion(hasItem(ModItems.DAVY_JONES_OIL), conditionsFromItem(ModItems.DAVY_JONES_OIL))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.COMBAT, ModItems.SUPERIOR_DAVY_JONES_OIL)
                        .input(ModItems.ENHANCED_DAVY_JONES_OIL)
                        .input(Items.HEART_OF_THE_SEA)
                        .input(Items.NAUTILUS_SHELL)
                        .input(Items.PHANTOM_MEMBRANE)
                        .criterion(hasItem(ModItems.ENHANCED_DAVY_JONES_OIL), conditionsFromItem(ModItems.ENHANCED_DAVY_JONES_OIL))
                        .offerTo(exporter);

                // Endspawn Oils
                createShapeless(RecipeCategory.COMBAT, ModItems.ENDSPAWN_OIL)
                        .input(Items.POTION)
                        .input(Items.ENDER_EYE)
                        .input(Items.WARPED_FUNGUS)
                        .input(Items.BONE_MEAL)
                        .criterion(hasItem(Items.ENDER_EYE), conditionsFromItem(Items.ENDER_EYE))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.COMBAT, ModItems.ENHANCED_ENDSPAWN_OIL)
                        .input(ModItems.ENDSPAWN_OIL)
                        .input(Items.ICE)
                        .input(Items.BLAZE_POWDER)
                        .input(Items.PUMPKIN)
                        .criterion(hasItem(ModItems.ENDSPAWN_OIL), conditionsFromItem(ModItems.ENDSPAWN_OIL))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.COMBAT, ModItems.SUPERIOR_ENDSPAWN_OIL)
                        .input(ModItems.ENHANCED_ENDSPAWN_OIL)
                        .input(Items.OPEN_EYEBLOSSOM)
                        .input(Items.GOLD_NUGGET)
                        .input(Items.PHANTOM_MEMBRANE)
                        .criterion(hasItem(ModItems.ENHANCED_ENDSPAWN_OIL), conditionsFromItem(ModItems.ENHANCED_ENDSPAWN_OIL))
                        .offerTo(exporter);

                // Hanged Man's Venom
                createShapeless(RecipeCategory.COMBAT, ModItems.HANGED_MAN_OIL)
                        .input(Items.POTION)
                        .input(Items.SPIDER_EYE)
                        .input(Items.LILY_OF_THE_VALLEY)
                        .input(Items.PUFFERFISH)
                        .criterion(hasItem(Items.SPIDER_EYE), conditionsFromItem(Items.SPIDER_EYE))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.COMBAT, ModItems.ENHANCED_HANGED_MAN_OIL)
                        .input(ModItems.HANGED_MAN_OIL)
                        .input(Items.FERMENTED_SPIDER_EYE)
                        .input(Items.LILY_OF_THE_VALLEY)
                        .input(Items.NETHER_WART)
                        .criterion(hasItem(ModItems.HANGED_MAN_OIL), conditionsFromItem(ModItems.HANGED_MAN_OIL))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.COMBAT, ModItems.SUPERIOR_HANGED_MAN_OIL)
                        .input(ModItems.ENHANCED_HANGED_MAN_OIL)
                        .input(Items.WITHER_ROSE)
                        .input(Items.WARPED_FUNGUS)
                        .input(Items.CHORUS_FRUIT)
                        .criterion(hasItem(ModItems.ENHANCED_HANGED_MAN_OIL), conditionsFromItem(ModItems.ENHANCED_HANGED_MAN_OIL))
                        .offerTo(exporter);

                // Relict Oils
                createShapeless(RecipeCategory.COMBAT, ModItems.RELICT_OIL)
                        .input(Items.POTION)
                        .input(Items.CRIMSON_FUNGUS)
                        .input(Items.BEETROOT)
                        .input(Items.PHANTOM_MEMBRANE)
                        .criterion(hasItem(Items.CRIMSON_FUNGUS), conditionsFromItem(Items.CRIMSON_FUNGUS))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.COMBAT, ModItems.ENHANCED_RELICT_OIL)
                        .input(ModItems.RELICT_OIL)
                        .input(Items.RABBIT_FOOT)
                        .input(Items.BLAZE_POWDER)
                        .input(Items.CORNFLOWER)
                        .criterion(hasItem(ModItems.RELICT_OIL), conditionsFromItem(ModItems.RELICT_OIL))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.COMBAT, ModItems.SUPERIOR_RELICT_OIL)
                        .input(ModItems.ENHANCED_RELICT_OIL)
                        .input(Items.CHORUS_FRUIT)
                        .input(Items.BEETROOT)
                        .input(Items.BREEZE_ROD)
                        .criterion(hasItem(ModItems.ENHANCED_RELICT_OIL), conditionsFromItem(ModItems.ENHANCED_RELICT_OIL))
                        .offerTo(exporter);

                // Hellspawn Oils
                createShapeless(RecipeCategory.COMBAT, ModItems.HELLSPAWN_OIL)
                        .input(Items.POTION)
                        .input(Items.MAGMA_CREAM)
                        .input(Items.ALLIUM)
                        .input(Items.SUNFLOWER)
                        .criterion(hasItem(Items.MAGMA_CREAM), conditionsFromItem(Items.MAGMA_CREAM))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.COMBAT, ModItems.ENHANCED_HELLSPAWN_OIL)
                        .input(ModItems.HELLSPAWN_OIL)
                        .input(Items.GHAST_TEAR)
                        .input(Items.SLIME_BALL)
                        .input(Items.ROTTEN_FLESH)
                        .criterion(hasItem(ModItems.HELLSPAWN_OIL), conditionsFromItem(ModItems.HELLSPAWN_OIL))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.COMBAT, ModItems.SUPERIOR_HELLSPAWN_OIL)
                        .input(ModItems.ENHANCED_HELLSPAWN_OIL)
                        .input(Items.PITCHER_PLANT)
                        .input(Items.ALLIUM)
                        .input(Items.BREEZE_ROD)
                        .criterion(hasItem(ModItems.ENHANCED_HELLSPAWN_OIL), conditionsFromItem(ModItems.ENHANCED_HELLSPAWN_OIL))
                        .offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() {
        return "Blade Oil Recipe Provider";
    }

}
