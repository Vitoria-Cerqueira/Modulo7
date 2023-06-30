package Ex7

//Escreva um programa que pergunte para a pessoa usuária quantos alunos
//tem na sala dela. Em seguida, através de um laço while, pessa a pessoa
//usuária para que entre com as notas de todos os alunos da sala, um por
//vez. Por fim, o programa mostra a nota média da turma
fun main() {
    ExSete().listarAlunos()
}

class ExSete {
    fun listarAlunos() {
        println("Digite a quantidade de alunos: ")
        var qta = readln().toInt()

        var listaAlunos = arrayOf<Double>()
        var contador = 0

        while (contador < qta) {
            println("Digite a nota do aluno: ${contador + 1}")
            listaAlunos = listaAlunos.plus(readln().toDouble())
            contador++
        }
        var resultadoSoma = listaAlunos.sum()
        println("A soma das notas é: $resultadoSoma")

        var media = resultadoSoma / listaAlunos.size
        println("A media das notas é: $media")
    }
}