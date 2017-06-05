package com.stevemod.main;

public class Reference {

	public static final String MOD_ID = "stevemod";
	public static final String NAME = "Steve Mod";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSIONS = "[1.11.2]";
	
	public static final String CLIENT_PROXY_CLASS = "com.stevemod.main.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.stevemod.main.proxy.ServerProxy";
	
	public static enum MainItems {
		//Miscellaneous
		TREESAP("treesap", "itemTreeSap"),
		GRASSSEEDOIL("grassseedoil", "itemGrassSeedOil"),
		PILEOFSAND("pileofsand", "itemPileOfSand"),		
		TWINE("twine", "itemTwine"),
		PARCHMENT("parchment", "itemParchment"),
		SANDPAPER("sandpaper", "itemSandPaper"),
		
		MOLDAXE("moldaxe", "itemMoldAxe"),
		MOLDPICKAXE("moldpickaxe", "itemMoldPickAxe"),
		MOLDSHOVEL("moldshovel", "itemMoldShovel"),
		MOLDHOE("moldhoe", "itemMoldHoe"),
		MOLDSWORD("moldsword", "itemMoldSword"),
		MOLDBOW("moldbow", "itemMoldBow"),
		MOLDBATTLEAXE("moldbattleaxe", "itemMoldBattleAxe"),
		MOLDMACE("moldmace", "itemMoldMace"),
		BOWSTRING("bowstring", "itemBowString"),
		
		//Wood
		WOODBLOCK("woodblock", "itemWoodBlock"),
		WOODCHIPS("woodchips", "itemWoodChips"),
		WOODHANDLE("woodhandle", "itemWoodHandle"),
		WOODHILT("woodhilt", "itemWoodHilt"),
		WOODMALLET("woodmallet", "itemWoodMallet"),
		WOODCLUB("woodclub", "itemWoodClub"),
		
		WOODAXE("woodaxe", "itemWoodAxe"),
		WOODPICKAXE("woodpickaxe", "itemWoodPickAxe"),
		WOODSHOVEL("woodshovel", "itemWoodShovel"),
		WOODHOE("woodhoe", "itemWoodHoe"),
		
		WOODSWORD("woodsword", "itemWoodSword"),
		WOODBOW("woodbow", "itemWoodBow"),
		WOODMACE("woodmace", "itemWoodMace"),
		WOODBATTLEAXE("woodbattleaxe", "itemWoodBattleAxe"),
		
		WOODMASTERTOKEN("woodmastertoken", "itemWoodMasterToken"),
		WOODWEAPONTOKEN("woodweapontoken", "itemWoodWeaponToken"),
		WOODARMORTOKEN("woodarmortoken", "itemWoodArmorToken"),
		WOODTOOLTOKEN("woodtooltoken", "itemWoodToolToken"),
		WOODMISCTOKEN("woodmisctoken", "itemWoodMiscToken"),
		
		//Stone
		STONEROCK("stonerock", "itemStoneRock"),	
		SHARPROCK("sharprock", "itemSharpRock"),
		STONEHAMMER("stonehammer", "itemStoneHammer"),		

		//RUBY
		RUBYSWORD("rubysword", "itemRubySword"),
		RUBYBOW("rubybow", "itemRubyBow"),
		RUBYBATTLEAXE("rubybattleaxe", "itemRubyBattleAxe"),
		RUBYMACE("rubymace", "itemRubyMace"),
		
		//Gems
		RUBIES("rubies", "itemRubies");
		
		private String unlocalizedName;
		private String registryName;
		
		MainItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;	
		}

		public String getUnlocalizedName(){
			return unlocalizedName;
		}
		
		public String getRegistryName(){
			return registryName;
		}
	}
	
	public static enum MainBlocks {

			RUBYBLOCK("rubyblock", "blockRuby"),
			OAKCHAIR("oakchair", "blockOakChair");
		
		private String unlocalizedName;
		private String registryName;
		
		MainBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;	
		}

		public String getUnlocalizedName(){
			return unlocalizedName;
		}
		
		public String getRegistryName(){
			return registryName;
		}
	}
}