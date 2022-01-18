open class Persona(val nombre: String, var vida: Int, tamaño: String) {
    init {
        require(vida in 1..100)
    }

    fun pegar(danio: Int, c: Persona) = c.vida - danio


}

open class Bebe(nombre: String, vida: Int, var tamaño: String) : Persona(nombre, vida, tamaño) {

    fun llorar(tiempo: Int) {
        var a: Char
        a = 'u'
        print("¡B")
        repeat(tiempo) { print(a) }
        print("aaaaah!")
        println()
    }
}
/*Especificacion
d) ¿Quién es la superclase y subclase? superclase: Persona, Subclase: Bebe
e) ¿Existe otra forma de implementarlo que no sea a través de la herencia?
f) Piensa y comenta qué ventajas aporta esta implementación de herencia, con respecto a otra.*/




open class Transporte(var x0: Int) {

    open fun movimiento(x: Int): Int {
        return x0 + x
    }

}

open class Avion(x0: Int, var y0 : Int) : Transporte(x0) {

    fun movimiento(x: Int, y:Int): Int {
        return y0 + y
    }
}
/*Extension
d) ¿Quién es la superclase y subclase? superclase transporte, Subclase Avion
e) ¿Existe otra forma de implementarlo que no sea a través de la herencia?
f) Piensa y comenta qué ventajas aporta esta implementación de herencia, con respecto a otra.*/
fun main() {
    var a = Bebe("Edu", 12, "70cm")
    a.llorar(12)
}