package com.mc_Dandy.fantasyCore.blocks;



import com.mc_Dandy.fantasyCore.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {
	public static Block blueGlowstone;
	//public static Material blueGlowstoneMat;

    public static void createBlocks() {
  //  Material blueGlowstoneMat = null;
	GameRegistry.registerBlock(blueGlowstone = new BlueGlowstone("BlueGlowstone", Material.clay) , "BlueGlowstone");



GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blueGlowstone), new Object[] {"##", "##", '#', ModItems.BlueGlowstoneDust});

    }
}