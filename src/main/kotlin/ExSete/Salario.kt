package ExSete
fun main(){
    Salario().receberInfo()
}
class Salario {
    fun receberInfo(){
        println("Digite o nome do vendedor: ")
        val nomeVendedor = readln()

        println("Digite o seu salário: ")
        var salarioFixo = readln().toDouble()

        println("Digite o valor das vendas realizadas: ")
        val venda = readln().toDouble()
        calcularComissao(nomeVendedor, salarioFixo,venda)
    }
    fun calcularComissao(nome: String, salario: Double, venda: Double){

        println("O salario total do vendedor $nome é: ${venda * 0.15+salario}")
    }
}