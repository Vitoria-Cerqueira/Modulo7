package ExUm
fun main(){
    Numero().somaNumeros(Numero().receberNumero())
}

class Numero {
    fun receberNumero():Int{
        println("Digite um número: ")
        val numeroDigitado = readln().toInt()
        return numeroDigitado
    }
    var resultado = 0
    fun somaNumeros(numeroDigitado: Int){
        for (i in 1..numeroDigitado){
            resultado += i
        }
        println("A soma dos numeros de 1 até $numeroDigitado é: $resultado ")

    }
}