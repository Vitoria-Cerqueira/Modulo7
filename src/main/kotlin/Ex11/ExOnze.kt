package Ex11
//Escreva um algoritmo que leia 15 números do usuário. Ao final exiba
//a média dos 15 números. Utilize o comando de repetição Para (For)
fun main(){
    ExOnze().lerNumeros()
}
class ExOnze {
    var vetor = IntArray(15)
    fun lerNumeros(){
        for (posicao in vetor.indices){
            println("Digite o número ${posicao + 1}: ")
            vetor[posicao] = readln().toInt()
        }
        var soma = vetor.sum()
        println("A soma dos numeros é: $soma")

        var media = soma / vetor.size
        println("A media dos números é: $media")
    }
}