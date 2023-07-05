package Ex7
fun main(){
    ExSete().quatidadeTurma()
}
class ExSete {
    var qtaAlunos =0
    var qtaTurmas =0
    var totalAlunos = 0
    var media = 0
    fun quatidadeTurma(){
        println("Digite a quantidade de turmas: ")
        qtaTurmas = readln().toInt()

        for (i in 1..qtaTurmas){
            println("Quantos alunos tem nessa turma: $i")
            qtaAlunos = readln().toInt()


            for (aluno in 1..qtaAlunos){
                println("Digite a media do aluno $aluno")
                media += readln().toInt()
                totalAlunos++
            }

            val mediaTurma = (media / totalAlunos)
            println("Media: $mediaTurma Turma: $i")
        }

    }
}