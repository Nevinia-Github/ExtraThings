package fr.nevinia.extrathings;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ExtraThings.MODID)
public class ExtraThings
{
    public static final String MODID = "extrathings";
    public static final Logger LOGGER = LogManager.getLogger(ExtraThings.MODID);

    public static final ItemGroup EXTRATHINGS_GROUP = new ItemGroup("extrathings")
    {
        @OnlyIn(Dist.CLIENT)
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(Blocks.DIRT);
        }

        @Override
        public boolean hasSearchBar()
        {
            return true;
        }
    };

    public ExtraThings()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::serverSetup);
        MinecraftForge.EVENT_BUS.addListener(this::serverStartingEvent);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

        LOGGER.info("ExtraThings : Common Setup completed");
    }

    private void clientSetup(final FMLClientSetupEvent event)
    {
        LOGGER.info("ExtraThings : Client Setup completed");
    }

    private void serverSetup(final FMLDedicatedServerSetupEvent event)
    {
        LOGGER.info("ExtraThings : Server Setup completed");
    }

    private void serverStartingEvent(FMLServerStartingEvent event)
    {
        ExtraThingsCommands.register(event.getCommandDispatcher());
    }
}
