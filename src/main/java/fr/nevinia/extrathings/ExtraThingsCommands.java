package fr.nevinia.extrathings;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.util.text.StringTextComponent;

public class ExtraThingsCommands
{
    public static void register(CommandDispatcher<CommandSource> dispatcher)
    {
        dispatcher.register(LiteralArgumentBuilder.<CommandSource>literal("et")
                .then(Commands.literal("info").executes(ctx -> informations(ctx.getSource()))));
    }

    private static int informations(CommandSource src)
    {
        src.sendFeedback(new StringTextComponent("ExtraThings V 1.0.0 By Nevinia"), true);
        return 0;
    }
}
