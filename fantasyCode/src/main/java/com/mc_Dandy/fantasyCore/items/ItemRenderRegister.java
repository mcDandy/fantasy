package com.mc_Dandy.fantasyCore.items;



import com.mc_Dandy.fantasyCore.fantasy;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class ItemRenderRegister {

	public static void registerItemRenderer() {
		reg(ModItems.BlueGlowstoneDust,fantasy.MODID);
	}

	//==========================================================================

	//public static String modid=fantasy.MODID;

	public static void reg(Item item, String modid) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}