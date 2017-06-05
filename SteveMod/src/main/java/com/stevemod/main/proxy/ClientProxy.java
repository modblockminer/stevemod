package com.stevemod.main.proxy;

import com.stevemod.main.Reference.MainBlocks;

import init.ModBlocks;
import init.ModItems;

public class ClientProxy implements CommonProxy{

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}

}
