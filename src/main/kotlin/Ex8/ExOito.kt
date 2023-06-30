package Ex8
fun main(){
    ExOito().retonarFibonacci()
}
class ExOito {
    fun retonarFibonacci(){
        println("Informe um número: ")
        val num = readln().toInt()

        var fib1 = 0
        var fib2 = 1
        var fibon = 0

        for (i in 1..num){
            fibon = fib1 + fib2
            fib2 = fib1
            fib1 = fibon
        }
        println("Fib($num) = $fibon")
    }
}