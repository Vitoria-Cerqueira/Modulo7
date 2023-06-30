package Ex5

fun main() {
    ExCinco().listaCompras()
}

class ExCinco {
    fun listaCompras() {
        println("Digite a quantidade de itens da lista de compras: ")
        var qta = readln().toInt()

        var listaCompras = arrayOf<String>()

        for (compra in 1..qta) {
            println("Digite o produto: ")
            listaCompras = listaCompras.plus(readln())

            println("Lista de compras")
            for (item in listaCompras){
                println(item)
            }
        }
    }
}
