package com.github.yitzy299.advancedtransport.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class TitaniumOre {
    public static final Block BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0F).breakByTool(FabricToolTags.PICKAXES, 1));
}
