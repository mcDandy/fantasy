package com.mc_Dandy.marmid.Items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems2 {

	public static Item lvlp;

	public static void createItems() {
		GameRegistry.registerItem(lvlp = new BasicItem("level up"), "level up");
		// GameRegistry.addShapelessRecipe(new
		// ItemStack(ModItems.BlueGlowstoneDust),
		// new Object[] { Items.redstone, Items.glowstone_dust, new
		// ItemStack(Items.dye, 1, 4) });

	}
}
