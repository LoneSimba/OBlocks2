package ru.vovamaster99.oblocks2.blocks;

import ru.vovamaster99.oblocks2.OB;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class FakeBlock extends Block {
	
	public FakeBlock(Material m) {
		super(m);
		setCreativeTab(OB.obblocks);
		setLightOpacity(0);
	}
	
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
	{
		return null;
	}
	
	public boolean renderAsNormalBlock()
	{
		return false;
	}

	public boolean isOpaqueCube()
	{
		return false;
	}

	public int getRenderBlockPass()
	{
		return 1;
	}

}
