package Ex4

fun main(){
    ExQuatro().infoQuantidade()
}
class ExQuatro {
    var gato =0
    var cachorro = 0
    fun infoQuantidade(){
        println("Digite a quantidade de animais")
        val quantidadeAnimal = readln().toInt()

        for (i in 1..quantidadeAnimal){
            println("Digite o tipo de aninal: \n1- Gato \n2- Cachorro")
            when(readln().toInt()){
                1 -> ++gato
                2 -> ++cachorro
                else -> println("Tipo invalido")
            }
        }
        println("Sua loja possui: \n$gato Gatos  \n$cachorro Cachorros ")
    }


}