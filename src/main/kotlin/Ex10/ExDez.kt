package Ex10
fun main(){
    ExDez().calcularSoma()
}
class ExDez {
    var vetor = arrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)
    fun calcularSoma(){
        var soma = 0
        var posicao = 0

        do {
            soma += vetor[posicao]
            posicao++
        }while (posicao < vetor.size)

        println("A soma dos numeros é: $soma")
    }
}