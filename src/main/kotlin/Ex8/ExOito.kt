package Ex8
// Crie um algoritmo que escreve o seu nome completo, colocando uma
//palavra em cada linha
fun main(){
    ExOito().nomeUsuario()
}
class ExOito {
    fun nomeUsuario(){
        println("Digite seu nome: ")
        val nomeUsuario = readln()
        val nome = nomeUsuario.split(" ")
        for (i in nome){
            println("$i\n")
        }

    }

}