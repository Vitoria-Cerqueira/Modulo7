package Ex9

fun main() {
    ExNove().calculadora()
}

class ExNove {
    fun calculadora() {
        println("Digite o primeiro número")
        var numero1 = readln().toInt()

        println("Digite o primeiro número")
        var numero2 = readln().toInt()

        println("O que você deseja:\n1- Somar\n2-Subtrair\n3-Multiplicação\n4-Divisão")
        when (readln().toInt()) {
            1 -> println("A soma dos números é: ${numero1 + numero2}")
            2 -> println("A subtração dos números é: ${numero1 - numero2}")
            3 -> println("A multiplicação dos números é: ${numero1 * numero2}")
            4 -> println("A divisao dos números é: ${numero1 / numero2}")

            else -> {
                println("Opção inválida")
            }
        }

    }
}