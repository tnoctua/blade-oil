package me.tnoctua.bladeoil.init.impl.item;

import me.tnoctua.bladeoil.BladeOilConfig;
import me.tnoctua.bladeoil.init.ModComponents;
import me.tnoctua.bladeoil.init.ModTags;
import me.tnoctua.bladeoil.init.impl.component.BladeOilComponent;
import me.tnoctua.nmodutils.init.impl.item.GenericItem;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.slot.Slot;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ClickType;
import net.minecraft.util.Colors;

import java.util.ArrayList;

import static me.tnoctua.nmodutils.util.Utils.addTranslation;

public class BladeOilItem extends GenericItem {

    public static final BladeOilComponent EMPTY_OIL = new BladeOilComponent("empty", 0, 0, Colors.GRAY, new ArrayList<>());
    private final BladeOilComponent OIL;

    public BladeOilItem(Settings settings) {
        super(settings);
        OIL = getComponents().getOrDefault(ModComponents.BLADE_OIL, EMPTY_OIL);
        if (!OIL.equals(EMPTY_OIL)) {
            addTranslation("tooltip.%s.oil_type.%s".formatted(BladeOilConfig.MOD_ID, OIL.type()));
        }
    }

    @Override
    public boolean onStackClicked(ItemStack stack, Slot slot, ClickType clickType, PlayerEntity player) {
        ItemStack item = slot.getStack();
        if (!item.isEmpty() && clickType.equals(ClickType.RIGHT)) {
            if (canItemBeOiled(item) && !OIL.equals(EMPTY_OIL)) {
                item.set(ModComponents.BLADE_OIL, OIL);
                item.set(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true);
                if (stack.willBreakNextUse()) {
                    stack.decrement(1);
                    player.giveOrDropStack(new ItemStack(Items.GLASS_BOTTLE));
                }
                stack.damage(1, player);
                player.playSound(SoundEvents.ITEM_BOTTLE_FILL_DRAGONBREATH, 0.8f, 0.8f + player.getWorld().getRandom().nextFloat() * 0.4f);
            }
            return true;
        }
        return false;
    }

    public static boolean canItemBeOiled(ItemStack stack) {
        return stack.streamTags().anyMatch(tag -> tag.equals(ModTags.CAN_BE_OILED));
    }

}
