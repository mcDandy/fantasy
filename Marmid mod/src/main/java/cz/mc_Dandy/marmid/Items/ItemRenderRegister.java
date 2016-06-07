package cz.mc_Dandy.marmid.Items;

import cz.mc_Dandy.fantasyCore.items.ModItems;
import cz.mc_Dandy.marmid.Main.morpan;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class ItemRenderRegister {

	public static String modid = morpan.MODID;

	public static void reg(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
				new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

	public static void registerItemRenderer() {
		reg(ModItems.BlueGlowstoneDust);
	}
}