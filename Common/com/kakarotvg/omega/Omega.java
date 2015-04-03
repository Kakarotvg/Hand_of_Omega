package com.kakarotvg.omega;

import net.minecraftforge.common.MinecraftForge;

import com.kakarotvg.omega.generation.WorldGen;
import com.kakarotvg.omega.handlers.armor.ArmorHandler;
import com.kakarotvg.omega.handlers.blocks.BlockHandler;
import com.kakarotvg.omega.handlers.crafting.CraftingHandler;
import com.kakarotvg.omega.handlers.item.ItemHandler;
import com.kakarotvg.omega.handlers.tools.ToolHandler;
import com.kakarotvg.omega.proxys.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_N, version = Reference.MOD_V)
public class Omega {

	@Instance(Reference.MOD_ID)
	public static Omega instance;
	// private GuiHandler guihandler = new GuiHandler();

	@SidedProxy(clientSide = "com.kakarotvg.omega.proxys.ClientProxy", serverSide = "com.kakarotvg.omega.proxys.CommonProxy")
	public static CommonProxy proxy;

	public static final VgPacketHandler packethandler = new VgPacketHandler();

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		packethandler.initialise();
		// VgEventHandler.Events();

		BlockHandler.configureBlocks();
		BlockHandler.registerBlocks(new GameRegistry());
		BlockHandler.setHarvestLevel(new MinecraftForge());

		ItemHandler.configureItems();
		ItemHandler.registerItems(new GameRegistry());

		ToolHandler.configureTools();
		ToolHandler.registerItem(new GameRegistry());

		ArmorHandler.configreArmor();
		ArmorHandler.registerArmor(new GameRegistry());

		GameRegistry.registerWorldGenerator(new WorldGen(), 0);
		// NetworkRegistry.INSTANCE.registerGuiHandler(this, guihandler);

		CraftingHandler.addCrafting(new GameRegistry());
		CraftingHandler.addSmelting(new GameRegistry());

		// loads the init method of Commonproxy
		proxy.init();

	}

	@EventHandler
	public void Init(FMLInitializationEvent event) {

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		packethandler.postInitialise();
	}

}
