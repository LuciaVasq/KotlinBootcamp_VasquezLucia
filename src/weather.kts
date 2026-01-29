#!/usr/bin/env kotlin
import java.util.*
fun main() {
    println(whatShouldIDoToday("sad"))
    println(whatShouldIDoToday("happy"))

}
fun whatShouldIDoToday(
    mood: String,
    weather: String = "sunny",
    temperature: Int = 24
): String {
    return when {
        isHappySunny(mood, weather) -> "tocar pasto"
        isSadRainyCold(mood, weather, temperature) -> "un rivals"
        isTooHot(temperature) -> "nadota"
        else -> "un rivals"
    }
}

fun isHappySunny(mood: String, weather: String) = mood == "happy" && weather == "sunny"
fun isSadRainyCold(mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "rainy" && temperature == 0
fun isTooHot(temperature: Int) = temperature > 35