package cz.mc_Dandy.marmid.Main;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = morpan.MODID, name = morpan.MODNAME, version = morpan.VERSION)
public class morpan {

	@Instance(value = morpan.MODID)
	public static morpan instance;
	public static final String MODID = "morpan";
	public static final String MODNAME = "Fantasy mod - marmid extension";

	@SidedProxy(clientSide = "com.mc_Dandy.marmid.Main.ClientProxy", serverSide = "com.mc_Dandy.marmid.Main.ServerProxy")
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

	}
}