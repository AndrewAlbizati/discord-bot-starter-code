# Java Discord Bot Starter Code
This folder contains starter code for a Discord bot written using the Javacord library using Java 17 and Gradle. The bot is split into a few different .java files with different purposes.

## Files
- **Main.java**: Code that gets the bot token from the user, stores it, then creates an instance of the Bot class and runs it.
- **Bot.java**: Code that defines the Bot class and its methods.
- **Ping.java**: An example of a command using a [SlashCommandCreateListener](https://javadoc.io/doc/org.javacord/javacord-api/latest/org/javacord/api/listener/interaction/SlashCommandCreateListener.html).

## How to Run the Bot
- If on Windows:
    1. `gradlew build`
    2. `move build\libs\{BOT NAME}-1.0.0.jar .`
    3. `java -jar {BOT NAME}-1.0.0.jar`

- If on macOS/Linux
    1. `chmod +x gradlew`
    2. `./gradlew build`
    3. `mv build/libs/{BOT NAME}-1.0.0.jar .`
    4. `java -jar {BOT NAME}-1.0.0.jar`

## Dependencies
- Javacord [3.8.0](https://javacord.org/)