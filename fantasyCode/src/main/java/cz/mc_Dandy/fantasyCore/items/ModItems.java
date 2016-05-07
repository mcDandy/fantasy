package cz.mc_Dandy.fantasyCore.items;

import cz.mc_Dandy.fantasyCore.FantasyTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {

	public static Item BlueGlowstoneDust;
	public static Item Magic_Powder;
	public static CreativeTabs tabFantasy = new FantasyTab(CreativeTabs.getNextID(), "tabFantasy");

	public static void createItems() {

		GameRegistry.registerItem(BlueGlowstoneDust = new BlueDust("BlueGlowstoneDust"), "BlueGlostoneDust");
		GameRegistry.registerItem(Magic_Powder = new MPowder("Magic_Powder"), "Magic_Powder");
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.BlueGlowstoneDust),
				new Object[] { Items.redstone, Items.glowstone_dust, new ItemStack(Items.dye, 1, 4) });

		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Magic_Powder, 6),
				new Object[] { ModItems.BlueGlowstoneDust, Items.diamond });
	}
}
