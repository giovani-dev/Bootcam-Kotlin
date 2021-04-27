// Funcao normal
private fun getname(name: String, lastname: String): String {
    return "${name} ${lastname}"
}

// Single-line function || funcao em uma linha
private fun getnamesingularity(name: String, lastname: String): String = "${name} ${lastname}"


fun main() {
    println(getname(name="Giovani", lastname="Liskoski Zanini"))    
    println(getnamesingularity(name="Pedro", lastname="Jeremias da Silva"))

}