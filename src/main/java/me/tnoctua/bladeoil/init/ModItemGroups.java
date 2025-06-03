package me.tnoctua.bladeoil.init;

import me.tnoctua.bladeoil.BladeOil;
import me.tnoctua.bladeoil.BladeOilConfig;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;

import static me.tnoctua.bladeoil.BladeOil.REGISTRY;
import static me.tnoctua.nmodutils.util.Utils.addTranslation;

public class ModItemGroups {

    public static final RegistryKey<ItemGroup> BLADE_OIL_ITEM_GROUP = REGISTRY.register("common", FabricItemGroup.builder()
            .icon(ModItems.ENHANCED_HANGED_MAN_OIL::getDefaultStack)
            .displayName(addTranslation("itemGroup.%s".formatted(BladeOilConfig.MOD_ID)))
            .build());

    /**
     * Initializes mod item groups.
     */
    public static void init() {
        BladeOil.LOGGER.debug("Registering mod item groups!");
        ItemGroupEvents.modifyEntriesEvent(BLADE_OIL_ITEM_GROUP).register(itemGroup -> {
            REGISTRY.ITEMS.forEach(itemGroup::add);
        });
    }

}
