package com.github.yitzy299.advancedtransport.items;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AtItems {
    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("advancedtransport", "titanium_ingot"), TitaniumIngot.ITEM);
    }
}
