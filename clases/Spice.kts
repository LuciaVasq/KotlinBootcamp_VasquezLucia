#!/usr/bin/env kotlin

class SimpleSpice{
    val name: String = "curry"
    val spiciness: String = "mild"

    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 5
                else -> 0
            }
        }
}

fun main() {
    val mySpice = SimpleSpice()

    println("Spice: ${mySpice.name}")
    println("Heat level: ${mySpice.heat}")
}