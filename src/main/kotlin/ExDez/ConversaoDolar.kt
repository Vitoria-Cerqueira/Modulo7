package ExDez
fun main(){
    ConversaoDolar().receberDolar()
}
class ConversaoDolar {
    fun receberDolar(){
        println("Digite a coatação do dolar: ")
        val cotacao = readln().toDouble()

        println("Digite o valor em dolar: ")
        val dolar = readln().toDouble()
        converter(cotacao, dolar)

    }
    fun converter(cotacao:Double, dolar: Double){
        val valorConvertido = dolar/cotacao
        println("O valor convertido para reais é: R$%.2f".format(valorConvertido))    }
}