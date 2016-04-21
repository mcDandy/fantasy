package com.mc_Dandy.marmid.player;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
public class SeaWoman {

	int tick = 0;

	@SubscribeEvent(priority = EventPriority.NORMAL)
	void Marmid_tick(LivingUpdateEvent e) {

		this.inSeaTick(null, null);
	}

	public void inSeaTick(NBTTagCompound compound, EntityPlayer player) {
		if (player.isInWater()) {

			// http://minecraft.gamepedia.com/Status_effect
			if (compound.getInteger("level") > 0) // is marmid?
			{
				tick++;

				if (tick == (20*5)) {
														// ID, amplifier, duration, ambient, particles
					player.addPotionEffect(new PotionEffect(13, 0, 20, true, false));
					player.addPotionEffect(new PotionEffect(16, 0, 240, true, false));
			
					//Potions(player, Potion.nightVision, 20/*sec*/, 0, true, false);
					//Potions(player, Potion.waterBreathing, 20/*sec*/, 0, true, false);
				}
			}
		}
		/*@SubscribeEvent(priority = EventPriority.NORMAL)
		void level_up(ItemTossEvent e){compound.setInteger("level", compound.getInteger("level")+1);}
	*/}
}
