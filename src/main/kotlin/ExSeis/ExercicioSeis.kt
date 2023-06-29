package ExSeis

fun main(){
    println("Digite um numero")
    println(ExercicioSeis().converterValorDolar(readln().toDouble()))
}

class ExercicioSeis {
    fun converterValorDolar(valor: Double): Double{
        return valor * 4.86
    }
}

