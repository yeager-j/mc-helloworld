package com.demerzel.helloworld.items.tools;

import com.demerzel.helloworld.HelloWorld;
import com.demerzel.helloworld.init.ModItems;
import com.demerzel.helloworld.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class ToolSpade extends ItemSpade implements IHasModel {
    public ToolSpade(String name, Item.ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.TOOLS);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        HelloWorld.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
