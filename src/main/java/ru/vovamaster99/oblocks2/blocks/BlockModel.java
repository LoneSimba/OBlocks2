package ru.vovamaster99.oblocks2.blocks;

import ru.vovamaster99.oblocks2.OB;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockModel extends Block {

	public BlockModel(Material mat) {
		super(mat);
		setCreativeTab(OB.obblocks);
	}
	
}
