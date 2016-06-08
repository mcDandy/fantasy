package cz.mc_Dandy.winx.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cz.mc_Dandy.winx.items.ModItems3;;

public final class tabWinx extends CreativeTabs {
	public tabWinx(int par11, String par2S1tr) {
		super(par11, par2S1tr);
	}

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return ModItems3.FiaryDust;
	}

}
