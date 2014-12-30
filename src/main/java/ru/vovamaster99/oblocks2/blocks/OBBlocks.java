package ru.vovamaster99.oblocks2.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import ru.vovamaster99.oblocks2.OB;
import ru.vovamaster99.oblocks2.blocks.ores.CrystalOre;
import ru.vovamaster99.oblocks2.blocks.ores.MatterOre;
import ru.vovamaster99.oblocks2.blocks.ores.OreEmpty;
import ru.vovamaster99.oblocks2.blocks.ores.PolymerOre;
import ru.vovamaster99.oblocks2.blocks.slabs.IronSlabBlock;
import ru.vovamaster99.oblocks2.blocks.slabs.ItemIronSlab;
import cpw.mods.fml.common.registry.GameRegistry;

public class OBBlocks {
	


	public static Block lCobblestone;	
	public static Block lGlowstone;
	public static Block airCobblestone;
	public static Block airStone;
	public static Block lStone;
	public static Block airGlowstone;
	public static Block crystalLatern;
	public static Block airOre;
	public static Block crystalOre;
	public static Block plastic;
	public static Block matterOre;
	public static Block polymerOre;
    public static Block rubyOre;
    

	public static BlockSlab ironSlabSingle;
	public static BlockSlab ironSlabDouble;
	

	public static Block doorGlass;
	public static Block doorPlastic;
	public static Block doorStone;
	public static Block doorRPlastic;	
	public static Block doorAdvIron;
	public static Block doorGlassHeavy;
	public static Block doorSmoothGlass;
	
	public static void blocks() {
		

		lCobblestone = new LightBlock().setBlockName("lCobblestone");
		lGlowstone = new LightBlock().setBlockName("lGlowstone");
		lStone = new LightBlock().setBlockName("lStone");
		
		airCobblestone = new AirBlock(Material.ground).setBlockName("airCobblestone").setBlockTextureName("oblocks2:airCobblestone");
		airStone = new AirBlock(Material.rock).setBlockName("airStone").setBlockTextureName("oblocks2:airStone");
	    airGlowstone = new AirBlock(Material.glass).setBlockName("airGlowstone").setBlockTextureName("oblocks2:airGlowstone").setLightLevel(1.0F);
	    
	    crystalLatern = new BlockModel(Material.glass).setBlockName("crystalLatern");
	    plastic = new BlockModel(Material.ground).setBlockName("plastic");
	    
	    airOre = new OreEmpty().setBlockName("airOre");
	    crystalOre = new CrystalOre().setBlockName("crystalOre");
	    polymerOre = new PolymerOre().setBlockName("polymerOre");
	    matterOre = new MatterOre().setBlockName("matterOre");
	    
	    ironSlabSingle = (BlockSlab) new IronSlabBlock(false, ironSlabSingle);
	    ironSlabDouble = (BlockSlab) new IronSlabBlock(true, ironSlabDouble);
	    
	    GameRegistry.registerBlock(lCobblestone, "lCobblestone");
	    GameRegistry.registerBlock(lStone, "lStone");
	    GameRegistry.registerBlock(lGlowstone, "lGlowstone");
	    
		GameRegistry.registerBlock(airCobblestone, "airCobblestone");
		GameRegistry.registerBlock(airStone, "airStone");
		GameRegistry.registerBlock(airGlowstone, "airGlowstone");
		
		GameRegistry.registerBlock(crystalLatern, "crystalLatern");
		GameRegistry.registerBlock(plastic, "plastic");
		
		GameRegistry.registerBlock(airOre, "airOre");
		GameRegistry.registerBlock(crystalOre, "crystalOre");
		GameRegistry.registerBlock(polymerOre, "polymerOre");
		GameRegistry.registerBlock(matterOre, "matterOre");
		
		GameRegistry.registerBlock(ironSlabSingle, ItemIronSlab.class, "ironSlabSingle");
		GameRegistry.registerBlock(ironSlabDouble, ItemIronSlab.class, "ironSlabDouble");
		
	}

}
