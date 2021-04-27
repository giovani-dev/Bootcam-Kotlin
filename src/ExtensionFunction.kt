
// As funcoes de extencao server para tratar tipos especificos
fun String.randomCapitalizedLetter() =
    this[(0..this.length-1).random()].toUpperCase()

fun String.teste(): String {
    println( this[(0..this.length-1).random()].toString() )
    return this[(0..this.length-1).random()].toString()
}
    
    
fun main() {
    var txt: String = "giovani"
    println( txt.teste() )
    println( txt.randomCapitalizedLetter() )
}

fun main() {
    var txt: String = "giovani"
}