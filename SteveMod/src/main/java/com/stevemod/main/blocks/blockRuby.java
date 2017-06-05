package com.stevemod.main.blocks;

import java.util.Random;

import com.stevemod.main.Main;
import com.stevemod.main.Reference;

import init.ModBlocks;
import init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class blockRuby extends Block {


	public blockRuby() {
		super(Material.IRON);
		setUnlocalizedName(Reference.MainBlocks.RUBYBLOCK.getUnlocalizedName());
		setRegistryName(Reference.MainBlocks.RUBYBLOCK.getRegistryName());
		setHardness(6.0F);
		setResistance(15.0F);
	}

    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
    	
    	return this == ModBlocks.rubyblock ? ModItems.rubies : Item.getItemFromBlock(this);
	}
    
    public int quantityDropped(Random random) {
		return this == ModBlocks.rubyblock ? 0 + random.nextInt(3) : 0;
    	
    }
}
