package com.github.yitzy299.advancedtransport.gen;

import com.github.yitzy299.advancedtransport.blocks.TitaniumOre;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class OreGeneration {
    // Uses the registry to register all the ConfiguredFeatures
    public static void genOres() {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("advancedtransport", "ore_titanium"), ORE_TITANIUM);
    }

    // Titanium
    public static ConfiguredFeature<?, ?> ORE_TITANIUM = Feature.ORE
        .configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, TitaniumOre.BLOCK.getDefaultState(), 9))
        .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 4, 32))).spreadHorizontally().repeat(8);
    
}
