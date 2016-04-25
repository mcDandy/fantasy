package com.mc_Dandy.fantasyCore;

import com.mc_Dandy.fantasyCore.blocks.ModBlocks;
import com.mc_Dandy.fantasyCore.items.ModItems;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = fantasy.MODID, name = fantasy.MODNAME, version = fantasy.VERSION)
public class fantasy {

	public static final String MODID = "fantasy";
	public static final String MODNAME = "Fantasy mod";
	public static final String VERSION = "1.0.0";

	@Instance(value=fantasy.MODID)
	public static fantasy instance;
	@SidedProxy(clientSide = "com.mc_Dandy.fantasyCore.ClientProxy", serverSide = "com.mc_Dandy.fantasyCore.ServerProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		ModItems.createItems();
		ModBlocks.createBlocks();
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {

		
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {

	}
}