package ExSeis
fun main(){
    LerNumeros().percorrerNumeros()
}
class LerNumeros {
    fun percorrerNumeros(){
        println("Digite a quantidade de números que deseja inserir: ")
        val quantidade = readln().toInt()

        var vetor = arrayOf<Int>()
        for (i in 1..quantidade){
            println("Digite o $i numero: ")
            vetor = vetor.plus(readln().toInt())
        }
        println("O menor valor é: ${vetor.min()}")
    }
}