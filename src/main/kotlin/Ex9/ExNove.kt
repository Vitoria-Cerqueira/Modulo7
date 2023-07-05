package Ex9
fun main(){
    ExNove().receberDados()
}
class ExNove {
    fun receberDados(){
        println("Digite a qauntidade de funcionários: ")
        val qtaFuncionario = readln().toInt()
        var nomeFuncionario: String = " "
        var tempoTrabalho = 0
        var temFerias = 0
        var naoTemFerias = 0

        for (i in 1..qtaFuncionario){
            println("Digite o nome do funcionário: ")
            nomeFuncionario = readln()

            println("Digite o tempo de serviços(em meses): ")
            tempoTrabalho = readln().toInt()

            if (tempoTrabalho > 12){
                println("O(a) funcionario(a) $nomeFuncionario tem direito a ferias")
                temFerias++
            }else{
                println("O(a) funcionario(a) $nomeFuncionario não tem direito a ferias")
                naoTemFerias++
            }
        }
        println("Funcionarios que podem ter ferias: $temFerias")
        println("Funcionarios que não podem ter ferias: $naoTemFerias")
    }
}