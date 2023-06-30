package ExQuatro

fun main() {
    println("Informe a temperatura: ")
    ExercicioQuatro().medirTemperatura(readln().toDouble())
}

class ExercicioQuatro {
    fun medirTemperatura(temperatura: Double) {
        if (temperatura <= 18) {
            println("O clima está frio")
        } else if (temperatura in 19.0..23.0) {
            println("O clima está agradavel")
        } else if (temperatura in 24.0..34.0) {
            println("O clima está quente")
        } else {
            println("O clima está muito quente")
        }
    }
}
