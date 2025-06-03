package me.tnoctua.bladeoil.init;

import me.tnoctua.bladeoil.BladeOil;
import net.minecraft.item.Item;
import net.minecraft.registry.tag.TagKey;

import static me.tnoctua.bladeoil.BladeOil.REGISTRY;

public class ModTags {

    public static final TagKey<Item> CAN_BE_OILED = REGISTRY.itemTag("can_be_oiled");

    /**
     * Statically initializes mod tags.
     */
    public static void init() {
        BladeOil.LOGGER.debug("Registering mod tags!");
    }

}
