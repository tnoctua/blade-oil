package me.tnoctua.bladeoil;

import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import me.tnoctua.nmodutils.util.ConfigHandler;

public class BladeOilConfig {

    public static ConfigHandler config;

    // CONSTANTS -------------------------------------------------------------------------------------------------------

    /** Hard-coded mod identifier. */
    public static final String MOD_ID = "bladeoil";

    // DAMAGE ----------------------------------------------------------------------------------------------------------

    /** Damage added when using basic holy oil. */
    public static int holyOilDamage = 4;
    /** Damage added when using enhanced holy oil. */
    public static int enhancedHolyOilDamage = 8;
    /** Damage added when using superior holy oil. */
    public static int superiorHolyOilDamage = 12;
    /** Damage added when using basic insectoid oil. */
    public static int insectoidOilDamage = 4;
    /** Damage added when using enhanced insectoid oil. */
    public static int enhancedInsectoidOilDamage = 8;
    /** Damage added when using superior insectoid oil. */
    public static int superiorInsectoidOilDamage = 12;
    /** Damage added when using basic davy jones oil. */
    public static int davyJonesOilDamage = 4;
    /** Damage added when using enhanced davy jones oil. */
    public static int enhancedDavyJonesOilDamage = 8;
    /** Damage added when using superior davy jones oil. */
    public static int superiorDavyJonesOilDamage = 12;
    /** Damage added when using basic endspawn oil. */
    public static int endspawnOilDamage = 4;
    /** Damage added when using enhanced endspawn oil. */
    public static int enhancedEndspawnOilDamage = 8;
    /** Damage added when using superior endspawn oil. */
    public static int superiorEndspawnOilDamage = 12;
    /** Damage added when using basic hanged man's venom. */
    public static int hangedManOilDamage = 2;
    /** Damage added when using enhanced hanged man's venom. */
    public static int enhancedHangedManOilDamage = 4;
    /** Damage added when using superior hanged man's venom. */
    public static int superiorHangedManOilDamage = 8;
    /** Damage added when using basic relict oil. */
    public static int relictOilDamage = 4;
    /** Damage added when using enhanced relict oil. */
    public static int enhancedRelictOilDamage = 8;
    /** Damage added when using superior relict oil. */
    public static int superiorRelictOilDamage = 12;
    /** Damage added when using basic hellspawn oil. */
    public static int hellspawnOilDamage = 4;
    /** Damage added when using enhanced hellspawn oil. */
    public static int enhancedHellspawnOilDamage = 8;
    /** Damage added when using superior hellspawn oil. */
    public static int superiorHellspawnOilDamage = 12;

    // QUALITY ---------------------------------------------------------------------------------------------------------

    /** Quality of basic holy oil. */
    public static int holyOilQuality = 16;
    /** Quality of enhanced holy oil. */
    public static int enhancedHolyOilQuality = 32;
    /** Quality of superior holy oil. */
    public static int superiorHolyOilQuality = 64;
    /** Quality of basic insectoid oil. */
    public static int insectoidOilQuality = 16;
    /** Quality of enhanced insectoid oil. */
    public static int enhancedInsectoidOilQuality = 32;
    /** Quality of superior insectoid oil. */
    public static int superiorInsectoidOilQuality = 64;
    /** Quality of basic davy jones oil. */
    public static int davyJonesOilQuality = 16;
    /** Quality of enhanced davy jones oil. */
    public static int enhancedDavyJonesOilQuality = 32;
    /** Quality of superior davy jones oil. */
    public static int superiorDavyJonesOilQuality = 64;
    /** Quality of basic endspawn oil. */
    public static int endspawnOilQuality = 16;
    /** Quality of enhanced endspawn oil. */
    public static int enhancedEndspawnOilQuality = 32;
    /** Quality of superior endspawn oil. */
    public static int superiorEndspawnOilQuality = 64;
    /** Quality of basic hanged man's venom. */
    public static int hangedManOilQuality = 16;
    /** Quality of enhanced hanged man's venom. */
    public static int enhancedHangedManOilQuality = 32;
    /** Quality of superior hanged man's venom. */
    public static int superiorHangedManOilQuality = 64;
    /** Quality of basic relict oil. */
    public static int relictOilQuality = 16;
    /** Quality of enhanced relict oil. */
    public static int enhancedRelictOilQuality = 32;
    /** Quality of superior relict oil. */
    public static int superiorRelictOilQuality = 64;
    /** Quality of basic hellspawn oil. */
    public static int hellspawnOilQuality = 16;
    /** Quality of enhanced hellspawn oil. */
    public static int enhancedHellspawnOilQuality = 32;
    /** Quality of superior hellspawn oil. */
    public static int superiorHellspawnOilQuality = 64;

    // AMOUNT ----------------------------------------------------------------------------------------------------------

    /** Amount of times basic holy oil can be used. */
    public static int holyOilAmount = 8;
    /** Amount of times enhanced holy oil can be used. */
    public static int enhancedHolyOilAmount = 8;
    /** Amount of times superior holy oil can be used. */
    public static int superiorHolyOilAmount = 16;
    /** Amount of times basic insectoid oil can be used. */
    public static int insectoidOilAmount = 8;
    /** Amount of times enhanced insectoid oil can be used. */
    public static int enhancedInsectoidOilAmount = 8;
    /** Amount of times superior insectoid oil can be used. */
    public static int superiorInsectoidOilAmount = 16;
    /** Amount of times basic davy jones oil can be used. */
    public static int davyJonesOilAmount = 8;
    /** Amount of times enhanced davy jones oil can be used. */
    public static int enhancedDavyJonesOilAmount = 8;
    /** Amount of times superior davy jones oil can be used. */
    public static int superiorDavyJonesOilAmount = 16;
    /** Amount of times basic endspawn oil can be used. */
    public static int endspawnOilAmount = 8;
    /** Amount of times enhanced endspawn oil can be used. */
    public static int enhancedEndspawnOilAmount = 8;
    /** Amount of times superior endspawn oil can be used. */
    public static int superiorEndspawnOilAmount = 16;
    /** Amount of times basic hanged man's venom can be used. */
    public static int hangedManOilAmount = 8;
    /** Amount of times enhanced hanged man's venom can be used. */
    public static int enhancedHangedManOilAmount = 8;
    /** Amount of times superior hanged man's venom can be used. */
    public static int superiorHangedManOilAmount = 16;
    /** Amount of times basic relict oil can be used. */
    public static int relictOilAmount = 8;
    /** Amount of times enhanced relict oil can be used. */
    public static int enhancedRelictOilAmount = 8;
    /** Amount of times superior relict oil can be used. */
    public static int superiorRelictOilAmount = 16;
    /** Amount of times basic hellspawn oil can be used. */
    public static int hellspawnOilAmount = 8;
    /** Amount of times enhanced hellspawn oil can be used. */
    public static int enhancedHellspawnOilAmount = 8;
    /** Amount of times superior hellspawn oil can be used. */
    public static int superiorHellspawnOilAmount = 16;

    // -----------------------------------------------------------------------------------------------------------------

    /**
     * Statically initializes the configuration system.
     */
    public static void init() {
        config = new ConfigHandler(MOD_ID, BladeOilConfig::toJson, BladeOilConfig::fromJson);
    }

    /**
     * Serializes in-memory configuration values as JSON and returns it.
     * @return JSON representation of current configuration
     */
    private static JsonObject toJson() {
        // Build JSON
        JsonObject json = new JsonObject();
        json.add("_comment", new JsonPrimitive("Blade Oil Configuration"));

        // Damage Category
        JsonObject damage = new JsonObject();
        damage.add("_comment", new JsonPrimitive("These settings control additional damage for each oil type"));
        damage.add("holy_oil_damage", new JsonPrimitive(holyOilDamage));
        damage.add("enhanced_holy_oil_damage", new JsonPrimitive(enhancedHolyOilDamage));
        damage.add("superior_holy_oil_damage", new JsonPrimitive(superiorHolyOilDamage));
        damage.add("insectoid_oil_damage", new JsonPrimitive(insectoidOilDamage));
        damage.add("enhanced_insectoid_oil_damage", new JsonPrimitive(enhancedInsectoidOilDamage));
        damage.add("superior_insectoid_oil_damage", new JsonPrimitive(superiorInsectoidOilDamage));
        damage.add("davy_jones_oil_damage", new JsonPrimitive(davyJonesOilDamage));
        damage.add("enhanced_davy_jones_oil_damage", new JsonPrimitive(enhancedDavyJonesOilDamage));
        damage.add("superior_davy_jones_oil_damage", new JsonPrimitive(superiorDavyJonesOilDamage));
        damage.add("endspawn_oil_damage", new JsonPrimitive(endspawnOilDamage));
        damage.add("enhanced_endspawn_oil_damage", new JsonPrimitive(enhancedEndspawnOilDamage));
        damage.add("superior_endspawn_oil_damage", new JsonPrimitive(superiorEndspawnOilDamage));
        damage.add("hanged_man_oil_damage", new JsonPrimitive(hangedManOilDamage));
        damage.add("enhanced_hanged_man_oil_damage", new JsonPrimitive(enhancedHangedManOilDamage));
        damage.add("superior_hanged_man_oil_damage", new JsonPrimitive(superiorHangedManOilDamage));
        damage.add("relict_oil_damage", new JsonPrimitive(relictOilDamage));
        damage.add("enhanced_relict_oil_damage", new JsonPrimitive(enhancedRelictOilDamage));
        damage.add("superior_relict_oil_damage", new JsonPrimitive(superiorRelictOilDamage));
        damage.add("hellspawn_oil_damage", new JsonPrimitive(hellspawnOilDamage));
        damage.add("enhanced_hellspawn_oil_damage", new JsonPrimitive(enhancedHellspawnOilDamage));
        damage.add("superior_hellspawn_oil_damage", new JsonPrimitive(superiorHellspawnOilDamage));
        json.add("damage", damage);

        // Quality Category
        JsonObject quality = new JsonObject();
        quality.add("_comment", new JsonPrimitive("Controls how many hits an applied oil will last for"));
        quality.add("holy_oil_quality", new JsonPrimitive(holyOilQuality));
        quality.add("enhanced_holy_oil_quality", new JsonPrimitive(enhancedHolyOilQuality));
        quality.add("superior_holy_oil_quality", new JsonPrimitive(superiorHolyOilQuality));
        quality.add("insectoid_oil_quality", new JsonPrimitive(insectoidOilQuality));
        quality.add("enhanced_insectoid_oil_quality", new JsonPrimitive(enhancedInsectoidOilQuality));
        quality.add("superior_insectoid_oil_quality", new JsonPrimitive(superiorInsectoidOilQuality));
        quality.add("davy_jones_oil_quality", new JsonPrimitive(davyJonesOilQuality));
        quality.add("enhanced_davy_jones_oil_quality", new JsonPrimitive(enhancedDavyJonesOilQuality));
        quality.add("superior_davy_jones_oil_quality", new JsonPrimitive(superiorDavyJonesOilQuality));
        quality.add("endspawn_oil_quality", new JsonPrimitive(endspawnOilQuality));
        quality.add("enhanced_endspawn_oil_quality", new JsonPrimitive(enhancedEndspawnOilQuality));
        quality.add("superior_endspawn_oil_quality", new JsonPrimitive(superiorEndspawnOilQuality));
        quality.add("hanged_man_oil_quality", new JsonPrimitive(hangedManOilQuality));
        quality.add("enhanced_hanged_man_oil_quality", new JsonPrimitive(enhancedHangedManOilQuality));
        quality.add("superior_hanged_man_oil_quality", new JsonPrimitive(superiorHangedManOilQuality));
        quality.add("relict_oil_quality", new JsonPrimitive(relictOilQuality));
        quality.add("enhanced_relict_oil_quality", new JsonPrimitive(enhancedRelictOilQuality));
        quality.add("superior_relict_oil_quality", new JsonPrimitive(superiorRelictOilQuality));
        quality.add("hellspawn_oil_quality", new JsonPrimitive(hellspawnOilQuality));
        quality.add("enhanced_hellspawn_oil_quality", new JsonPrimitive(enhancedHellspawnOilQuality));
        quality.add("superior_hellspawn_oil_quality", new JsonPrimitive(superiorHellspawnOilQuality));
        json.add("quality", quality);

        // Amount Category
        JsonObject amount = new JsonObject();
        amount.add("_comment", new JsonPrimitive("Controls how many times an oil can be applied before the bottle empties"));
        amount.add("holy_oil_amount", new JsonPrimitive(holyOilAmount));
        amount.add("enhanced_holy_oil_amount", new JsonPrimitive(enhancedHolyOilAmount));
        amount.add("superior_holy_oil_amount", new JsonPrimitive(superiorHolyOilAmount));
        amount.add("insectoid_oil_amount", new JsonPrimitive(insectoidOilAmount));
        amount.add("enhanced_insectoid_oil_amount", new JsonPrimitive(enhancedInsectoidOilAmount));
        amount.add("superior_insectoid_oil_amount", new JsonPrimitive(superiorInsectoidOilAmount));
        amount.add("davy_jones_oil_amount", new JsonPrimitive(davyJonesOilAmount));
        amount.add("enhanced_davy_jones_oil_amount", new JsonPrimitive(enhancedDavyJonesOilAmount));
        amount.add("superior_davy_jones_oil_amount", new JsonPrimitive(superiorDavyJonesOilAmount));
        amount.add("endspawn_oil_amount", new JsonPrimitive(endspawnOilAmount));
        amount.add("enhanced_endspawn_oil_amount", new JsonPrimitive(enhancedEndspawnOilAmount));
        amount.add("superior_endspawn_oil_amount", new JsonPrimitive(superiorEndspawnOilAmount));
        amount.add("hanged_man_oil_amount", new JsonPrimitive(hangedManOilAmount));
        amount.add("enhanced_hanged_man_oil_amount", new JsonPrimitive(enhancedHangedManOilAmount));
        amount.add("superior_hanged_man_oil_amount", new JsonPrimitive(superiorHangedManOilAmount));
        amount.add("relict_oil_amount", new JsonPrimitive(relictOilAmount));
        amount.add("enhanced_relict_oil_amount", new JsonPrimitive(enhancedRelictOilAmount));
        amount.add("superior_relict_oil_amount", new JsonPrimitive(superiorRelictOilAmount));
        amount.add("hellspawn_oil_amount", new JsonPrimitive(hellspawnOilAmount));
        amount.add("enhanced_hellspawn_oil_amount", new JsonPrimitive(enhancedHellspawnOilAmount));
        amount.add("superior_hellspawn_oil_amount", new JsonPrimitive(superiorHellspawnOilAmount));
        json.add("amount", amount);

        return json;
    }

    /**
     * Deserializes a JSON object into configuration values.
     */
    private static void fromJson(JsonObject json) {
        // Read Categories
        JsonObject damage = json.getAsJsonObject("damage");
        JsonObject quality = json.getAsJsonObject("quality");
        JsonObject amount = json.getAsJsonObject("amount");

        // Set Damage
        if (damage != null) {
            if (damage.get("holy_oil_damage") != null) {
                holyOilDamage = Math.max(damage.get("holy_oil_damage").getAsInt(), 0);
            }
            if (damage.get("enhanced_holy_oil_damage") != null) {
                enhancedHolyOilDamage = Math.max(damage.get("enhanced_holy_oil_damage").getAsInt(), 0);
            }
            if (damage.get("superior_holy_oil_damage") != null) {
                superiorHolyOilDamage = Math.max(damage.get("superior_holy_oil_damage").getAsInt(), 0);
            }
            if (damage.get("insectoid_oil_damage") != null) {
                insectoidOilDamage = Math.max(damage.get("insectoid_oil_damage").getAsInt(), 0);
            }
            if (damage.get("enhanced_insectoid_oil_damage") != null) {
                enhancedInsectoidOilDamage = Math.max(damage.get("enhanced_insectoid_oil_damage").getAsInt(), 0);
            }
            if (damage.get("superior_insectoid_oil_damage") != null) {
                superiorInsectoidOilDamage = Math.max(damage.get("superior_insectoid_oil_damage").getAsInt(), 0);
            }
            if (damage.get("davy_jones_oil_damage") != null) {
                davyJonesOilDamage = Math.max(damage.get("davy_jones_oil_damage").getAsInt(), 0);
            }
            if (damage.get("enhanced_davy_jones_oil_damage") != null) {
                enhancedDavyJonesOilDamage = Math.max(damage.get("enhanced_davy_jones_oil_damage").getAsInt(), 0);
            }
            if (damage.get("superior_davy_jones_oil_damage") != null) {
                superiorDavyJonesOilDamage = Math.max(damage.get("superior_davy_jones_oil_damage").getAsInt(), 0);
            }
            if (damage.get("endspawn_oil_damage") != null) {
                endspawnOilDamage = Math.max(damage.get("endspawn_oil_damage").getAsInt(), 0);
            }
            if (damage.get("enhanced_endspawn_oil_damage") != null) {
                enhancedEndspawnOilDamage = Math.max(damage.get("enhanced_endspawn_oil_damage").getAsInt(), 0);
            }
            if (damage.get("superior_endspawn_oil_damage") != null) {
                superiorEndspawnOilDamage = Math.max(damage.get("superior_endspawn_oil_damage").getAsInt(), 0);
            }
            if (damage.get("hanged_man_oil_damage") != null) {
                hangedManOilDamage = Math.max(damage.get("hanged_man_oil_damage").getAsInt(), 0);
            }
            if (damage.get("enhanced_hanged_man_oil_damage") != null) {
                enhancedHangedManOilDamage = Math.max(damage.get("enhanced_hanged_man_oil_damage").getAsInt(), 0);
            }
            if (damage.get("superior_hanged_man_oil_damage") != null) {
                superiorHangedManOilDamage = Math.max(damage.get("superior_hanged_man_oil_damage").getAsInt(), 0);
            }
            if (damage.get("relict_oil_damage") != null) {
                relictOilDamage = Math.max(damage.get("relict_oil_damage").getAsInt(), 0);
            }
            if (damage.get("enhanced_relict_oil_damage") != null) {
                enhancedRelictOilDamage = Math.max(damage.get("enhanced_relict_oil_damage").getAsInt(), 0);
            }
            if (damage.get("superior_relict_oil_damage") != null) {
                superiorRelictOilDamage = Math.max(damage.get("superior_relict_oil_damage").getAsInt(), 0);
            }
            if (damage.get("hellspawn_oil_damage") != null) {
                hellspawnOilDamage = Math.max(damage.get("hellspawn_oil_damage").getAsInt(), 0);
            }
            if (damage.get("enhanced_hellspawn_oil_damage") != null) {
                enhancedHellspawnOilDamage = Math.max(damage.get("enhanced_hellspawn_oil_damage").getAsInt(), 0);
            }
            if (damage.get("superior_hellspawn_oil_damage") != null) {
                superiorHellspawnOilDamage = Math.max(damage.get("superior_hellspawn_oil_damage").getAsInt(), 0);
            }
        }

        // Set Quality
        if (quality != null) {
            if (quality.get("holy_oil_quality") != null) {
                holyOilQuality = Math.max(quality.get("holy_oil_quality").getAsInt(), 0);
            }
            if (quality.get("enhanced_holy_oil_quality") != null) {
                enhancedHolyOilQuality = Math.max(quality.get("enhanced_holy_oil_quality").getAsInt(), 0);
            }
            if (quality.get("superior_holy_oil_quality") != null) {
                superiorHolyOilQuality = Math.max(quality.get("superior_holy_oil_quality").getAsInt(), 0);
            }
            if (quality.get("insectoid_oil_quality") != null) {
                insectoidOilQuality = Math.max(quality.get("insectoid_oil_quality").getAsInt(), 0);
            }
            if (quality.get("enhanced_insectoid_oil_quality") != null) {
                enhancedInsectoidOilQuality = Math.max(quality.get("enhanced_insectoid_oil_quality").getAsInt(), 0);
            }
            if (quality.get("superior_insectoid_oil_quality") != null) {
                superiorInsectoidOilQuality = Math.max(quality.get("superior_insectoid_oil_quality").getAsInt(), 0);
            }
            if (quality.get("davy_jones_oil_quality") != null) {
                davyJonesOilQuality = Math.max(quality.get("davy_jones_oil_quality").getAsInt(), 0);
            }
            if (quality.get("enhanced_davy_jones_oil_quality") != null) {
                enhancedDavyJonesOilQuality = Math.max(quality.get("enhanced_davy_jones_oil_quality").getAsInt(), 0);
            }
            if (quality.get("superior_davy_jones_oil_quality") != null) {
                superiorDavyJonesOilQuality = Math.max(quality.get("superior_davy_jones_oil_quality").getAsInt(), 0);
            }
            if (quality.get("endspawn_oil_quality") != null) {
                endspawnOilQuality = Math.max(quality.get("endspawn_oil_quality").getAsInt(), 0);
            }
            if (quality.get("enhanced_endspawn_oil_quality") != null) {
                enhancedEndspawnOilQuality = Math.max(quality.get("enhanced_endspawn_oil_quality").getAsInt(), 0);
            }
            if (quality.get("superior_endspawn_oil_quality") != null) {
                superiorEndspawnOilQuality = Math.max(quality.get("superior_endspawn_oil_quality").getAsInt(), 0);
            }
            if (quality.get("hanged_man_oil_quality") != null) {
                hangedManOilQuality = Math.max(quality.get("hanged_man_oil_quality").getAsInt(), 0);
            }
            if (quality.get("enhanced_hanged_man_oil_quality") != null) {
                enhancedHangedManOilQuality = Math.max(quality.get("enhanced_hanged_man_oil_quality").getAsInt(), 0);
            }
            if (quality.get("superior_hanged_man_oil_quality") != null) {
                superiorHangedManOilQuality = Math.max(quality.get("superior_hanged_man_oil_quality").getAsInt(), 0);
            }
            if (quality.get("relict_oil_quality") != null) {
                relictOilQuality = Math.max(quality.get("relict_oil_quality").getAsInt(), 0);
            }
            if (quality.get("enhanced_relict_oil_quality") != null) {
                enhancedRelictOilQuality = Math.max(quality.get("enhanced_relict_oil_quality").getAsInt(), 0);
            }
            if (quality.get("superior_relict_oil_quality") != null) {
                superiorRelictOilQuality = Math.max(quality.get("superior_relict_oil_quality").getAsInt(), 0);
            }
            if (quality.get("hellspawn_oil_quality") != null) {
                hellspawnOilQuality = Math.max(quality.get("hellspawn_oil_quality").getAsInt(), 0);
            }
            if (quality.get("enhanced_hellspawn_oil_quality") != null) {
                enhancedHellspawnOilQuality = Math.max(quality.get("enhanced_hellspawn_oil_quality").getAsInt(), 0);
            }
            if (quality.get("superior_hellspawn_oil_quality") != null) {
                superiorHellspawnOilQuality = Math.max(quality.get("superior_hellspawn_oil_quality").getAsInt(), 0);
            }
        }

        // Set Amount
        if (amount != null) {
            if (amount.get("holy_oil_amount") != null) {
                holyOilAmount = Math.max(amount.get("holy_oil_amount").getAsInt(), 0);
            }
            if (amount.get("enhanced_holy_oil_amount") != null) {
                enhancedHolyOilAmount = Math.max(amount.get("enhanced_holy_oil_amount").getAsInt(), 0);
            }
            if (amount.get("superior_holy_oil_amount") != null) {
                superiorHolyOilAmount = Math.max(amount.get("superior_holy_oil_amount").getAsInt(), 0);
            }
            if (amount.get("insectoid_oil_amount") != null) {
                insectoidOilAmount = Math.max(amount.get("insectoid_oil_amount").getAsInt(), 0);
            }
            if (amount.get("enhanced_insectoid_oil_amount") != null) {
                enhancedInsectoidOilAmount = Math.max(amount.get("enhanced_insectoid_oil_amount").getAsInt(), 0);
            }
            if (amount.get("superior_insectoid_oil_amount") != null) {
                superiorInsectoidOilAmount = Math.max(amount.get("superior_insectoid_oil_amount").getAsInt(), 0);
            }
            if (amount.get("davy_jones_oil_amount") != null) {
                davyJonesOilAmount = Math.max(amount.get("davy_jones_oil_amount").getAsInt(), 0);
            }
            if (amount.get("enhanced_davy_jones_oil_amount") != null) {
                enhancedDavyJonesOilAmount = Math.max(amount.get("enhanced_davy_jones_oil_amount").getAsInt(), 0);
            }
            if (amount.get("superior_davy_jones_oil_amount") != null) {
                superiorDavyJonesOilAmount = Math.max(amount.get("superior_davy_jones_oil_amount").getAsInt(), 0);
            }
            if (amount.get("endspawn_oil_amount") != null) {
                endspawnOilAmount = Math.max(amount.get("endspawn_oil_amount").getAsInt(), 0);
            }
            if (amount.get("enhanced_endspawn_oil_amount") != null) {
                enhancedEndspawnOilAmount = Math.max(amount.get("enhanced_endspawn_oil_amount").getAsInt(), 0);
            }
            if (amount.get("superior_endspawn_oil_amount") != null) {
                superiorEndspawnOilAmount = Math.max(amount.get("superior_endspawn_oil_amount").getAsInt(), 0);
            }
            if (amount.get("hanged_man_oil_amount") != null) {
                hangedManOilAmount = Math.max(amount.get("hanged_man_oil_amount").getAsInt(), 0);
            }
            if (amount.get("enhanced_hanged_man_oil_amount") != null) {
                enhancedHangedManOilAmount = Math.max(amount.get("enhanced_hanged_man_oil_amount").getAsInt(), 0);
            }
            if (amount.get("superior_hanged_man_oil_amount") != null) {
                superiorHangedManOilAmount = Math.max(amount.get("superior_hanged_man_oil_amount").getAsInt(), 0);
            }
            if (amount.get("relict_oil_amount") != null) {
                relictOilAmount = Math.max(amount.get("relict_oil_amount").getAsInt(), 0);
            }
            if (amount.get("enhanced_relict_oil_amount") != null) {
                enhancedRelictOilAmount = Math.max(amount.get("enhanced_relict_oil_amount").getAsInt(), 0);
            }
            if (amount.get("superior_relict_oil_amount") != null) {
                superiorRelictOilAmount = Math.max(amount.get("superior_relict_oil_amount").getAsInt(), 0);
            }
            if (amount.get("hellspawn_oil_amount") != null) {
                hellspawnOilAmount = Math.max(amount.get("hellspawn_oil_amount").getAsInt(), 0);
            }
            if (amount.get("enhanced_hellspawn_oil_amount") != null) {
                enhancedHellspawnOilAmount = Math.max(amount.get("enhanced_hellspawn_oil_amount").getAsInt(), 0);
            }
            if (amount.get("superior_hellspawn_oil_amount") != null) {
                superiorHellspawnOilAmount = Math.max(amount.get("superior_hellspawn_oil_amount").getAsInt(), 0);
            }
        }

    }

}
