package com.demerzel.helloworld.init;

import com.demerzel.helloworld.items.ItemBase;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<>();

    public static final Item RUBY = new ItemBase("ruby");
    public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot");
}
