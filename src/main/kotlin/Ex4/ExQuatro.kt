package Ex4
fun main(){
    ExQuatro().valorUsuario()
}
class ExQuatro {
    var vetor = IntArray(10)

    fun valorUsuario(){
        for (posicao in vetor.indices){
            println("Digite o numero ${posicao + 1}: ")
            vetor[posicao] = readln().toInt()
        }

        for (numero in vetor){
            if (numero % 2 == 0){
                print(" "+ numero)
            }
        }
    }

}