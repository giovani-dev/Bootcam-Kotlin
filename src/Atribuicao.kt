fun maxValue(a: Int, b: Int): Int? {
    val max: Int? = if(a > b) a else if(a < b) b else null
    return max
}
fun minValue(a: Int, b: Int): Int? {
	val min: Int? = if(a < b){
        a
    } else if(a > b){
        b
    } else{
        null
    }
    return min
}


fun main() {
    var teste_max: Int? = maxValue(a=2, b=1)
    var teste_min: Int? = minValue(a=2, b=1)
    println(teste_max)
    println(teste_min)
}