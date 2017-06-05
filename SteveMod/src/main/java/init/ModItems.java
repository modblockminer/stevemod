package init;

import com.stevemod.main.Main;
import com.stevemod.main.Reference;

import items.itemBowString;
import items.itemGrassSeedOil;
import items.itemMoldAxe;
import items.itemMoldBattleAxe;
import items.itemMoldBow;
import items.itemMoldHoe;
import items.itemMoldMace;
import items.itemMoldPickAxe;
import items.itemMoldShovel;
import items.itemMoldSword;
import items.itemParchment;
import items.itemPileOfSand;
import items.itemRubies;
import items.itemSandPaper;
import items.itemSharpRock;
import items.itemStoneHammer;
import items.itemStoneRock;
import items.itemTreeSap;
import items.itemTwine;
import items.itemWoodArmorToken;
import items.itemWoodAxe;
import items.itemWoodBattleAxe;
import items.itemWoodChips;
import items.itemWoodHandle;
import items.itemWoodHilt;
import items.itemWoodHoe;
import items.itemWoodMace;
import items.itemWoodBlock;
import items.itemWoodBow;
import items.itemWoodClub;
import items.itemWoodMallet;
import items.itemWoodMasterToken;
import items.itemWoodMiscToken;
import items.itemWoodPickAxe;
import items.itemWoodShovel;
import items.itemWoodSword;
import items.itemWoodToolToken;
import items.itemWoodWeaponToken;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	//Miscellaneous
	public static Item treesap;
	public static Item grassseedoil;
	public static Item twine;
	public static Item pileofsand;
	public static Item parchment;
	public static Item sandpaper;
	public static Item woodchips;
	
	public static Item moldaxe;
	public static Item moldpickaxe;
	public static Item moldshovel;
	public static Item moldhoe;
	public static Item moldsword;
	public static Item moldbow;
	public static Item moldbattleaxe;
	public static Item moldmace;
	public static Item bowstring;
	
	//Wood
	public static Item woodblock;
	public static Item woodhandle;
	public static Item woodhilt;
	public static Item woodmallet;
	public static Item woodclub;
	
	public static Item woodaxe;
	public static Item woodpickaxe;
	public static Item woodshovel;
	public static Item woodhoe;
	
	public static Item woodsword;
	public static Item woodbow;
	public static Item woodbattleaxe;
	public static Item woodmace;
	
	public static Item woodmastertoken;
	public static Item woodtooltoken;
	public static Item woodweapontoken;
	public static Item woodarmortoken;
	public static Item woodmisctoken;
	
	//Stone
	public static Item stonerock;
	public static Item sharprock;
	public static Item stonehammer;
	
	//Gems
	public static Item rubies;

	
	public static void init() {
		treesap = new itemTreeSap().setCreativeTab(Main.tabmisc);
		grassseedoil = new itemGrassSeedOil().setCreativeTab(Main.tabmisc);
		twine = new itemTwine().setCreativeTab(Main.tabmisc);
		pileofsand = new itemPileOfSand().setCreativeTab(Main.tabmisc);
		parchment = new itemParchment().setCreativeTab(Main.tabmisc);
		sandpaper = new itemSandPaper().setCreativeTab(Main.tabmisc);
		woodchips = new itemWoodChips().setCreativeTab(Main.tabmisc);
		woodblock = new itemWoodBlock().setCreativeTab(Main.tabmisc);
		woodhandle = new itemWoodHandle().setCreativeTab(Main.tabmisc);
		woodhilt = new itemWoodHilt().setCreativeTab(Main.tabmisc);		
		woodmallet = new itemWoodMallet().setCreativeTab(Main.tabtools);
		woodclub = new itemWoodClub().setCreativeTab(Main.tabtools);

		moldaxe = new itemMoldAxe().setCreativeTab(Main.tabtools);
		moldpickaxe = new itemMoldPickAxe().setCreativeTab(Main.tabtools);
		moldshovel = new itemMoldShovel().setCreativeTab(Main.tabtools);
		moldhoe = new itemMoldHoe().setCreativeTab(Main.tabtools);
		moldsword = new itemMoldSword().setCreativeTab(Main.tabweapons);
		moldbow = new itemMoldBow().setCreativeTab(Main.tabweapons);
		moldbattleaxe = new itemMoldBattleAxe().setCreativeTab(Main.tabweapons);
		moldmace = new itemMoldMace().setCreativeTab(Main.tabweapons);
		bowstring = new itemBowString().setCreativeTab(Main.tabmisc);
		
		woodaxe = new itemWoodAxe().setCreativeTab(Main.tabtools);
		woodpickaxe = new itemWoodPickAxe().setCreativeTab(Main.tabtools);
		woodshovel = new itemWoodShovel().setCreativeTab(Main.tabtools);
		woodhoe = new itemWoodHoe().setCreativeTab(Main.tabtools);
		
		woodsword = new itemWoodSword().setCreativeTab(Main.tabweapons);
		woodbow = new itemWoodBow().setCreativeTab(Main.tabweapons);
		woodbattleaxe = new itemWoodBattleAxe().setCreativeTab(Main.tabweapons);
		woodmace = new itemWoodMace().setCreativeTab(Main.tabweapons);
		
		woodmastertoken = new itemWoodMasterToken().setCreativeTab(Main.tabmisc);
		woodtooltoken = new itemWoodToolToken().setCreativeTab(Main.tabmisc);
		woodweapontoken = new itemWoodWeaponToken().setCreativeTab(Main.tabmisc);
		woodarmortoken = new itemWoodArmorToken().setCreativeTab(Main.tabmisc);
		woodmisctoken = new itemWoodMiscToken().setCreativeTab(Main.tabmisc);
		stonerock = new itemStoneRock().setCreativeTab(Main.tabmisc);
		sharprock = new itemSharpRock().setCreativeTab(Main.tabmisc);
		stonehammer = new itemStoneHammer().setCreativeTab(Main.tabtools);
		rubies = new itemRubies().setCreativeTab(Main.tabmisc);
	}
	
	public static void register() {

		GameRegistry.register(treesap);
		GameRegistry.register(grassseedoil);
		GameRegistry.register(twine);
		GameRegistry.register(pileofsand);
		GameRegistry.register(parchment);
		GameRegistry.register(sandpaper);
		GameRegistry.register(woodchips);
		GameRegistry.register(woodblock);
		GameRegistry.register(woodhandle);
		GameRegistry.register(woodhilt);
		GameRegistry.register(woodmallet);
		GameRegistry.register(woodclub);

		GameRegistry.register(moldaxe);
		GameRegistry.register(moldpickaxe);
		GameRegistry.register(moldshovel);
		GameRegistry.register(moldhoe);
		GameRegistry.register(moldsword);
		GameRegistry.register(moldbow);
		GameRegistry.register(moldbattleaxe);
		GameRegistry.register(moldmace);
		GameRegistry.register(bowstring);
		
		GameRegistry.register(woodaxe);
		GameRegistry.register(woodpickaxe);
		GameRegistry.register(woodshovel);
		GameRegistry.register(woodhoe);
		
		GameRegistry.register(woodsword);
		GameRegistry.register(woodbow);
		GameRegistry.register(woodbattleaxe);
		GameRegistry.register(woodmace);
		
		GameRegistry.register(woodmastertoken);
		GameRegistry.register(woodtooltoken);
		GameRegistry.register(woodweapontoken);
		GameRegistry.register(woodarmortoken);
		GameRegistry.register(woodmisctoken);
		GameRegistry.register(stonerock);
		GameRegistry.register(sharprock);
		GameRegistry.register(stonehammer);
		
		GameRegistry.register(rubies);
	}
	

	public static void registerRenders() {
		registerRender(treesap);
		registerRender(grassseedoil);
		registerRender(twine);
		registerRender(pileofsand);
		registerRender(parchment);
		registerRender(sandpaper);
		registerRender(woodchips);
		registerRender(woodblock);
		registerRender(woodhandle);		
		registerRender(woodhilt);
		registerRender(woodmallet);
		registerRender(woodclub);

		registerRender(moldaxe);
		registerRender(moldpickaxe);
		registerRender(moldshovel);
		registerRender(moldhoe);
		registerRender(moldsword);
		registerRender(moldbow);
		registerRender(moldbattleaxe);
		registerRender(moldmace);
		registerRender(bowstring);
		
		registerRender(woodaxe);
		registerRender(woodpickaxe);
		registerRender(woodshovel);
		registerRender(woodhoe);
		
		registerRender(woodsword);
		registerRender(woodbow);
		registerRender(woodbattleaxe);
		registerRender(woodmace);
		
		registerRender(woodmastertoken);
		registerRender(woodtooltoken);
		registerRender(woodweapontoken);
		registerRender(woodarmortoken);
		registerRender(woodmisctoken);

		registerRender(stonerock);
		registerRender(sharprock);
		registerRender(stonehammer);
		
		registerRender(rubies);
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
//		item.setCreativeTab(Main.tabitems);
	}

}

