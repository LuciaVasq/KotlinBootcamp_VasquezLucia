import kotlin.math.absoluteValue

enum class Directions {
    NORTH, SOUTH, EAST, WEST, START, END
}
class Game {
    var path = mutableListOf(Directions.START)

    private var x = 0
    private var y = 0
    private val width = 4
    private val height = 4

    private val worldMap = Array(width) { arrayOfNulls<String>(height) }

    init {
        worldMap[0][0] = "You are at the start of a dark forest."
        worldMap[0][1] = "The trees are thinning out here."
        worldMap[1][0] = "You hear a distant waterfall."
        worldMap[1][1] = "You've found a hidden clearing!  careful of the faeries"
    }

    val north: () -> Unit = { path.add(Directions.NORTH); y++ }
    val south: () -> Unit = { path.add(Directions.SOUTH); y-- }
    val east: () -> Unit = { path.add(Directions.EAST); x++ }
    val west: () -> Unit = { path.add(Directions.WEST); x-- }

    val end: () -> Unit = {
        path.add(Directions.END)
        println("Game Over: $path")
        path.clear()
    }

    fun move(where: () -> Unit) {
        where()
        updateLocation()
    }

    fun makeMove(input: String?) {
        when (input?.lowercase()) {
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            else -> move(end)
        }
    }

    private fun updateLocation() {
        // Wrap around logic using rem (remainder) to stay on map
        x = x.rem(width).absoluteValue
        y = y.rem(height).absoluteValue

        val description = worldMap[x][y] ?: "You are wandering through the wilderness. real whimpsy"
        println("Location [$x,$y]: $description")
    }
}

fun main() {
    val game = Game()

    while (true) {
        print("Enter a direction (n/s/e/w): ")
        val input = readLine()

        if (input == "quit") break

        game.makeMove(input)

        if (game.path.isEmpty()) break
    }
}