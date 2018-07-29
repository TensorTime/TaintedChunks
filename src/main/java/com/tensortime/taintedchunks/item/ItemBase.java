package com.tensortime.taintedchunks.item;

import com.tensortime.taintedchunks.TaintedChunks;
import com.tensortime.taintedchunks.init.ModItems;
import com.tensortime.taintedchunks.utils.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		TaintedChunks.proxy.registerItemRenderer(this, 0 ,"inventory");
	}
}
