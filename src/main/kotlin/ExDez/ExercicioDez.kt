package ExDez

fun main() {
    println("Digite um numero inteiro: ")
    println(ExercicioDez().calcularSucessor(readln().toInt()))

}

class ExercicioDez {

    fun calcularSucessor(numero: Int): Int {
        return numero + 1
    }

}

