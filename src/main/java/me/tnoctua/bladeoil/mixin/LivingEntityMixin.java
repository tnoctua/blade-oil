package me.tnoctua.bladeoil.mixin;

import me.tnoctua.bladeoil.init.ModComponents;
import me.tnoctua.bladeoil.init.impl.component.BladeOilComponent;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {

	@Inject(method = "modifyAppliedDamage", at = @At(value = "HEAD"), cancellable = true)
	private void modifyAppliedDamage(DamageSource source, float amount, CallbackInfoReturnable<Float> cir) {
		if (source.getSource() instanceof PlayerEntity && source.isDirect() && source.getWeaponStack() != null) {
			ItemStack stack = source.getWeaponStack();
			BladeOilComponent oil = stack.get(ModComponents.BLADE_OIL);
			LivingEntity living = (LivingEntity) (Object) this;
			if (oil != null && oil.isEffectiveAgainst(living)) {
				if (oil.quality() > 1) {
					stack.set(ModComponents.BLADE_OIL, oil.decrement());
				} else {
					stack.remove(ModComponents.BLADE_OIL);
					stack.remove(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE);
				}
				cir.setReturnValue(amount + oil.damage());
			}
		}
	}

}