package com.github.andrewalbizati

import com.github.andrewalbizati.commands.Ping
import org.javacord.api.DiscordApi
import org.javacord.api.DiscordApiBuilder
import org.javacord.api.interaction.SlashCommand

class Bot(initialToken:String) {
    lateinit var api : DiscordApi
        private set

    private val token : String
    init {
        token = initialToken
    }

    /**
     * Starts the Discord bot and initializes commands
     */
    fun run() {
        api = DiscordApiBuilder().setToken(token).login().join()
        println("Logged in as ${api.yourself.discriminatedName}")

        SlashCommand.with("ping", "Pings the bot").createGlobal(api).join()
        api.addSlashCommandCreateListener(Ping(this))
    }
}