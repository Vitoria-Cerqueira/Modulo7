package Ex6

fun main(){
    ExSeis().exibirInformacoes()
}
class ExSeis {
    var listaMusica = arrayOf<String>()
    var contador = 1

    fun exibirInformacoes(){
        println("Digite o nome da banda: ")
        val banda = readln()

        for (musica in 0..2){
            println("Digite o nome da musica")
            listaMusica = listaMusica.plus(readln())
        }

        println("Banda: $banda")
        for (item in listaMusica){
            println("Musica " + (contador++) + ": " + item)
        }
    }

}
