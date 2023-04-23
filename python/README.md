# Python Discord Bot Starter Code
This folder contains starter code for a Discord bot written using the discord.py library using Python 3.11.0. The bot is split into a few different .py files with different purposes.

## Files
- **main.py**: Code that gets the bot token from the user, stores it, then creates an instance of the Bot class and runs it.
- **bot.py**: Code that defines the Bot class and its methods.
- **ping.py**: An example of a command using a [Cog](https://discordpy.readthedocs.io/en/stable/ext/commands/cogs.html).

## How to Run the Bot
- If on Windows
    1. `python -m pip install -r requirements.txt`
    2. `python main.py`

- If on macOS/Linux
    1. `python3 -m pip install -r requirements.txt`
    2. `python3 main.py`

## Dependencies
- discord.py [2.2.2](https://discordpy.readthedocs.io/en/stable/index.html#)