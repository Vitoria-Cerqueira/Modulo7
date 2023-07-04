package ExTres
fun main(){
    Imc().mostrarInformacao()
}
class Imc {
    fun mostrarInformacao(){
        println("Digite seu peso: ")
        var pesoUsuario = readln().toDouble()

        println("Digite sua altura: ")
        var alturaUsuario = readln().toDouble()

        calculoImc(pesoUsuario, alturaUsuario)
    }

    fun calculoImc(pesoUsuario: Double, alturaUsuario: Double){
        var resultado = pesoUsuario / (alturaUsuario * alturaUsuario)
        if (resultado < 18.5){
            println("MAGREZA!!");
        } else if (resultado in 18.5..24.9) {
            println("NORMAL!!!");
        } else if (resultado in 25.0..29.9) {
            println("SOBREPESO!!!");
        } else if (resultado in 30.0..39.9) {
            println("OBESIDADE!!");
        } else if (resultado > 40.0) {
            println("OBESIDADE GRAVE!!!!");
        }
    }

}