package fr.nevinia.extrathings.blocks;

import fr.nevinia.extrathings.ExtraThings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = ExtraThings.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ExtraThingsBlocks
{
    @ObjectHolder(ExtraThings.MODID + ":glass_door")
    public static final Block GLASS_DOOR = null;

    @SubscribeEvent
    public static void registerBlock(final RegistryEvent.Register<Block> event)
    {
        event.getRegistry().register(new GlassDoor());
    }

    @SubscribeEvent
    public static void registerItem(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().register(new BlockItem(GLASS_DOOR, new Item.Properties().maxStackSize(1).group(ExtraThings.EXTRATHINGS_GROUP)).setRegistryName(GLASS_DOOR.getRegistryName()));
    }
}
