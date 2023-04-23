from discord.ext import commands
import discord
from cogs.ping import Ping


class Bot(commands.Bot):
    def __init__(self, **options):
        intents = discord.Intents.default()
        intents.message_content = True  
        super().__init__(intents=intents, command_prefix='/')
    
        
    async def on_ready(self):
        """Turns the bot on and adds all of the necessary commands.
        After adding the commands, the bot syncs itself so that they work correctly.
        """
        print(f'Logged in as {self.user}!')
        
        # Add all commands
        await self.add_cog(Ping(self))

        synced = await self.tree.sync()
        print("{} commands synced".format(len(synced)))
