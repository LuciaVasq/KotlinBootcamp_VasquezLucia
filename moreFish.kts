#!/usr/bin/env kotlin

fun main() {
    println(canAddFish(10.0, listOf(3, 3, 3))) // Expected: false
    println(canAddFish(8.0, listOf(2, 2, 2), hasDecorations = false)) // Expected: true
    println(canAddFish(9.0, listOf(1, 1, 3), 3)) // Expected: false
    println(canAddFish(10.0, listOf(), 7, true)) // Expected: true
}

fun canAddFish(
    tankSize: Double,
    currentFish: List<Int>,
    fishSize: Int = 2, // Default fish size is 2 inches
    hasDecorations: Boolean = true // Default is to assume decorations are present
): Boolean {
    val maxCapacity = if (hasDecorations) tankSize * 0.8 else tankSize
    val currentLoad = currentFish.sum()
    val totalLoad = currentLoad + fishSize

    return totalLoad <= maxCapacity
}