package com.github.andrewalbizati

import java.io.File
import java.io.FileWriter
import java.io.IOException
import java.util.*

/**
 * Creates token.txt if not already created.
 * @param args N/A
 */
fun main(args: Array<String>) {
    // Check if token.txt is present, creates new files if absent
    try {
        val tokenFile = File("token.txt")
        if (tokenFile.createNewFile()) {
            println("token.txt has been created")

            // Get token from user
            val sc = Scanner(System.`in`)
            print("Paste token: ")
            val token = sc.nextLine()

            // Write to file
            val writer = FileWriter("token.txt")
            writer.write(token)
            writer.close()
        }
    } catch (e: IOException) {
        e.printStackTrace()
        return
    }

    // Get token from token.txt
    val token: String
    try {
        val tokenFile = File("token.txt")
        val sc = Scanner(tokenFile)
        token = sc.nextLine()
        sc.close()
    } catch (e: NullPointerException) {
        e.printStackTrace()
        println("Token not found! " + e.message)
        return
    } catch (e: IOException) {
        e.printStackTrace()
        println("Token not found! " + e.message)
        return
    }

    // Create and run the bot
    val bot = Bot(token)
    bot.run()
}

