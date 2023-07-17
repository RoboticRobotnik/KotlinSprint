package Lesson2

fun main(){
    val vremiaViezda = 9 * 60 + 39
    val vremiaVputi = 457

    val chasPribitia = (vremiaViezda + vremiaVputi) / 60
    val minutaPribitia = (vremiaViezda + vremiaVputi) % 60

    println("$chasPribitia:$minutaPribitia")

}