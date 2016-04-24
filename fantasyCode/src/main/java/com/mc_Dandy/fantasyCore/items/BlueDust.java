package com.mc_Dandy.fantasyCore.items;

import com.mc_Dandy.fantasyCore.FantasyTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlueDust extends Item {

	public BlueDust(String string) {
		super();
		CreativeTabs tabFantasy = new FantasyTab(CreativeTabs.getNextID(), "tabFantasy");
		this.setUnlocalizedName("BlueGlowstoneDust");
		this.setCreativeTab(tabFantasy);
		//BlueDust.registerItems();
	}

}


