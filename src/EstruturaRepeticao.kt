fun _while(repetir: Int) {
    var contador = 1
    while(contador <= repetir) {
        println("Seu numero e: ${contador}")
        contador++
    }
}

fun do_while(repetir: Int) {
    var contador = 1
    do {
        println("Seu numero e: ${contador}")
        contador++
    } while(contador <= repetir)
}

fun _for(repetir: Int) {
    println("- crescente contando de 2 em 2 numeros")
    for(i in 0..repetir step 2){
        println("Seu numero e: ${i}")
    }
    println("\n- inverso")
    for(i in 10 downTo 0){
        println("Seu numero e: ${i}")
    }
    
    println("\n- conta do valor atual ate o estabelecido menos 1")
    for(i in 0 until 10){
        println("Seu numero e: ${i}")
    }
    
    println("\n- percorre uma string")
    for(i in "Giovani"){
        println(i)
    }
}


fun main() {
    _for(repetir=10)
    do_while(repetir=10)
    _while(repetir=10)

}