package Ex1
fun main(){
    val exUm = ExUm()
    exUm.valorRecebido()
}
class ExUm {
    var vetor = IntArray(5)

    fun valorRecebido(){
        for (posicao in vetor.indices){
            println("Digite o valor ${posicao + 1}: ")
            vetor[posicao] = readln().toInt()
        }

        val soma = vetor.sum()
        println("A soma dos valores é: $soma")
    }
}