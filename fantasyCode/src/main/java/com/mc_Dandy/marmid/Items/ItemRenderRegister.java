package com.mc_Dandy.marmid.Items;

import com.mc_Dandy.fantasyCore.Fantasy;
import com.mc_Dandy.fantasyCore.items.ModItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class ItemRenderRegister {

	public static void registerItemRenderer() {
		reg(ModItems.BlueGlowstoneDust);
	}

	public static String modid = Fantasy.MODID;

	public static void reg(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
				new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}