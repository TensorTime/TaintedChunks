package com.tensortime.taintedchunks.init;

import java.util.ArrayList;
import java.util.List;

import com.tensortime.taintedchunks.item.ItemBase;

import net.minecraft.item.Item;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	 
	public static final Item TaintMeter = new ItemBase("taintmeter");
}
