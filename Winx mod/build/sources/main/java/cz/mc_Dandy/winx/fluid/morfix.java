package cz.mc_Dandy.winx.fluid;

import cz.mc_Dandy.winx.main.Winx;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

class morfix{
	public static Fluid morfix;
	public void registerFluids()
	{
		FluidRegistry.registerFluid(morfix
				.setViscosity(12000) //voda 1 000, l�va 6 000 
				.setUnlocalizedName(Winx.MODID+":morfix")
				.setLuminosity(3)
				);
	}
	
}