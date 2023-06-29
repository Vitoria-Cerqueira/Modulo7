package ExUm

fun main(){
    println("Digite um numero inteiro: ")
    println(ExercicioUm().calcularAntecessor(readln().toInt()))

}
class ExercicioUm {
    fun calcularAntecessor(numero: Int): Int {
        return numero - 1
    }
}




