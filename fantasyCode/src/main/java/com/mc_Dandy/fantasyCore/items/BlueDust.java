package com.mc_Dandy.fantasyCore.items;

import net.minecraft.item.Item;

public class BlueDust extends Item {

	public BlueDust(String string) {
		super();
		//CreativeTabs tabFantasy = new FantasyTab(CreativeTabs.getNextID(), "tabFantasy");
		this.setUnlocalizedName("BlueGlowstoneDust");
		
		this.setCreativeTab(ModItems.tabFantasy);
		//BlueDust.registerItems();
	}

}


