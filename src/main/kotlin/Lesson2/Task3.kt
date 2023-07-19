package Lesson2

import java.time.LocalTime

fun main(){
    val razriadVremeni = 60
    val vremiaViezda = 9 * razriadVremeni + 39
    val vremiaVputi = 457

    val chasPribitia = (vremiaViezda + vremiaVputi) / razriadVremeni
    val minutaPribitia = (vremiaViezda + vremiaVputi) % razriadVremeni

    println(LocalTime.of(chasPribitia, minutaPribitia))

}