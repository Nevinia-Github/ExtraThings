package fr.nevinia.extrathings.items;

import fr.nevinia.extrathings.ExtraThings;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = ExtraThings.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ExtraThingsItems
{
    @ObjectHolder(ExtraThings.MODID + ":cooked_egg")
    public static final Item COOKED_EGG = null;

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().register(new Item(new Item.Properties().group(ExtraThings.EXTRATHINGS_GROUP).food(ExtraThingsFoods.COOKED_EGG)).setRegistryName("cooked_egg"));
    }
}
