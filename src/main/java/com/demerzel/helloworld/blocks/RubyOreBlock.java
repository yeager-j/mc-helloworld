package com.demerzel.helloworld.blocks;

import com.demerzel.helloworld.init.ModItems;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class RubyOreBlock extends BlockBase {
    public RubyOreBlock(String name, Material material) {
        super(name, material);
        setSoundType(SoundType.STONE);
        setHardness(5.0f);
        setResistance(15.0f);
        setHarvestLevel("pickaxe", 2);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ModItems.RUBY;
    }

    @Override
    public int quantityDropped(Random random) {
        return random.nextInt(3) + 1;
    }
}
