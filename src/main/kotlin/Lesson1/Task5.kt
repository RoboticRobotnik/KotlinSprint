package Lesson1

fun main(){
    val secundKosmos = 6480
    val minutKosmos = secundKosmos/60
    val ostatokSecundKosmos = secundKosmos%60

    val chasKosmos = minutKosmos/60
    val ostatokChasKosmos = minutKosmos%60

    print("%02d".format(chasKosmos)+":"+"%02d".format(ostatokChasKosmos)+":"+"%02d".format(ostatokSecundKosmos))
}