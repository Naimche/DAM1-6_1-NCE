open class Persona(val nombre: String, var vida: Int) {
    init {
        require(vida in 1..100)
    }
    fun pegar(danio: Int, c: Persona) = c.vida - danio

    fun


}


fun main() {

}