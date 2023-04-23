from bot import Bot


def main():
    # Create token.txt if it doesn't already exist
    try:
        f = open('token.txt', 'x')
        f.close()
        print('Created token.txt')
    except FileExistsError:
        pass
    
    # Read token, if not found, take user input
    with open('token.txt', 'r') as f:
        token = f.readline().strip()
    
    if not token:
        token = input("Paste token here: ")
        with open('token.txt', 'w') as f:
            f.write(token)
            f.close()

    # Create bot and run
    bot = Bot()
    bot.run(token)


if __name__ == "__main__":
    main()