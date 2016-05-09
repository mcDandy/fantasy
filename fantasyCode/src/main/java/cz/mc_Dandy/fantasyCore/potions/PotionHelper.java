package cz.mc_Dandy.fantasyCore.potions;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class PotionHelper {
	public static void Potions(EntityPlayer player, Potion potion, int duration, int amplifier, boolean from_beacon,
			boolean particles) {
		// Always effect for 8 seconds, then refresh

		player.addPotionEffect(new PotionEffect(potion.id, duration * 20, amplifier, from_beacon, particles));
	}
}