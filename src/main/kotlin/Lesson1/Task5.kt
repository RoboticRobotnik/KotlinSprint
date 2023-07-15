package Lesson1

fun main(){
    val secundKosmos = 6480
    val minutKosmos = secundKosmos / 60
    val ostatokSecundKosmos = secundKosmos % 60

    val chasKosmos = minutKosmos / 60
    val ostatokChasKosmos = minutKosmos % 60

    print(String.format("%02d:%02d:%02d",chasKosmos,ostatokChasKosmos,ostatokSecundKosmos))
}