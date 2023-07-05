package Ex2
//Leia um valor e faça um programa que coloque o valor lido na
//primeira posição de um vetor de tamanho 10. Em cada posição
//subsequente, coloque o dobro do valor da posição anterior. Por
//exemplo, se o valor lido for 1, os valores do vetor devem ser 1,2,4,8 e
//assim sucessivamente. Mostre o vetor em seguida.
fun main(){
    Valor().receberValor()
}
class Valor {
    var vetor = IntArray(10)
    fun receberValor(){
        println("Digite um numero: ")
        vetor[0] = readln().toInt()

        for (i in 1 until vetor.size){
            vetor[i] = vetor[i-1] * 2
        }
        for (i in vetor){
            print("$i ")
        }
    }

}