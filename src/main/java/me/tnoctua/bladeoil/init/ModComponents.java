package me.tnoctua.bladeoil.init;

import me.tnoctua.bladeoil.init.impl.component.BladeOilComponent;
import net.minecraft.component.ComponentType;
import net.minecraft.network.codec.PacketCodecs;

import static me.tnoctua.bladeoil.BladeOil.REGISTRY;

public class ModComponents {

    public static final ComponentType<BladeOilComponent> BLADE_OIL = REGISTRY.register("blade_oil", builder ->
            builder.codec(BladeOilComponent.CODEC).packetCodec(PacketCodecs.codec(BladeOilComponent.CODEC)));

    /**
     * Statically initializes mod components.
     */
    public static void init() {}

}
