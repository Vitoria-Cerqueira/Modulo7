package ExOnze
fun main(){
    Produto().receberInformacao()
}
class Produto {
    fun receberInformacao(){
        println("Digite o preço de custo: ")
        val precoProduto = readln().toDouble()

        println("Digite o percentual: ")
        val percentual = readln().toDouble()
        calcularInformacao(precoProduto, percentual)
    }
    fun calcularInformacao(precoProduto: Double, percentual: Double){
        val precoVenda = precoProduto + (precoProduto * (percentual/100))
        println("O valor de venda do produto é: R$%.2f".format(precoVenda))
    }
}