package Ex2

import java.lang.IllegalArgumentException

fun main(){
    println("Digite um numero entre 1 a 7")
    ExDois().mostrarDiaSemana(readln().toInt())
}
class ExDois{
    fun mostrarDiaSemana(numero: Int){
        if (numero > 0 && numero < 8){
            var dia = arrayOf("Segunda-feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sábado", "Domingo")
            // o dia[numero-1] é para ignorar que o indice começa com 0 e iniciar no 1
            println("Dia da semana correspondente ao número $numero é " + dia[numero-1])
        }else {
            throw IllegalArgumentException("O número informado não está entre 1 a 7")
        }

    }
}