package me.tnoctua.bladeoil.init;

import me.tnoctua.bladeoil.BladeOil;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.registry.tag.TagKey;

import static me.tnoctua.bladeoil.BladeOil.REGISTRY;

public class ModTags {

    public static final TagKey<Item> CAN_BE_OILED = REGISTRY.itemTag("can_be_oiled");
    public static final TagKey<EntityType<?>> WEAK_TO_HOLY_OIL = REGISTRY.entityTag("weak_to_holy_oil");
    public static final TagKey<EntityType<?>> WEAK_TO_INSECTOID_OIL = REGISTRY.entityTag("weak_to_insectoid_oil");
    public static final TagKey<EntityType<?>> WEAK_TO_DAVY_JONES_OIL = REGISTRY.entityTag("weak_to_davy_jones_oil");
    public static final TagKey<EntityType<?>> WEAK_TO_ENDSPAWN_OIL = REGISTRY.entityTag("weak_to_endspawn_oil");
    public static final TagKey<EntityType<?>> WEAK_TO_HANGED_MAN_OIL = REGISTRY.entityTag("weak_to_hanged_man_oil");
    public static final TagKey<EntityType<?>> WEAK_TO_RELICT_OIL = REGISTRY.entityTag("weak_to_relict_oil");
    public static final TagKey<EntityType<?>> WEAK_TO_HELLSPAWN_OIL = REGISTRY.entityTag("weak_to_hellspawn_oil");

    /**
     * Statically initializes mod tags.
     */
    public static void init() {
        BladeOil.LOGGER.debug("Registering mod tags!");
    }

}
