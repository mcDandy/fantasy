package com.mc_Dandy.fantasyCore;

import com.mc_Dandy.fantasyCore.items.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public final class FantasyTab extends CreativeTabs
{
    public FantasyTab(int par1, String par2Str)
    {
        super(par1, par2Str);
    }

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return ModItems.BlueGlowstoneDust;
	}

	//@Override
	
	}


