package cz.mc_Dandy.fantasyCore.abilities;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


public class flying {
	@SubscribeEvent
	void plaierJoin(EntityJoinWorldEvent e){
		CanFly(null);
	}
	public void CanFly(NBTTagCompound nbt){
		if (nbt.getInteger("postava")==2) {allowFlight=true;} else {allowCreativeFlight=true;};
	};
	
}