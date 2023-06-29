package ExCinco
fun main(){
    println("Digite um número: ")
    ExercicioCinco().verificarNumero(readln().toDouble())
}
class ExercicioCinco {
    fun verificarNumero(numero: Double){
        if (numero >= 0){
            println("O numero é positivo")
        }else{
            println("O numero é negativo")
        }
    }
}


