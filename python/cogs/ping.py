import discord
from discord.ext import commands
from discord import app_commands


class HelpCommand(commands.Cog):
    def __init__(self, bot):
        self.bot = bot

    @app_commands.command(description="Pings the bot.")
    async def ping(self,  interaction: discord.Interaction):
        """Handles the /ping command, sends a Pong! message back to the user.

        Args:
            interaction (discord.Interaction): Interaction created by the slash command
        """
        await interaction.response.send_message(content=f"Pong!", ephemeral=True)

