package com.github.AndrewAlbizati;

import com.github.AndrewAlbizati.commands.Ping;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.interaction.SlashCommand;

public class Bot {
    private final String token;
    private DiscordApi api;

    public Bot(String token) {
        this.token = token;
    }

    public DiscordApi getApi() {
        return api;
    }

    /**
     * Starts the Discord bot and initializes Blackjack and Help commands
     */
    public void run() {
        // Start Discord bot
        api = new DiscordApiBuilder().setToken(token).login().join();
        System.out.println("Logged in as " + api.getYourself().getDiscriminatedName());

        // Create slash command (may take a few minutes to update on Discord)
        SlashCommand.with("ping", "Pings the bot.").createGlobal(api).join();

        // Create slash command listener
        api.addSlashCommandCreateListener(new Ping(this));
    }
}
