package com.mc_Dandy.fantasyCore.items;

import com.mc_Dandy.fantasyCore.FantasyTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MPowder extends Item {

	public MPowder(String string) {
		super();
		CreativeTabs tabFantasy = new FantasyTab(CreativeTabs.getNextID(), "tabFantasy");
		this.setUnlocalizedName("Magic_Powder");
		this.setCreativeTab(tabFantasy);
		//MPowder.registerItems();
	}

}