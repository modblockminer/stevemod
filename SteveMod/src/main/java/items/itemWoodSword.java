package items;

import com.stevemod.main.Main;
import com.stevemod.main.Reference;
import net.minecraft.item.Item;

public class itemWoodSword extends Item {
	
	public itemWoodSword() {
		setUnlocalizedName(Reference.MainItems.WOODSWORD.getUnlocalizedName());
		setRegistryName(Reference.MainItems.WOODSWORD.getRegistryName());
//		setCreativeTab(Main.tabStuff);
	}
	
}
