package com.mc_Dandy.winx.main;


import com.mc_Dandy.winx.items.ModItems3;

import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit(e);

	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
		//MinecraftForge.EVENT_BUS.register(new SeaWoman());
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}
}
