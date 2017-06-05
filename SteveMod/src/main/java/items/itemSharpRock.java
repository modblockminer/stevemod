package items;

import com.stevemod.main.Main;
import com.stevemod.main.Reference;
import net.minecraft.item.Item;

public class itemSharpRock extends Item {
	
	public itemSharpRock() {
		setUnlocalizedName(Reference.MainItems.SHARPROCK.getUnlocalizedName());
		setRegistryName(Reference.MainItems.SHARPROCK.getRegistryName());
//		setCreativeTab(Main.tabStuff);
	}
	
}
