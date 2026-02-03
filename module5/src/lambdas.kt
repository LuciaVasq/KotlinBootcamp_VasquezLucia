fun List<Int>.filterDivisible(block: (Int) -> Int): List<Int> {
    val result = mutableListOf<Int>()
    for (item in this) {
        if (block(item) == 0) {
            result.add(item)
        }
    }
    return result
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    val divisibleByThree = numbers.filterDivisible { it % 3 }

    println(divisibleByThree) // Output: [3, 6, 9, 0]
}