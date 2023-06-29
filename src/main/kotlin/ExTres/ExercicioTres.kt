package ExTres

fun main() {
    println("Digite um numero inteiro")
    ExercicioTres().verificarValor(readln().toInt())
}

class ExercicioTres {
    fun verificarValor(valor: Int): Boolean {
        if (valor % 5 == 0) {
            println("O $valor é multiplo de 5")
            return true
        } else {
            println("O $valor não é multiplo de 5")
            return false
        }

    }



}