package init;

import com.stevemod.main.Main;
import com.stevemod.main.blocks.blockOakChair;
import com.stevemod.main.blocks.blockRuby;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	public static Block rubyblock;
	public static Block oakchair;
		
	public static void init() {
		rubyblock = new blockRuby();
		oakchair = new blockOakChair();
	}
	
	public static void register() {
		registerBlock(rubyblock);
		registerBlock(oakchair);
	}
	
	private static void registerBlock(Block block) {
		GameRegistry.register(rubyblock);
		GameRegistry.register(oakchair);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);		
	}
	

	public static void registerRenders() {
		registerRender(rubyblock);
		registerRender(oakchair);
	}
	
	private static void registerRender(Block block) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
//		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
		block.setCreativeTab(Main.tabblocks);
	}

}
