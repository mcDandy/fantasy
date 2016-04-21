package com.mc_Dandy.fantasyCore;


import com.mc_Dandy.fantasyCore.items.ItemRenderRegister;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

//Press Ctrl+Shift+O in Eclipse for the imports.

public class ClientProxy extends CommonProxy {

	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
	}

	@Override
	public void init(FMLInitializationEvent e) {
		super.init(e);
		ItemRenderRegister.registerItemRenderer();
		}

	@Override
	public void postInit(FMLPostInitializationEvent e) {
		super.postInit(e);
	
		
	}

}
