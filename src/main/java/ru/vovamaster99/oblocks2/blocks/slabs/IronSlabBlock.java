package ru.vovamaster99.oblocks2.blocks.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import ru.vovamaster99.oblocks2.OB;
import ru.vovamaster99.oblocks2.blocks.OBBlocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class IronSlabBlock extends BlockSlab {
private Block extendingBlock;

public IronSlabBlock(boolean fullblock, Block block) {
	super(fullblock, Material.rock);
	// setBlockName("stoneMossySlab");
	setBlockTextureName("minecraft:iron_block");

	if(!fullblock) {
		setBlockName("ironSingleSlab");
		setBlockTextureName("minecraft:iron_block");
		setCreativeTab(OB.obblocks);
		setLightOpacity(0);
	}
}

@SideOnly(Side.CLIENT)
public Item getItem(World wrld, int x, int y, int z) {
	return Item.getItemFromBlock(OBBlocks.ironSlabSingle);
}

@SideOnly(Side.CLIENT)
public void registerIcons(IIconRegister register) {
	blockIcon = register.registerIcon("minecraft:" + extendingBlock);

}


public String func_150002_b(int var1) {
	return super.getUnlocalizedName();
}

}