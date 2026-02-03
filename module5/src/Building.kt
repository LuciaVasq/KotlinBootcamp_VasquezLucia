

open class BaseBuildingMaterial {
    open val numberNeeded: Int = 1
}

class Wood : BaseBuildingMaterial() {
    override val numberNeeded = 4
}

class Brick : BaseBuildingMaterial() {
    override val numberNeeded = 8
}

class Building<out T : BaseBuildingMaterial>(val material: T) {
    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = baseMaterialsNeeded * material.numberNeeded

    fun build() {
        println("$actualMaterialsNeeded ${material::class.simpleName} required")
    }
}

fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) {
        println("Small building (Requires ${building.actualMaterialsNeeded} units)")
    } else {
        println("Large building (Requires ${building.actualMaterialsNeeded} units)")
    }
}

fun main() {
    val woodBuilding = Building(Wood())
    woodBuilding.build()

    val brickBuilding = Building(Brick())
    brickBuilding.build()

    val woodBuilding1 = Building(Wood())
    val brickBuilding2 = Building(Brick())

    isSmallBuilding(woodBuilding1)
    isSmallBuilding(brickBuilding2)
}