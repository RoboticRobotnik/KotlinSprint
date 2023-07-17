package Lesson2

import kotlin.math.*

fun main(){
    val vklad = 70000.0
    val srokVklada = 20.0
    val procent = 16.7


    val finaSumma = vklad * ((1.0 + procent / 100.0).pow(srokVklada))

    println(String.format("%.3f", finaSumma))

}