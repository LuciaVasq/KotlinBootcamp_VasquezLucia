#!/usr/bin/env kotlin

import kotlin.Int

val fish: Int = 2
val totalFish: Int = fish.plus(71).plus(233).minus(13)

val aquariums = totalFish / 30 + if (totalFish % 30 > 0) 1 else 0

var rainbowColor = "red"
rainbowColor = "blue"
val blackColor = "black"
//blackColor = "white"
var greenColor = null
var blueColor: Int? = null

listOf(null,null)
//[null, null]
//var list: List, = listOf(null, null)
//var list2:List,? = null
//println(nullTest?.inc() ?:0)