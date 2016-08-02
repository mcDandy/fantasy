package cz.mc_Dandy.fantasyCore.blocks;

import cz.mc_Dandy.fantasyCore.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {
	public static Block blueGlowstone;

	public static void createBlocks() {
		GameRegistry.registerBlock(blueGlowstone = new BlueGlowstone("BlueGlowstone", Material.clay), "BlueGlowstone");

		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blueGlowstone),
				new Object[] { "##", "##", '#', ModItems.BlueGlowstoneDust });

	}
}