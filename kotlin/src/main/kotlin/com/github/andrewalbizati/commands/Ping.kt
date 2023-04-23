package com.github.andrewalbizati.commands

import com.github.andrewalbizati.Bot
import org.javacord.api.entity.message.MessageFlag
import org.javacord.api.event.interaction.SlashCommandCreateEvent
import org.javacord.api.listener.interaction.SlashCommandCreateListener

class Ping(bot: Bot) : SlashCommandCreateListener {
    /**
     * Handles the /ping command, sends a Pong! message back to the user.
     *
     * @param event The event created by the slash command.
     */
    override fun onSlashCommandCreate(event: SlashCommandCreateEvent?) {
        val interaction = event?.slashCommandInteraction!!

        // Ignore other slash commands
        if (!interaction.commandName?.equals("ping", ignoreCase = true)!!) {
            return
        }

        interaction.createImmediateResponder()
            .setContent("Pong!")
            .setFlags(MessageFlag.EPHEMERAL)
            .respond()
    }
}