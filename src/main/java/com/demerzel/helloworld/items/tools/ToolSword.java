package com.demerzel.helloworld.items.tools;

import com.demerzel.helloworld.HelloWorld;
import com.demerzel.helloworld.init.ModItems;
import com.demerzel.helloworld.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel {
    public ToolSword(String name, Item.ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        HelloWorld.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
