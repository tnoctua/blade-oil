package me.tnoctua.bladeoil.init;

import me.tnoctua.bladeoil.BladeOil;
import me.tnoctua.bladeoil.BladeOilConfig;
import me.tnoctua.bladeoil.init.impl.component.BladeOilComponent;
import me.tnoctua.bladeoil.init.impl.item.BladeOilItem;
import net.minecraft.item.Item;

import java.awt.*;

import static me.tnoctua.bladeoil.BladeOil.REGISTRY;

public class ModItems {

    public static final Color HOLY_COLOR = new Color(235, 225, 133);
    public static final Color INSECTOID_COLOR = new Color(142, 142, 55);
    public static final Color DAVY_JONES_COLOR = new Color(35, 133, 133);
    public static final Color ENDSPAWN_COLOR = new Color(80, 66, 172);
    public static final Color HANGED_MAN_COLOR = new Color(114, 226, 127);
    public static final Color RELICT_COLOR = new Color(218, 205, 193);
    public static final Color HELLSPAWN_COLOR = new Color(196, 76, 38);

    // Holy Oils (Undead)
    public static final Item HOLY_OIL = REGISTRY.register("holy_oil", BladeOilItem::new, new Item.Settings()
            .maxDamage(BladeOilConfig.holyOilAmount)
            .component(ModComponents.BLADE_OIL, new BladeOilComponent("holy", BladeOilConfig.holyOilDamage,
                    BladeOilConfig.holyOilQuality, HOLY_COLOR, ModTags.WEAK_TO_HOLY_OIL)));
    public static final Item ENHANCED_HOLY_OIL = REGISTRY.register("enhanced_holy_oil", BladeOilItem::new, new Item.Settings()
            .maxDamage(BladeOilConfig.enhancedHolyOilAmount)
            .component(ModComponents.BLADE_OIL, new BladeOilComponent("enhanced_holy", BladeOilConfig.enhancedHolyOilDamage,
                    BladeOilConfig.enhancedHolyOilQuality, HOLY_COLOR, ModTags.WEAK_TO_HOLY_OIL)));
    public static final Item SUPERIOR_HOLY_OIL = REGISTRY.register("superior_holy_oil", BladeOilItem::new, new Item.Settings()
            .maxDamage(BladeOilConfig.superiorHolyOilAmount)
            .component(ModComponents.BLADE_OIL, new BladeOilComponent("superior_holy", BladeOilConfig.superiorHolyOilDamage,
                    BladeOilConfig.superiorHolyOilQuality, HOLY_COLOR, ModTags.WEAK_TO_HOLY_OIL)));

    // Insectoid Oils (Arthropods)
    public static final Item INSECTOID_OIL = REGISTRY.register("insectoid_oil", BladeOilItem::new, new Item.Settings()
            .maxDamage(BladeOilConfig.insectoidOilAmount)
            .component(ModComponents.BLADE_OIL, new BladeOilComponent("insectoid", BladeOilConfig.insectoidOilDamage,
                    BladeOilConfig.insectoidOilQuality, INSECTOID_COLOR, ModTags.WEAK_TO_INSECTOID_OIL)));
    public static final Item ENHANCED_INSECTOID_OIL = REGISTRY.register("enhanced_insectoid_oil", BladeOilItem::new, new Item.Settings()
            .maxDamage(BladeOilConfig.enhancedInsectoidOilAmount)
            .component(ModComponents.BLADE_OIL, new BladeOilComponent("enhanced_insectoid", BladeOilConfig.enhancedInsectoidOilDamage,
                    BladeOilConfig.enhancedInsectoidOilQuality, INSECTOID_COLOR, ModTags.WEAK_TO_INSECTOID_OIL)));
    public static final Item SUPERIOR_INSECTOID_OIL = REGISTRY.register("superior_insectoid_oil", BladeOilItem::new, new Item.Settings()
            .maxDamage(BladeOilConfig.superiorInsectoidOilAmount)
            .component(ModComponents.BLADE_OIL, new BladeOilComponent("superior_insectoid", BladeOilConfig.superiorInsectoidOilDamage,
                    BladeOilConfig.superiorInsectoidOilQuality, INSECTOID_COLOR, ModTags.WEAK_TO_INSECTOID_OIL)));

    // Davy Jones Oils (Aquatic)
    public static final Item DAVY_JONES_OIL = REGISTRY.register("davy_jones_oil", BladeOilItem::new, new Item.Settings()
            .maxDamage(BladeOilConfig.davyJonesOilAmount)
            .component(ModComponents.BLADE_OIL, new BladeOilComponent("davy_jones", BladeOilConfig.davyJonesOilDamage,
                    BladeOilConfig.davyJonesOilQuality, DAVY_JONES_COLOR, ModTags.WEAK_TO_DAVY_JONES_OIL)));
    public static final Item ENHANCED_DAVY_JONES_OIL = REGISTRY.register("enhanced_davy_jones_oil", BladeOilItem::new, new Item.Settings()
            .maxDamage(BladeOilConfig.enhancedDavyJonesOilAmount)
            .component(ModComponents.BLADE_OIL, new BladeOilComponent("enhanced_davy_jones", BladeOilConfig.enhancedDavyJonesOilDamage,
                    BladeOilConfig.enhancedDavyJonesOilQuality, DAVY_JONES_COLOR, ModTags.WEAK_TO_DAVY_JONES_OIL)));
    public static final Item SUPERIOR_DAVY_JONES_OIL = REGISTRY.register("superior_davy_jones_oil", BladeOilItem::new, new Item.Settings()
            .maxDamage(BladeOilConfig.superiorDavyJonesOilAmount)
            .component(ModComponents.BLADE_OIL, new BladeOilComponent("superior_davy_jones", BladeOilConfig.superiorDavyJonesOilDamage,
                    BladeOilConfig.superiorDavyJonesOilQuality, DAVY_JONES_COLOR, ModTags.WEAK_TO_DAVY_JONES_OIL)));

    // Endspawn Oils ;)
    public static final Item ENDSPAWN_OIL = REGISTRY.register("endspawn_oil", BladeOilItem::new, new Item.Settings()
            .maxDamage(BladeOilConfig.endspawnOilAmount)
            .component(ModComponents.BLADE_OIL, new BladeOilComponent("endspawn", BladeOilConfig.endspawnOilDamage,
                    BladeOilConfig.endspawnOilQuality, ENDSPAWN_COLOR, ModTags.WEAK_TO_ENDSPAWN_OIL)));
    public static final Item ENHANCED_ENDSPAWN_OIL = REGISTRY.register("enhanced_endspawn_oil", BladeOilItem::new, new Item.Settings()
            .maxDamage(BladeOilConfig.enhancedEndspawnOilAmount)
            .component(ModComponents.BLADE_OIL, new BladeOilComponent("enhanced_endspawn", BladeOilConfig.enhancedEndspawnOilDamage,
                    BladeOilConfig.enhancedEndspawnOilQuality, ENDSPAWN_COLOR, ModTags.WEAK_TO_ENDSPAWN_OIL)));
    public static final Item SUPERIOR_ENDSPAWN_OIL = REGISTRY.register("superior_endspawn_oil", BladeOilItem::new, new Item.Settings()
            .maxDamage(BladeOilConfig.superiorEndspawnOilAmount)
            .component(ModComponents.BLADE_OIL, new BladeOilComponent("superior_endspawn", BladeOilConfig.superiorEndspawnOilDamage,
                    BladeOilConfig.superiorEndspawnOilQuality, ENDSPAWN_COLOR, ModTags.WEAK_TO_ENDSPAWN_OIL)));

    // Hanged Man's Venom (Humanoids)
    public static final Item HANGED_MAN_OIL = REGISTRY.register("hanged_man_oil", BladeOilItem::new, new Item.Settings()
            .maxDamage(BladeOilConfig.hangedManOilAmount)
            .component(ModComponents.BLADE_OIL, new BladeOilComponent("hanged_man", BladeOilConfig.hangedManOilDamage,
                    BladeOilConfig.hangedManOilQuality, HANGED_MAN_COLOR, ModTags.WEAK_TO_HANGED_MAN_OIL)));
    public static final Item ENHANCED_HANGED_MAN_OIL = REGISTRY.register("enhanced_hanged_man_oil", BladeOilItem::new, new Item.Settings()
            .maxDamage(BladeOilConfig.enhancedHangedManOilAmount)
            .component(ModComponents.BLADE_OIL, new BladeOilComponent("enhanced_hanged_man", BladeOilConfig.enhancedHangedManOilDamage,
                    BladeOilConfig.enhancedHangedManOilQuality, HANGED_MAN_COLOR, ModTags.WEAK_TO_HANGED_MAN_OIL)));
    public static final Item SUPERIOR_HANGED_MAN_OIL = REGISTRY.register("superior_hanged_man_oil", BladeOilItem::new, new Item.Settings()
            .maxDamage(BladeOilConfig.superiorHangedManOilAmount)
            .component(ModComponents.BLADE_OIL, new BladeOilComponent("superior_hanged_man", BladeOilConfig.superiorHangedManOilDamage,
                    BladeOilConfig.superiorHangedManOilQuality, HANGED_MAN_COLOR, ModTags.WEAK_TO_HANGED_MAN_OIL)));

    // Relict Oils (Uncommon Mobs)
    public static final Item RELICT_OIL = REGISTRY.register("relict_oil", BladeOilItem::new, new Item.Settings()
            .maxDamage(BladeOilConfig.relictOilAmount)
            .component(ModComponents.BLADE_OIL, new BladeOilComponent("relict", BladeOilConfig.relictOilDamage,
                    BladeOilConfig.relictOilQuality, RELICT_COLOR, ModTags.WEAK_TO_RELICT_OIL)));
    public static final Item ENHANCED_RELICT_OIL = REGISTRY.register("enhanced_relict_oil", BladeOilItem::new, new Item.Settings()
            .maxDamage(BladeOilConfig.enhancedRelictOilAmount)
            .component(ModComponents.BLADE_OIL, new BladeOilComponent("enhanced_relict", BladeOilConfig.enhancedRelictOilDamage,
                    BladeOilConfig.enhancedRelictOilQuality, RELICT_COLOR, ModTags.WEAK_TO_RELICT_OIL)));
    public static final Item SUPERIOR_RELICT_OIL = REGISTRY.register("superior_relict_oil", BladeOilItem::new, new Item.Settings()
            .maxDamage(BladeOilConfig.superiorRelictOilAmount)
            .component(ModComponents.BLADE_OIL, new BladeOilComponent("superior_relict", BladeOilConfig.superiorRelictOilDamage,
                    BladeOilConfig.superiorRelictOilQuality, RELICT_COLOR, ModTags.WEAK_TO_RELICT_OIL)));

    // Hellspawn Oils (Nether Mobs)
    public static final Item HELLSPAWN_OIL = REGISTRY.register("hellspawn_oil", BladeOilItem::new, new Item.Settings()
            .maxDamage(BladeOilConfig.hellspawnOilAmount)
            .component(ModComponents.BLADE_OIL, new BladeOilComponent("hellspawn", BladeOilConfig.hellspawnOilDamage,
                    BladeOilConfig.hellspawnOilQuality, HELLSPAWN_COLOR, ModTags.WEAK_TO_HELLSPAWN_OIL)));
    public static final Item ENHANCED_HELLSPAWN_OIL = REGISTRY.register("enhanced_hellspawn_oil", BladeOilItem::new, new Item.Settings()
            .maxDamage(BladeOilConfig.enhancedHellspawnOilAmount)
            .component(ModComponents.BLADE_OIL, new BladeOilComponent("enhanced_hellspawn", BladeOilConfig.enhancedHellspawnOilDamage,
                    BladeOilConfig.enhancedHellspawnOilQuality, HELLSPAWN_COLOR, ModTags.WEAK_TO_HELLSPAWN_OIL)));
    public static final Item SUPERIOR_HELLSPAWN_OIL = REGISTRY.register("superior_hellspawn_oil", BladeOilItem::new, new Item.Settings()
            .maxDamage(BladeOilConfig.superiorHellspawnOilAmount)
            .component(ModComponents.BLADE_OIL, new BladeOilComponent("superior_hellspawn", BladeOilConfig.superiorHellspawnOilDamage,
                    BladeOilConfig.superiorHellspawnOilQuality, HELLSPAWN_COLOR, ModTags.WEAK_TO_HELLSPAWN_OIL)));

    /**
     * Statically initializes mod items.
     */
    public static void init() {
        BladeOil.LOGGER.debug("Registering mod items!");
    }

}
