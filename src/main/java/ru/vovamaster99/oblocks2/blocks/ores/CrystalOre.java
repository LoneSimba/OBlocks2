package ru.vovamaster99.oblocks2.blocks.ores;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import ru.vovamaster99.oblocks2.OB;
import ru.vovamaster99.oblocks2.items.OBItems;

public class CrystalOre extends Block {
	
	public CrystalOre() {
		super(Material.rock);
		setCreativeTab(OB.obblocks);
	}
	
	@Override
	public Item getItemDropped(int par1, Random rand, int par2) {
		return OBItems.crystal;
	}
	
}
