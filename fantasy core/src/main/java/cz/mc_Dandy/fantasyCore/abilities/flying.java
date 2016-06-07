package cz.mc_Dandy.fantasyCore.abilities;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


public class flying {
	//public EntityPlayer player;
	@SubscribeEvent
	void plaierJoin(EntityJoinWorldEvent e){
		//player.addChatComponentMessage(IChatComponentText IChatComponent) new ChatComponentText("hrac je víla"). .
		
		//CanFly(null, null);
	}
	public void CanFly(NBTTagCompound nbt, EntityPlayer player){
		if (nbt.getInteger("postava")==2) {
			player.capabilities.allowFlying = true;
		} else {
			player.capabilities.allowFlying = false;
			player.capabilities.isFlying = false;};
	};
	
}