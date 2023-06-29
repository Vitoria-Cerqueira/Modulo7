package ExNove
fun main(){
    println("Digite uma frase")
    val frase = ExercicioNove().mostrarDigitoUsuario(readln())
    println(frase)
}

class ExercicioNove {
    fun mostrarDigitoUsuario(frase : String): String{
        return frase
    }
}

