package Ex3

fun main(){
    ExTres().exibirMensagem()
}
class ExTres {
    fun exibirMensagem(){
        var contador : Int = 0
        while (contador < 20){
            println("Eu gosto de estudar Algoritmos")
            contador++
        }
    }
}