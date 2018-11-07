package com.demerzel.helloworld.init;

import com.demerzel.helloworld.items.ItemBase;
import com.demerzel.helloworld.items.armor.ArmorBase;
import com.demerzel.helloworld.items.tools.ToolAxe;
import com.demerzel.helloworld.items.tools.ToolPickaxe;
import com.demerzel.helloworld.items.tools.ToolSpade;
import com.demerzel.helloworld.items.tools.ToolSword;
import com.demerzel.helloworld.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<>();

    public static final Item.ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial(
            "material_ruby",
            3,
            1200,
            15.0F,
            3.0F,
            10
    );

    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_RUBY = EnumHelper.addArmorMaterial(
            "armor_material_ruby",
            Reference.MOD_ID + ":ruby",
            12,
            new int[]{4, 10, 7, 4},
            10,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            0.0f);

    public static final Item RUBY = new ItemBase("ruby");
    public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot");

    public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
    public static final ItemSpade RUBY_SPADE = new ToolSpade("ruby_spade", MATERIAL_RUBY);
    public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
    public static final ItemAxe RUBY_AXE = new ToolAxe("ruby_axe", MATERIAL_RUBY);

    public static final Item RUBY_HELMET = new ArmorBase("ruby_helmet", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.HEAD);
    public static final Item RUBY_CHESTPLATE = new ArmorBase("ruby_chestplate", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.CHEST);
    public static final Item RUBY_LEGGINGS = new ArmorBase("ruby_leggings", ARMOR_MATERIAL_RUBY, 2, EntityEquipmentSlot.LEGS);
    public static final Item RUBY_BOOTS = new ArmorBase("ruby_boots", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.FEET);
}
