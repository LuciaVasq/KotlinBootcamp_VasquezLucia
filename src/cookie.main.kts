#!/usr/bin/env kotlin

fun main() {
    var fortune: String
    var userChoice = ""
    while (userChoice != "no") {
        fortune = getFortuneCookie()
        println("\nYour fortune is: $fortune")

        if (fortune.contains("Take it easy")) {
            println("You got the special fortune!, kill me now.")
            break
        }

        print("Play again? (yes/no): pls say no")
        userChoice = readLine() ?: "no"
    }
}



fun getFortuneCookie(): String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    print("ingresa tu cumpleanos: ")
    val birthday = readLine()?.toIntOrNull() ?: 1
    return fortunes[birthday % fortunes.size]
}