package ExNove
fun main(){
    Temperatura().infoTemperatura()
}
class Temperatura {
    fun infoTemperatura(){
        println("Digite a temperatura em °C: ")
        val temperatura = readln().toDouble()
        converterTemperatura(temperatura)
    }
    fun converterTemperatura(temperatura: Double){
        val f = (9*temperatura+160) / 5

        println("A temperatura em fahrenheit é $f")
    }
}