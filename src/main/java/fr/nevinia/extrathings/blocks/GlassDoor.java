package fr.nevinia.extrathings.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.material.Material;

public class GlassDoor extends DoorBlock
{

    protected GlassDoor()
    {
        super(Block.Properties.create(Material.GLASS).hardnessAndResistance(3.0F).noDrops());
        setRegistryName("glass_door");

    }
}
