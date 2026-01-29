#!/usr/bin/env kotlin

fun main() {
    // Testing various combinations
    println(whatShouldIDoToday("sad"))
    println(whatShouldIDoToday("happy"))

}
fun whatShouldIDoToday(
    mood: String,
    weather: String = "sunny",
    temperature: Int = 24
): String {
    return when {
        mood == "happy" && weather == "sunny" -> "Go for a walk."
        temperature > 35 -> "Go swimming."
        weather == "rainy" && mood == "sad" -> "Watch a movie."
        else -> "Stay home and read."
    }
}