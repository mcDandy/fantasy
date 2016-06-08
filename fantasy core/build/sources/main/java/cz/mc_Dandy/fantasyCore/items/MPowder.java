package cz.mc_Dandy.fantasyCore.items;

import net.minecraft.item.Item;

public class MPowder extends Item {

	public MPowder(String string) {
		super();
		// CreativeTabs tabFantasy = new FantasyTab(CreativeTabs.getNextID(),
		// "tabFantasy");
		this.setUnlocalizedName("Magic_Powder");
		this.setCreativeTab(ModItems.tabFantasy);
		// MPowder.registerItems();
	}

}