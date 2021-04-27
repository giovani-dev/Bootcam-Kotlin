

fun main() {
    var txt: String = "Seja bem vindo"
    var nome_txt: String = "Giovani"
    var txt_completo: String = "${txt} ${nome_txt}"
    
    println(txt_completo)
    println("${txt} ${nome_txt}")
    println("Primeiro caracter -> " + txt[0])
    println("Penultimo caracter -> " + txt[txt.length-1])
    println("Primeiro caracter -> " + txt.first())
    println("Ultimo Caracter -> " + txt.last())
}