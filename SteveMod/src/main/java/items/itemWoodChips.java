package items;

import com.stevemod.main.Main;
import com.stevemod.main.Reference;
import net.minecraft.item.Item;

public class itemWoodChips extends Item {
	
	public itemWoodChips() {
		setUnlocalizedName(Reference.MainItems.WOODCHIPS.getUnlocalizedName());
		setRegistryName(Reference.MainItems.WOODCHIPS.getRegistryName());
//		setCreativeTab(Main.tabStuff);
	}
	
}
