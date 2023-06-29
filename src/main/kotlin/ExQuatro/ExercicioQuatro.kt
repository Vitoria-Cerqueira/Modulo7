package ExQuatro

fun main() {
    println("Informe a temperatura: ")
    ExercicioQuatro().medirTemperatura(readln().toDouble())
}

class ExercicioQuatro {
    fun medirTemperatura(temperatura: Double) {
        if (temperatura <= 18) {
            println("O clima está frio")
        } else if (temperatura >= 19 && temperatura <= 23) {
            println("O clima está agradavel")
        } else if (temperatura >= 24 && temperatura <= 34) {
            println("O clima está quente")
        } else {
            println("O clima está muito quente")
        }
    }
}
