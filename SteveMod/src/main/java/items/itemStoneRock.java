package items;

import com.stevemod.main.Main;
import com.stevemod.main.Reference;
import net.minecraft.item.Item;

public class itemStoneRock extends Item {
	
	public itemStoneRock() {
		setUnlocalizedName(Reference.MainItems.STONEROCK.getUnlocalizedName());
		setRegistryName(Reference.MainItems.STONEROCK.getRegistryName());
//		setCreativeTab(Main.tabStuff);
	}
	
}
