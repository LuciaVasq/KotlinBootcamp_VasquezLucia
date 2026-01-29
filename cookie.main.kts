#!/usr/bin/env kotlin
import java.util.*

fun main() {
    val birthday = getBirthday()
    val fortune = getFortune(birthday)
    println("\nYour fortune is: $fortune")
}

fun getBirthday(): Int {
    print("Ingresa tu cumpleanos: ")
    return readLine()?.toIntOrNull() ?: 1
}
fun getFortune(birthday: Int): String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    return when (birthday) {
        28, 31 -> "You are extra lucky today! Buy a lottery ticket."
        in 1..7 -> "Start your month with a positive attitude."
        else -> fortunes[birthday % fortunes.size]
    }
}