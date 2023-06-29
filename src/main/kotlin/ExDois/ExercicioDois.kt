package ExDois

fun main(){
    println("Informe sua idade: ")
    println("Anos vividos: ${ExercicioDois().calcularAnosVividos(readln().toInt())}")
}
class ExercicioDois {
    fun calcularAnosVividos(idade : Int): Int{
        return idade * 365
    }
}


