package com.demerzel.helloworld.items.tools;

import com.demerzel.helloworld.HelloWorld;
import com.demerzel.helloworld.init.ModItems;
import com.demerzel.helloworld.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel {
    public ToolPickaxe(String name, ToolMaterial material) {
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
