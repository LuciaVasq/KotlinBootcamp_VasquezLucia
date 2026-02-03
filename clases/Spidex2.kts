#!/usr/bin/env kotlin
import java.util.*

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00)
}
interface SpiceColor {
    val color: Color
}
object YellowSpiceColor : SpiceColor {
    override val color = Color.YELLOW
}
interface Grinder {
    fun grind()
}

sealed class Spice(
    val name: String,
    val spiciness: String = "mild",
    color: SpiceColor = YellowSpiceColor
) : SpiceColor by color {
    abstract fun prepareSpice()
}

class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor) :
    Spice(name, spiciness, color) {
    override fun prepareSpice() { println("Grinding $name.") }
}
class Salt : Spice("Salt", "none") {
    override fun prepareSpice() { println("Refining salt.") }
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