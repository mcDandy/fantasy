package cz.mc_Dandy.winx.items;

import net.minecraft.item.Item;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class FiaryPowder extends Item {
	public FiaryPowder(String string) {
		this.setCreativeTab(ModItems3.tabWinx);
		this.setMaxStackSize(255);
		this.setUnlocalizedName(string);
		
	}
	@SubscribeEvent(priority = EventPriority.NORMAL)
	void fiaryp_click(rightClick e) {

	
	}
}
}
