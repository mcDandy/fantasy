package cz.mc_Dandy.fantasyCore.abilities;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


public class flying {
	public EntityPlayer player;
	public NBTTagCompound nbt;
	@SubscribeEvent
	void plaierJoin(EntityJoinWorldEvent e){
		//player.addChatComponentMessage(IChatComponentText IChatComponent) new ChatComponentText("hrac je v�la"). .
		
		//CanFly(null, null);
			if (player.getEntityData().getByte("postava")==1) {
			player.capabilities.allowFlying = true;
		} else {
			player.capabilities.allowFlying = false;
			player.capabilities.isFlying = false;};
	};
	}
