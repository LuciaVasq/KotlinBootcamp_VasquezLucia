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

data class SpiceContainer(val spice: Spice) {
    val label: String = spice.name
}
fun main() {

    val curry = Curry("Yellow Curry", "mild")
    val chili = Curry("Red Chili", "spicy")



    val container1 = SpiceContainer(curry)
    val container2 = SpiceContainer(chili)


    println("Container 1 label: ${container1.label}")
    println("Container 2 label: ${container2.label}")


}