package cz.mc_Dandy.winx.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.entity.player.PlayerUseItemEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class FiaryPowder extends Item {
	public EntityPlayer player;
	public NBTTagCompound ntb;

	public FiaryPowder(String string) {
		this.setCreativeTab(ModItems3.tabWinx);
		this.setMaxStackSize(255);
		this.setUnlocalizedName(string);

	}

	@SubscribeEvent(priority = EventPriority.NORMAL)
	void fiaryp_click(PlayerUseItemEvent e) {

		if (player.getCurrentEquippedItem() == new ItemStack(ModItems3.FiaryDust)) {
			player.getEntityData().setByte("postava", (byte)1);
		}

	}
}
