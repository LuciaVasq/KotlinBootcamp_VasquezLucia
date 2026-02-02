#!/usr/bin/env kotlin
class Spice(val name: String, val spiciness: String) {

    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 5
                "medium" -> 10
                "spicy" -> 15
                "very spicy" -> 20
                else -> 0
            }
        }

    init {
        println("Spice created: $name (Spiciness: $spiciness, Heat: $heat)")
    }
}

fun makeSalt() = Spice("salt", spiciness ="mild" )

fun main() {

    val spiceList = listOf(
        Spice("curry", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red pepper", "very spicy"),
        Spice("wasabi", "very spicy"),
        makeSalt()
    )

    val mildSpices = spiceList.filter { it.heat <= 10 }

    println("\n--- Spices that are medium or milder ---")
    mildSpices.forEach { println("${it.name} is ${it.spiciness}") }
}