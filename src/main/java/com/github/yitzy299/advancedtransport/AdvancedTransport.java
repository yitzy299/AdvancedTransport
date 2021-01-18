package com.github.yitzy299.advancedtransport;

import com.github.yitzy299.advancedtransport.blocks.AtBlocks;
import com.github.yitzy299.advancedtransport.gen.OreGeneration;
import com.github.yitzy299.advancedtransport.items.AtItems;

import net.fabricmc.api.ModInitializer;

public class AdvancedTransport implements ModInitializer {
	@Override
	public void onInitialize() {
		// Registers blocks
		AtBlocks.register();
		// Registers items
		AtItems.register();
		// Registers ores
		OreGeneration.genOres();
	}
}
