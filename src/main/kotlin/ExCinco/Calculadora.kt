package ExCinco

fun main(){
    Calculadora().receberInfo()
}
class Calculadora {
    fun receberInfo(){
        println("Digite um numero: ")
        val numero1 = readln().toDouble()

        println("Digite o segundo numero: ")
        val numero2 = readln().toDouble()

        mostrarConta(numero1,numero2)
    }

    fun mostrarConta(numero1 : Double, numero2: Double){
        println("O resultado da soma é: ${numero1+numero2}")
        println("O resultado da subtração é: ${numero1-numero2}")
        println("O resultado da multiplicação é: ${numero1*numero2}")
        println("O resultado da dividir é: ${numero1/numero2}")

    }
}