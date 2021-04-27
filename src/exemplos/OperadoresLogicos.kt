


fun main() {
    var nome1: String = "Giovani"
    var nome2: String = "Giovani"
    var nome_valido: Boolean = nome1 == nome2
    
    var names: List<String> = listOf(nome1, nome2)
    var contem_nome: Boolean = "Giovani" in names
    var nao_contem_nome: Boolean = "dasdas" !in names
    
    var numeros = 0..20
    var contem_numero: Boolean = 12 in numeros

    var numero_aleatorio: Int = numeros.random()
    var igual_aleatorio: Boolean = numero_aleatorio == 12
}