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
	public static Block lStone;	
	public static Block lGlowstone;
	
	public static Block fakeCobblestone;
	public static Block fakeStone;
	public static Block fakeGlowstone;
	public static Block fakeStoneBrick;
	public static Block fakeBrokenStoneBrick;
	public static Block fakeMossyStoneBrick;
	public static Block fakeFancyStoneBrick;
	public static Block fakeBrick;
	public static Block fakeGlass;
	public static Block fakeBrichPlanks;
	public static Block fakeJunglePlanks;
	public static Block fakeSprucePlanks;
	public static Block fakeOakPlanks;
	public static Block fakeAcaciaPlanks;
	public static Block fakeDarkOakPlanks;
	
	public static Block crystalLatern;
	public static Block plastic;
	public static Block airOre;
	
	public static Block crystalOre;
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
		
		fakeCobblestone = new FakeBlock(Material.rock).setBlockName("fakeCobblestone").setBlockTextureName("oblocks2:fakeCobblestone").setHardness(1.5F).setResistance(10.0F);
		fakeStone = new FakeBlock(Material.rock).setBlockName("fakeStone").setBlockTextureName("oblocks2:fakeStone").setHardness(2.0F).setResistance(10.0F);
	    fakeGlowstone = new FakeBlock(Material.glass).setBlockName("fakeGlowstone").setBlockTextureName("oblocks2:fakeGlowstone").setLightLevel(1.0F).setStepSound(Block.soundTypeGlass).setHardness(0.2F).setResistance(0.5F);
	    fakeStoneBrick = new FakeBlock(Material.rock).setBlockName("fakeStoneBrick").setBlockTextureName("oblocks2:fakeStoneBrick").setHardness(2.0F).setResistance(10.0F);
	    fakeBrokenStoneBrick = new FakeBlock(Material.rock).setBlockName("fakeBrokenStoneBrick").setBlockTextureName("oblocks2:fakeBrokenStoneBrick").setHardness(1.5F).setResistance(7.0F);
	    fakeMossyStoneBrick = new FakeBlock(Material.rock).setBlockName("fakeMossyStoneBrick").setBlockTextureName("oblocks2:fakeMossyStoneBrick").setHardness(1.5F).setResistance(7.0F);
	    fakeFancyStoneBrick = new FakeBlock(Material.rock).setBlockName("fakeFancyStoneBrick").setBlockTextureName("oblocks2:fakeFancyStoneBrick").setHardness(1.5F).setResistance(7.0F);
        fakeBrichPlanks = new FakeBlock(Material.wood).setBlockName("fakeBrichPlanks").setBlockTextureName("oblocks2:fakeBrichPlanks").setHardness(1.0F).setResistance(6.0F);
        fakeJunglePlanks = new FakeBlock(Material.wood).setBlockName("fakeJunglePlanks").setBlockTextureName("oblocks2:fakeJunglePlanks").setHardness(1.0F).setResistance(6.0F);
        fakeSprucePlanks = new FakeBlock(Material.wood).setBlockName("fakeSprucePlanks").setBlockTextureName("oblocks2:fakeSprucePlanks").setHardness(1.0F).setResistance(6.0F);
        fakeOakPlanks = new FakeBlock(Material.wood).setBlockName("fakeOakPlanks").setBlockTextureName("oblocks2:fakeOakPlanks").setHardness(1.0F).setResistance(6.0F);
        fakeAcaciaPlanks = new FakeBlock(Material.wood).setBlockName("fakeAcaciaPlanks").setBlockTextureName("oblocks2:fakeAcaciaPlanks").setHardness(1.0F).setResistance(6.0F);
        fakeDarkOakPlanks = new FakeBlock(Material.wood).setBlockName("fakeDarkOakPlanks").setBlockTextureName("oblocks2:fakeDarkOakPlanks").setHardness(1.0F).setResistance(6.0F);
	    fakeBrick = new FakeBlock(Material.rock).setBlockName("fakeBrick").setBlockTextureName("oblocks2:fakeBrick").setHardness(2.0F).setResistance(7.0F);
	    fakeGlass = new FakeBlock(Material.glass).setBlockName("fakeGlass").setBlockTextureName("oblocks2:fakeGlass").setStepSound(Block.soundTypeGlass).setHardness(0.2F).setResistance(0.5F);
	    
	    crystalLatern = new BlockModel(Material.glass).setBlockName("crystalLatern");
	    plastic = new BlockModel(Material.ground).setBlockName("plastic");
	    
	    airOre = new OreEmpty().setBlockName("airOre");
	    crystalOre = new CrystalOre().setBlockName("crystalOre");
	    polymerOre = new PolymerOre().setBlockName("polymerOre");
	    matterOre = new MatterOre().setBlockName("matterOre");
	    
	    ironSlabSingle = (BlockSlab) new IronSlabBlock(false, ironSlabSingle);
	    ironSlabDouble = (BlockSlab) new IronSlabBlock(true, ironSlabDouble);
	    
	    //GameRegistry.registerBlock(lCobblestone, "lCobblestone");
	    //GameRegistry.registerBlock(lStone, "lStone");
	    //GameRegistry.registerBlock(lGlowstone, "lGlowstone");
	       
        GameRegistry.registerBlock(fakeCobblestone, "fakeCobblestone");
        GameRegistry.registerBlock(fakeStone, "fakeStone");
        GameRegistry.registerBlock(fakeGlowstone, "fakeGlowstone");
        GameRegistry.registerBlock(fakeStoneBrick, "fakeStoneBrick");
        GameRegistry.registerBlock(fakeBrokenStoneBrick, "fakeBrockenStoneBrick");
        GameRegistry.registerBlock(fakeMossyStoneBrick, "fakeMossyStoneBrick");
        GameRegistry.registerBlock(fakeFancyStoneBrick, "fakeFancyStoneBrick");
        GameRegistry.registerBlock(fakeBrichPlanks, "fakeBrichPlanks");
        GameRegistry.registerBlock(fakeJunglePlanks, "fakeJunglePlanks");
        GameRegistry.registerBlock(fakeSprucePlanks, "fakeSprucePlanks");
        GameRegistry.registerBlock(fakeOakPlanks, "fakeOakPlanks");
        GameRegistry.registerBlock(fakeAcaciaPlanks, "fakeAcaciaPlanks");
        GameRegistry.registerBlock(fakeDarkOakPlanks, "fakeDarkOakPlanks"); 
        GameRegistry.registerBlock(fakeBrick, "fakeBrick");
        GameRegistry.registerBlock(fakeGlass, "fakeGlass");
		
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
