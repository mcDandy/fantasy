package com.mc_Dandy.marmid.Main;

import com.mc_Dandy.marmid.blocks.ModBlocks;
import com.mc_Dandy.marmid.player.SeaWoman;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.mc_Dandy.marmid.Items.ModItems2;

public class CommonProxy {

	public static CommonProxy proxy;

	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
		MinecraftForge.EVENT_BUS.register(new SeaWoman());
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit(e);
		ModItems2.createItems();
		ModBlocks.createBlocks();
	}
}
