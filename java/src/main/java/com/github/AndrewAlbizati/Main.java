package com.github.AndrewAlbizati;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Contains Main function that is run on start.
 */
public class Main {
    /**
     * Creates token.txt if not already created.
     * @param args N/A
     */
    public static void main(String[] args) {
        // Check if token.txt is present, creates new files if absent
        try {
            File tokenFile = new File("token.txt");
            if (tokenFile.createNewFile()) {
                System.out.println("token.txt has been created");

                // Get token from user
                Scanner sc = new Scanner(System.in);
                System.out.print("Paste token: ");
                String token = sc.nextLine();

                // Write to file
                FileWriter writer = new FileWriter("token.txt");
                writer.write(token);
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // Get token from token.txt
        String token;
        try {
            File tokenFile = new File("token.txt");
            Scanner sc = new Scanner(tokenFile);

            token = sc.nextLine();
            sc.close();
        } catch (NullPointerException | IOException e) {
            e.printStackTrace();
            System.out.println("Token not found! " + e.getMessage());
            return;
        }

        // Create and run bot
        Bot bot = new Bot(token);
        bot.run();
    }
}