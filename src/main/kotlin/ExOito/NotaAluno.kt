package ExOito
//Escrever um programa que leia o nome de N alunos e as notas das
//três provas que ele obteve no semestre. No final informar o nome do
//aluno e a sua média (aritmética)
//Obs: use vetores para a resolução do exercício
fun main(){
    NotaAluno().receberInfo()
}
class NotaAluno {
    var nomeEstudantes = arrayOf<String>()
    var notasAluno = arrayOf<Double>()

    fun receberInfo(){
        println("Digite a quantidade de alunos: ")
        val qtaAlunos = readln().toInt()

        for (i in 1..qtaAlunos){
            println("Digite o nome do aluno: ")
            nomeEstudantes = nomeEstudantes.plus(readln())

            println("Digite a nota: ")
            val nota1 = readln().toDouble()

            println("Digite a nota: ")
            val nota2 = readln().toDouble()

            println("Digite a nota: ")
            val nota3 = readln().toDouble()

            val mediaAlunos = (nota1 + nota2 + nota3)/3
            notasAluno = notasAluno.plus(mediaAlunos)
        }
        var contador = 0
        for (i in nomeEstudantes){
            println("$i media ${notasAluno[contador]}")
            contador++
        }
    }
}