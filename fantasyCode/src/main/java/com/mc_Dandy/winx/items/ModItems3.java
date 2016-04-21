package com.mc_Dandy.winx.items;



import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.mc_Dandy.fantasyCore.items.BlueDust;
import com.mc_Dandy.fantasyCore.items.ModItems;


public final class ModItems3 {

	public static Item fp;

	public static void createItems() {
	       GameRegistry.registerItem(fp = new FiaryPowder("fp"), "fiary dust");

		GameRegistry.addShapelessRecipe(new ItemStack(ModItems3.fp),
				new Object[] { ModItems.Magic_Powder, Items.glowstone_dust, new ItemStack(Items.dye, 1, 4) });

	}
}
