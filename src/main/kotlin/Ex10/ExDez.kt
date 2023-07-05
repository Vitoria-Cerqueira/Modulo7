package Ex10

fun main(){
    ExDez().receberNumero()
}
class ExDez {
    fun receberNumero(){
        println("Digite um valor para X: ")
        val numeroX = readln().toInt()

        println("Digite um valor para Y: ")
        val numeroY = readln().toInt()

        if (numeroX == numeroY){
            println("Os números são iguais")
        }else{
            println("Os números são diferentes")
        }
    }
}