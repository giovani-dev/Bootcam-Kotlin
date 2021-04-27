fun ifelse(expressao1: Boolean, expressao2: Boolean): Unit {
    if(expressao1){
        println("Primeiro bloco da condicional")
    } else if(expressao2){
        println("Segundo bloco da condicional")
    } else{
		println("Terceiro bloco da condicional")        
    }
}

// Pode ser uitlizado um exprecao logica em cada case, ou nao, dependendo do caso
fun switch(case1: Boolean, case2: Boolean, case3: Boolean): Unit {
    when {
        case1 and case2 -> {println("case 1")}
        !case2 and case3 -> {println("case 2")}
        !case3 and case2 -> {println("case 3")}
        else -> {println("Morreu")}
    }
    
    when((0..55).random()){
        in 0..3 -> {println("Giovani")}
        in 4..16 -> {println("Liskoski")}
       	55 -> {print("Zanini")}
        else -> {print("banana")}
    }
}

// Elvis operator, ele atribui a variavel o valor que nao for nullo.
// Para maior seguranca, 1 dos valores nao deve ser nullo. 
// Caso tenha-se 2 valores que nao sao nullos, o primeiro valor da expressao sera atribuido a varivel
val a: Int? = 1
val number = a ?: 10

fun main() {
    println("\n\n---------------------- ElvisOperator -----------------------")  
    println(number)
 	println("\n\n---------------------- IfElse -----------------------")  
    ifelse(true, true)
    println("\n\n---------------------- When -----------------------")
	switch(true, true, false)
}