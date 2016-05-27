package cz.mc_Dandy.fantasyCore.abilities;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


public class flying {
	@SubscribeEvent
	void plaierJoin(EntityJoinWorldEvent e){
		CanFly(null, null);
	}
	public void CanFly(NBTTagCompound nbt, EntityPlayer player){
		if (nbt.getInteger("postava")==2) {player.capabilities.allowFlying = true;} else {player.capabilities.allowFlying = false;player.capabilities.isFlying = false;};
	};
	
}