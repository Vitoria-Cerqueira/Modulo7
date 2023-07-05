package Ex3
// Escreva um algoritmo que simule o funcionamento de um caixa de
//supermercado. O seu algoritmo deve receber da pessoa usuária a
//informação de quantos produtos o cliente comprou e, para cada
//produto, deverá ler o seu preço. Ao final, deverá informar quanto o
//cliente deve pagar pelas compras
fun main(){
    ExTres().infoUsuario()
}
class ExTres {
    var vetor = arrayOf<Double>()
    fun infoUsuario(){
        println("Digite a quantidade de produtos: ")
        val qta = readln().toInt()

        for (i in 1..qta){
            println("Digite o preço do produto: ")
            vetor = vetor.plus(readln().toDouble())
        }
        println("O cliente irá pagar ${vetor.sum()}")

    }
}