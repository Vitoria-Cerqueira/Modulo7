package Ex1

// Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma
//dos números que não são múltiplos de 13 entre X e Y, incluindo
//ambos.
fun main() {
    Numeros().receberNumeros()
}

class Numeros {
    fun receberNumeros() {
        println("Digite o valor de X: ")
        val x = readln().toInt()

        println("Digite o valor de Y: ")
        val y = readln().toInt()
        calcular(x, y)
    }

    fun calcular(x: Int, y: Int) {
        var soma = 0
        for (i in x..y) {
            if (!(i % 13 == 0)) {
                soma += i
            }
        }
        for (i in y..x){
            if (!(i % 13 == 0)) {
                soma += i
            }
        }
        println("A soma dos números que não são multiplos de 13 são: $soma")
    }
}