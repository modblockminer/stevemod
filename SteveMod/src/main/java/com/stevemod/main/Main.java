package com.stevemod.main;

import com.stevemod.main.proxy.CommonProxy;
import com.stevemod.main.worldgen.OreGen;

import init.ModBlocks;
import init.ModCrafting;
import init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)

public class Main {
	
	public static CreativeTabs tabitems = new CreativeTabs("TabItems") {

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.stonehammer);
		}
		
	};
	public static CreativeTabs tabblocks = new CreativeTabs("TabBlocks") {

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModBlocks.rubyblock);
		}
		
	};
	public static CreativeTabs tabmisc = new CreativeTabs("TabMisc") {

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.treesap);
		}
		
	};
	public static CreativeTabs tabtools = new CreativeTabs("TabTools") {

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(Items.WOODEN_SWORD);
		}
		
	};
	public static CreativeTabs tabweapons = new CreativeTabs("TabWeapons") {

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(Items.DIAMOND_SWORD);
		}
		
	};
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
		ModItems.init();
		ModItems.register();

		ModBlocks.init();
		ModBlocks.register();
		
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		proxy.init();
		GameRegistry.registerWorldGenerator(new OreGen(), 0);
		ModCrafting.register();
		ModCrafting.removerecipes();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
//	public static CreativeTabs tabStuff = new CreativeTabs("tab_stuff") {
		
//		@Override
//		public ItemStack getTabIconItem() {
//			return new ItemStack(ModItems.stonehammer);
//		}
			
	
}


