package com.mc_Dandy.winx.main;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Winx.MODID, name = Winx.MODNAME, version = Winx.VERSION)
public class Winx {

	public static final String MODID = "Winx";
	public static final String MODNAME = "Fantasy mod - Winx (fiary) extension";
	public static final String VERSION = "0.1.0";

	@Instance(value=Winx.MODID)
	public static Winx instance;
	@SidedProxy(clientSide = "com.mc_Dandy.winx.main.ClientProxy", serverSide = "com.mc_Dandy.winx.main.ServerProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {

	}

	@EventHandler
	public void init(FMLInitializationEvent e) {

		// ItemRenderRegister.registerItemRenderer();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {

	}
}