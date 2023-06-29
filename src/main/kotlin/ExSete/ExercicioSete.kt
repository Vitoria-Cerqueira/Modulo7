package ExSete

fun main(){
    var resultado = ExercicioSete().calcularAreaRetangulo(20.4, 34.0)
    println("A area do retangulo é: $resultado")
}

class ExercicioSete {
    fun calcularAreaRetangulo(base: Double, altura: Double): Double{
        return base * altura
    }
}
