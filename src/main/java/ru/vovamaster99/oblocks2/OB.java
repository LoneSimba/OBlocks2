package ru.vovamaster99.oblocks2;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import ru.vovamaster99.oblocks2.blocks.OBBlocks;
import ru.vovamaster99.oblocks2.items.OBItems;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;


@Mod(modid = OB.Id, name = OB.Name, version = OB.Ver)
public class OB {
	public static final String Id = "oblocks2";
	public static final String Name = "Other Blocks 2";
	public static final String Ver = "#4";

	public static CreativeTabs obblocks = new CreativeTabs("obblocks") {
		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(OBBlocks.crystalLatern);
		}
	};
	
	public static CreativeTabs obitems = new CreativeTabs("obitems") {
		@Override
		public Item getTabIconItem() {
			return OBItems.crystal;
		}
	};
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		
		OBBlocks.blocks();
		OBItems.items();
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
		
	}
	
	@EventHandler
	public void serverStarting(FMLServerStartingEvent e) {
		
	}
}
