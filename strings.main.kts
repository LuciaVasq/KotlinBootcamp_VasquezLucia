#!/usr/bin/env kotlin

import kotlin.collections.MutableList as MutableList1

val trout = "trout"
var haddock = "haddock"
var snapper = "snapper"
println("no se que es nada de eso $trout , $snapper,  $haddock")

val fishName= "pescao"
when(fishName.length){
    0 -> println("nombre no puede estar vacio")
    in 3..12 -> println("pescao")
    else -> println("mal pescao")
}

