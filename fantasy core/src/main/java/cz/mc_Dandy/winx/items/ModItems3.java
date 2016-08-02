package cz.mc_Dandy.winx.items;

import cz.mc_Dandy.fantasyCore.items.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems3 {

	public static Item FiaryDust;
	public static CreativeTabs tabWinx = new tabWinx(CreativeTabs.getNextID(), "tabWinx");;

	public static void createItems() {
		GameRegistry.registerItem(FiaryDust = new FiaryPowder("FiaryDust"), "FiaryDust");

		GameRegistry.addShapelessRecipe(new ItemStack(ModItems3.FiaryDust, 10), new Object[] { ModItems.Magic_Powder,
				Items.glowstone_dust, Items.glowstone_dust, new ItemStack(Items.dye, 1, 4) });

	}
}
