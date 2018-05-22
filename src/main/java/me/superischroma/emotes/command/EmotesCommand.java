package me.superischroma.emotes.command;

import org.bukkit.entity.Player;
import org.bukkit.command.CommandSender;

public abstract class EmotesCommand {

    // WORK IN PROGRESS //
    CommandSender cs;

    protected boolean isConsole() {
        return !(cs instanceof Player);
    }
}
