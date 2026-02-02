#!/usr/bin/env kotlin

interface SpiceColor {
    val color: String
}
object YellowSpiceColor : SpiceColor {
    override val color = "yellow"
}
interface Grinder {
    fun grind()
}

abstract class Spice(
    val name: String,
    val spiciness: String = "mild",
    color: SpiceColor = YellowSpiceColor
) : SpiceColor by color {

    abstract fun prepareSpice()
}

class Curry(
    name: String,
    spiciness: String,
    color: SpiceColor = YellowSpiceColor
) : Spice(name, spiciness, color), Grinder {

    override fun prepareSpice() {
        grind()
    }

    override fun grind() {
        println("Grinding the $name into a fine powder...")
    }
}
fun main() {
    val myCurry = Curry("Yellow Curry", "spicy")

    println("Spice: ${myCurry.name}")
    println("Color: ${myCurry.color}")

    myCurry.prepareSpice()
}