package items;

import com.stevemod.main.Main;
import com.stevemod.main.Reference;
import net.minecraft.item.Item;

public class itemStoneHammer extends Item {
	
	public itemStoneHammer() {
		setUnlocalizedName(Reference.MainItems.STONEHAMMER.getUnlocalizedName());
		setRegistryName(Reference.MainItems.STONEHAMMER.getRegistryName());
//		setCreativeTab(Main.tabStuff);
	}
	
}
