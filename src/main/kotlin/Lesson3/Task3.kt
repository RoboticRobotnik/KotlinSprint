package Lesson3

fun main(){

    val chislo = 6
    val tablizza = """
           |$chislo x 1 = ${chislo*1}
           |$chislo x 2 = ${chislo*2}
           |$chislo x 3 = ${chislo*3}
           |$chislo x 4 = ${chislo*4}
           |$chislo x 5 = ${chislo*5}
           |$chislo x 6 = ${chislo*6}
           |$chislo x 7 = ${chislo*7}
           |$chislo x 8 = ${chislo*8}
           |$chislo x 9 = ${chislo*9}
           """.trimMargin()

    println(tablizza)

}