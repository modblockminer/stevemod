package items;

import com.stevemod.main.Main;
import com.stevemod.main.Reference;
import net.minecraft.item.Item;

public class itemWoodBlock extends Item {
	
	public itemWoodBlock() {
		setUnlocalizedName(Reference.MainItems.WOODBLOCK.getUnlocalizedName());
		setRegistryName(Reference.MainItems.WOODBLOCK.getRegistryName());
//		setCreativeTab(Main.tabStuff);
	}
	
}
