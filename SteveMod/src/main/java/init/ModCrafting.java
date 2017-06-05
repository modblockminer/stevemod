package init;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemBlockSpecial;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ModCrafting {

	public static void register() {
		
		//Miscellaneous
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.twine), ModItems.treesap, Items.STRING);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.treesap,4), new ItemStack(Blocks.LOG,1, OreDictionary.WILDCARD_VALUE), Items.WOODEN_PICKAXE);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.grassseedoil), Items.WHEAT_SEEDS, ModItems.stonerock, ModItems.stonerock);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.pileofsand), new ItemStack(Blocks.SAND,1, OreDictionary.WILDCARD_VALUE), ModItems.woodmallet);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.parchment), ModItems.woodchips, ModItems.woodchips, ModItems.treesap, ModItems.treesap, ModItems.stonerock);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.sandpaper), ModItems.parchment, ModItems.treesap, ModItems.pileofsand);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.bowstring), ModItems.twine, ModItems.grassseedoil);	
		
		//Wood
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.woodblock,4), new ItemStack(Blocks.LOG,1, OreDictionary.WILDCARD_VALUE), Items.WOODEN_AXE);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.woodchips,4), ModItems.woodblock, ModItems.sharprock);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.woodhandle), Items.STICK, Items.STICK, ModItems.treesap, ModItems.sandpaper, ModItems.twine);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.woodhilt), ModItems.woodhandle, ModItems.sharprock, ModItems.sandpaper, ModItems.twine);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.woodclub), ModItems.woodhilt, ModItems.woodblock, ModItems.woodblock, ModItems.sandpaper, ModItems.sandpaper, ModItems.treesap, ModItems.twine);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.woodmallet), ModItems.woodblock, ModItems.woodhandle, ModItems.treesap, ModItems.twine);

		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.woodaxe), ModItems.moldaxe, ModItems.woodhandle, new ItemStack(Blocks.LOG,1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.LOG,1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.LOG,1, OreDictionary.WILDCARD_VALUE), ModItems.sharprock, ModItems.sharprock, ModItems.sharprock, ModItems.twine);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.woodpickaxe), ModItems.moldpickaxe, ModItems.woodhandle,  new ItemStack(Blocks.LOG,1, OreDictionary.WILDCARD_VALUE),  new ItemStack(Blocks.LOG,1, OreDictionary.WILDCARD_VALUE),  new ItemStack(Blocks.LOG,1, OreDictionary.WILDCARD_VALUE),  ModItems.sharprock, ModItems.sharprock, ModItems.sharprock, ModItems.twine);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.woodshovel), ModItems.moldshovel, ModItems.woodhandle,  new ItemStack(Blocks.LOG,1, OreDictionary.WILDCARD_VALUE), ModItems.sharprock, ModItems.twine);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.woodhoe), ModItems.moldhoe, ModItems.woodhandle, new ItemStack(Blocks.LOG,1, OreDictionary.WILDCARD_VALUE), ModItems.sharprock, ModItems.twine);
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.woodsword), ModItems.moldsword, ModItems.woodhilt, ModItems.woodblock, ModItems.woodblock, ModItems.sandpaper, ModItems.sandpaper, ModItems.treesap, ModItems.twine);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.woodbow), ModItems.moldbow, ModItems.bowstring, ModItems.woodblock, ModItems.woodblock, ModItems.sandpaper, ModItems.sandpaper, ModItems.treesap, ModItems.twine);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.woodbattleaxe), ModItems.moldbattleaxe, ModItems.woodhilt, ModItems.woodblock, ModItems.woodblock, ModItems.sandpaper, ModItems.sandpaper, ModItems.treesap, ModItems.twine);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.woodmace), ModItems.moldmace, ModItems.woodhilt, ModItems.woodblock, ModItems.woodblock, ModItems.sandpaper, ModItems.sandpaper, ModItems.treesap, ModItems.twine);
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.woodtooltoken), ModItems.woodaxe, ModItems.woodpickaxe, ModItems.woodshovel, ModItems.woodhoe);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.woodmastertoken), ModItems.woodtooltoken, ModItems.woodweapontoken, ModItems.woodarmortoken, ModItems.woodmisctoken);
		
		//Stone
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.stonerock,4), new ItemStack(Blocks.STONE,1,0), ModItems.woodmallet);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.sharprock,4), new ItemStack(Blocks.STONE,1,0), ModItems.stonerock);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.stonehammer), ModItems.stonerock, ModItems.treesap, ModItems.twine, Items.STICK);
		
		GameRegistry.addSmelting(ModBlocks.rubyblock, new ItemStack(ModItems.treesap), 0.5F);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.treesap), "SSS", "SSS", "SSS", 'S', ModItems.treesap);

	}
}
