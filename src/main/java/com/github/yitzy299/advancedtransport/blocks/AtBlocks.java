package com.github.yitzy299.advancedtransport.blocks;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AtBlocks {
    /*
    * This is a single-method class registering all blocks from a single method, to prevent bloat in AdvancedTransport.java
    */
    public static void register() {
        Registry.register(Registry.BLOCK, new Identifier("advancedtransport", "titanium_ore"), TitaniumOre.BLOCK);
        Registry.register(Registry.ITEM, new Identifier("advancedtransport", "titanium_ore"), new BlockItem(TitaniumOre.BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    }
}
