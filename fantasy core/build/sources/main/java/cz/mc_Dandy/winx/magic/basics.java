package cz.mc_Dandy.winx.magic;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class basics {
	private Byte sila;

	public void become(NBTTagCompound nbt, PlayerEvent player) {
		nbt.setInteger("postava", 2);
		System.out.println(player + " is fiary");
	}

	public Byte sila(NBTTagCompound nbt) {

		sila = (byte) (Math.sin((double) (nbt.getInteger("level"))) * 100);

		return sila;
	};
}