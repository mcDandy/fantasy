package cz.mc_Dandy.fantasyCore.blocks;

import javax.swing.Icon;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class blockMorfixFluid extends BlockFluidClassic { 

@SideOnly(Side.CLIENT) protected IIcon stillIcon;
@SideOnly(Side.CLIENT) protected IIcon flowingIcon; 

public blockMorfixFluid(Fluid fluid, Material material) { super(fluid, material); setCreativeTab(CreativeTabs.tabMisc); } 

public Icon getIcon(int side, int meta) { return (side == 0 || side == 1)? stillIcon : flowingIcon; } 

@SideOnly(Side.CLIENT) @Override public void registerBlockIcons(IIconRegister register) { stillIcon = register.registerIcon("modid:fluidStill"); flowingIcon = register.registerIcon("modid:fluidFlowing"); } 

public boolean canDisplace(IBlockAccess world, int x, int y, int z) { if (world.getBlock(x, y, z).getMaterial().isLiquid()) return false; return super.canDisplace(world, x, y, z); } 

public boolean displaceIfPossible(World world, int x, int y, int z) { if (world.getBlock(x, y, z).getMaterial().isLiquid()) return false; return super.displaceIfPossible(world, x, y, z); } 

} 
