package Ex12

// Escreva um algoritmo que leia o ano de nascimento de uma pessoa
//e apresente uma linha do tempo, mostrando cada ano de vida da
//pessoa e quantos anos ela tinha em cada ano até o ano atual.
fun main(){
    ExDoze().calcularAno()
}
class ExDoze {

    fun calcularAno(){
        var anoNascimento = 0
        var idade = 0

        println("Digite o ano que você nasceu: ")
        anoNascimento = readln().toInt()

        println("Ano: $anoNascimento \nIdade: $idade ")
        while (anoNascimento < 2023)
            println("Ano: " + (++anoNascimento) + "\nIdade " + (++idade))
    }
}