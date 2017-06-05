package items;

import com.stevemod.main.Main;
import com.stevemod.main.Reference;
import net.minecraft.item.Item;

public class itemTwine extends Item {
	
	public itemTwine() {
		setUnlocalizedName(Reference.MainItems.TWINE.getUnlocalizedName());
		setRegistryName(Reference.MainItems.TWINE.getRegistryName());
//		setCreativeTab(Main.tabStuff);
	}
	
}
