
// declarando variavel com valor mutavel, onde o valor sera atribuido durante a execucao
var nome1: String = "Giovani"

// declarando variavel com valor imutavel onde o valor sera atribuido curante a execucao, seguindo o padrao CamelCase
val nome2: String = "Liskoski"

// declarando varaivel com valor imutavel onde o valor e atribuido durante a compilacao, seguindo o padrao SNAKE_CASE
const val NOME_3 = "Zanini"


fun main() {
    // max value of int
    println("int -> "+Int.MAX_VALUE)
    
    // max value of long
    println("long -> "+Long.MAX_VALUE)
    
    // max value of float
    println("float -> "+Float.MAX_VALUE)
    
    // max value of double
    println("double -> "+Double.MAX_VALUE)
    
    // max value of byte
    println("byte -> "+Byte.MAX_VALUE)

    
    println(nome1 + " " + nome2 + " " + NOME_3)
}