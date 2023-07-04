package ExQuatro
fun main(){
    Retangulo().receberInfo()
}
class Retangulo {
    fun receberInfo(){
        println("Digite a base do retangulo: ")
        val base = readln().toDouble()

        println("Digite a altura do retangulo: ")
        val altura = readln().toDouble()
        calcularArea(base,altura)

    }
    fun calcularArea(base:Double, altura:Double){
        val area = base * altura
        println("A aerea do retângulo é: $area")
    }
}