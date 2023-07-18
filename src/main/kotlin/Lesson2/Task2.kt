package Lesson2

    fun main() {
        val chisloRabotnik = 50
        val zpRabotnik = 30000
        val chisloStager = 30
        val zpStager = 20000
        val zpRabotnikov = zpRabotnik * chisloRabotnik
        val zpStagerov = chisloStager * zpStager
        val zpVseh = zpRabotnikov + zpStagerov

        val srediZp = zpVseh / (chisloRabotnik + chisloStager)

        println(zpRabotnikov)
        println(zpVseh)
        println(srediZp)

    }
