package cz.mc_Dandy.winx.main;

import cz.mc_Dandy.winx.items.ModItems3;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Winx.MODID, name = Winx.MODNAME, version = Winx.VERSION)
public class Winx {

	@Instance(value = Winx.MODID)
	public static Winx instance;
	public static final String MODID = "Winx";
	public static final String MODNAME = "Fantasy mod - Winx (fiary) extension";

	@SidedProxy(clientSide = "cz.mc_Dandy.winx.main.ClientProxy", serverSide = "cz.mc_Dandy.winx.main.ServerProxy")
	public static CommonProxy proxy;
	public static final String VERSION = "0.1.0";

	@EventHandler
	public void init(FMLInitializationEvent e) {

		// ItemRenderRegister.registerItemRenderer();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {

	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		ModItems3.createItems();
		// ModBlocks.createBlocks();
	}
}