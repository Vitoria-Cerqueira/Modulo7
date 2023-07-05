package Ex5
fun main(){
    ExCinco().receberNome()
}

class ExCinco {
    fun receberNome(){
        println("Digite seu nome: ")
        val nomeUsuario = readln()
        println(saudacao(nomeUsuario))
    }
    fun saudacao(nomeUsuario: String): String{
        return "Seja bem-vindo(a) $nomeUsuario ao nosso sistema!!"
    }
}