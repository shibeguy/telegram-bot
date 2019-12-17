package me.shibeguy.bot.handler;

import me.shibeguy.bot.Main;
import me.shibeguy.bot.commands.CopypastaCommand;
import me.shibeguy.bot.commands.DefineCommand;
import me.shibeguy.bot.commands.JokeCommand;
import me.shibeguy.bot.commands.admin.BanCommand;
import me.shibeguy.bot.commands.admin.DemoteCommand;
import me.shibeguy.bot.commands.admin.PromoteCommand;
import me.shibeguy.bot.commands.admin.UnbanCommand;

public class BotRegistry {

    private final Main main;

    public BotRegistry(Main main) {
        this.main = main;

        main.getTelegramBot().getCommandRegistry().registerCommand(new DefineCommand(this));
        main.getTelegramBot().getCommandRegistry().registerCommand(new PromoteCommand(this));
        main.getTelegramBot().getCommandRegistry().registerCommand(new JokeCommand(this));
        main.getTelegramBot().getCommandRegistry().registerCommand(new CopypastaCommand(this));
        main.getTelegramBot().getCommandRegistry().registerCommand(new DemoteCommand(this));
        main.getTelegramBot().getCommandRegistry().registerCommand(new BanCommand(this));
        main.getTelegramBot().getCommandRegistry().registerCommand(new UnbanCommand(this));
    }

    public Main getMain() {
        return main;
    }
}
