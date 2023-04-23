package com.github.AndrewAlbizati.commands;

import com.github.AndrewAlbizati.Bot;
import org.javacord.api.entity.message.MessageFlag;
import org.javacord.api.event.interaction.SlashCommandCreateEvent;
import org.javacord.api.interaction.SlashCommandInteraction;
import org.javacord.api.listener.interaction.SlashCommandCreateListener;

/**
 * Handles when a user executes the /ping command
 * Sends a Pong! message back to the user
 */
public class Ping implements SlashCommandCreateListener {
    private final Bot bot;

    public Ping(Bot bot) {
        this.bot = bot;
    }

    /**
     * Handles the /ping command, sends a Pong! message back to the user.
     *
     * @param event The event created by the slash command.
     */
    @Override
    public void onSlashCommandCreate(SlashCommandCreateEvent event) {
        SlashCommandInteraction interaction = event.getSlashCommandInteraction();

        // Ignore other slash commands
        if (!interaction.getCommandName().equalsIgnoreCase("ping")) {
            return;
        }

        interaction.createImmediateResponder()
                .setContent("Pong!")
                .setFlags(MessageFlag.EPHEMERAL)
                .respond();
    }
}