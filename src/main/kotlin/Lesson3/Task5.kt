package Lesson3

fun main(){
    val zapisHoda = "D2-D4;0"

    val otkuda = zapisHoda[0].toString() + zapisHoda[1].toString()
    val kuda = zapisHoda[3].toString() + zapisHoda[4].toString()

    val nomerHoda = zapisHoda.split(";")[1]

    println(otkuda)
    println(kuda)
    println(nomerHoda)

}