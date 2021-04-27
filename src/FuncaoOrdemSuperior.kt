fun soma(x: Int, y: Int): Int = x+y

fun calc(x: Int, y: Int, operacao: (Int,Int) -> Int): Int{
    var exec = operacao(x, y)
    return exec
}

fun main() {
    val v1: Int = calc(2, 10, ::soma)
    val v2: Int = calc(2, 10) {a,b -> a*b}
    println(v1)
    println(v2)

}