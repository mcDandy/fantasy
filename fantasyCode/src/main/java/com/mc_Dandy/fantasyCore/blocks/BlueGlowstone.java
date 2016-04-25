package com.mc_Dandy.fantasyCore.blocks;

import com.mc_Dandy.fantasyCore.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlueGlowstone extends Block {

	public BlueGlowstone(String name,Material materialIn) {
		super (materialIn);
		this.setCreativeTab(ModItems.tabFantasy);
		this.setLightLevel(1.0f);
		this.setStepSound(soundTypeGlass);
		// TODO Auto-generated constructor stub
	}

}
