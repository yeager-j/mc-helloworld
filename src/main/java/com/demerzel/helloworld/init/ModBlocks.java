package com.demerzel.helloworld.init;

import com.demerzel.helloworld.blocks.BlockBase;
import com.demerzel.helloworld.blocks.RubyBlock;
import com.demerzel.helloworld.blocks.RubyOreBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<>();

    public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
    public static final Block RUBY_ORE_BLOCK = new RubyOreBlock("ruby_ore_block", Material.ROCK);
}
