

fun main() {
    var str: String = " "
    var strnullabe: String? = null

    println("A string esta vazia? - ${str.isEmpty()}")
    println("A string em branco? - ${str.isBlank()}")

    println("A string esta nulla ou em branco? - ${strnullabe.isNullOrBlank()}")
    println("A string esta nulla ou vazia? - ${strnullabe.isNullOrEmpty()}")
}