package ExDois
fun main(){
    Nome().mostrarMensagem(Nome().receberNome())
}
class Nome {
    fun receberNome(): String{
        println("Digite seu nome: ")
        var nomeUsuario = readln()
        return nomeUsuario
    }
    fun mostrarMensagem(nomeUsuario: String){
        println("Meu nome é $nomeUsuario")
    }
}