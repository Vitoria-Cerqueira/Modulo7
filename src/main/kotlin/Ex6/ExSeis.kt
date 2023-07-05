package Ex6
fun main(){
    ExSeis().mostrarTabuada()
}
class ExSeis {
    fun mostrarTabuada(){
        for (i in 1..10){
            for (j in 1..10){
                println("$i x $j = ${i*j}")
            }
            println("---------------")
            println()
        }
    }
}