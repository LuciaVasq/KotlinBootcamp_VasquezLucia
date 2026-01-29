#!/usr/bin/env kotlin
import java.util.*

fun main() {
    val fortune = getFortuneCookie()
    println("Tu fortuna es: $fortune")
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
    print("Ingresa tu cumpleanos: ")

    val birthday = readLine()?.toIntOrNull() ?: 1

    return fortunes[birthday % fortunes.size]
}