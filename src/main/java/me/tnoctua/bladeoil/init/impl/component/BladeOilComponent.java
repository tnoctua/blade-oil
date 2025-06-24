package me.tnoctua.bladeoil.init.impl.component;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import me.tnoctua.bladeoil.BladeOilConfig;
import net.minecraft.component.ComponentsAccess;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.tooltip.TooltipAppender;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.dynamic.Codecs;

import java.awt.*;
import java.util.function.Consumer;

import static me.tnoctua.nmodutils.util.Utils.addTranslation;

public record BladeOilComponent(String type, int damage, int quality, int color, TagKey<EntityType<?>> entities) implements TooltipAppender {

    public static final Codec<BladeOilComponent> CODEC = RecordCodecBuilder.create(builder -> builder.group(
                    Codec.STRING.fieldOf("type").forGetter(BladeOilComponent::type),
                    Codec.INT.fieldOf("damage").forGetter(BladeOilComponent::damage),
                    Codec.INT.fieldOf("quality").forGetter(BladeOilComponent::quality),
                    Codecs.RGB.fieldOf("color").forGetter(BladeOilComponent::color),
                    TagKey.codec(RegistryKeys.ENTITY_TYPE).fieldOf("entities").forGetter(BladeOilComponent::entities))
            .apply(builder, BladeOilComponent::new));

    public BladeOilComponent(String type, int damage, int quality, int color, TagKey<EntityType<?>> entities) {
        this.type = type;
        this.damage = Math.max(0, damage);
        this.quality = Math.max(0, quality);
        this.color = color;
        this.entities = entities;
    }

    public BladeOilComponent(String type, int damage, int quality, Color color, TagKey<EntityType<?>> entities) {
        this(type, damage, quality, color.getRGB(), entities);
    }

    @Override
    public void appendTooltip(Item.TooltipContext context, Consumer<Text> textConsumer, TooltipType type, ComponentsAccess components) {
        textConsumer.accept(Text.translatable("tooltip.%s.oil_type.%s".formatted(BladeOilConfig.MOD_ID, this.type)).withColor(color)
                .append(Text.literal(" "))
                .append(Text.literal(Text.translatable("tooltip.%s.quality".formatted(BladeOilConfig.MOD_ID))
                        .getString().formatted(quality)).formatted(Formatting.GRAY)));
    }

    public boolean isEffectiveAgainst(LivingEntity entity) {
        return entity.getType().isIn(entities);
    }

    public BladeOilComponent decrement() {
        return new BladeOilComponent(type, damage, quality - 1, color, entities);
    }

    static {
        addTranslation("tooltip.%s.quality".formatted(BladeOilConfig.MOD_ID));
    }

}
