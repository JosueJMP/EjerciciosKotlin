package org.example


fun main (){
    val scanner = java.util.Scanner(System.`in`)
    var opcion: Int

    do {
        println(
            """
                Menú:
                1. Ejercicio 1
                2. Ejercicio 2
                3. Ejercicio 3
                4. Ejercicio 4
                5. Ejercicio 5
                6. Ejercicio 6
                7. Ejercicio 7
                8. Ejercicio 8
                9. Salir
                Elige una opción: 
                """.trimIndent()
        )
        opcion = scanner.nextInt()

        when (opcion) {
            1 -> ejercicio1()
            2 -> ejercicio2()
            3 -> ejercicio3()
            4 -> ejercicio4()
            5 -> ejercicio5()
            6 -> ejercicio6()
            7 -> ejercicio7()
            8 -> ejercicio8()
            9 -> println("Hasta la vista ....")
            else -> println("Opción no válida.")
        }
    } while (opcion != 9)
}

fun ejercicio1() {
    val vida = 100
    val personaje = "Naruto"
    println("El personaje $personaje tiene $vida puntos de vida.")
}

fun ejercicio2() {
    val energia = 80
    val estado = if (energia > 50) "Personaje fuerte" else "Personaje débil"
    println(estado)
}

fun ejercicio3() {
    val cofres = arrayOf("Espada", "Escudo", "Poción")
    for (cofre in cofres) {
        println("Has encontrado: $cofre")
    }
}

fun ejercicio4() {
    for (i in 1..5) {
        if (i == 3) continue  // Salta la iteración cuando i es 3
        println("Número: $i")
    }
}

fun ejercicio5() {
    val goku = Personaje("Goku", 100, 50)
    goku.mostrarInfo()
}

fun ejercicio6() {
    val personaje: String? = null
    if (personaje != null) {
        println("El personaje es $personaje")
    } else {
        println("No hay personaje.")
    }
}

fun ejercicio7() {
    println(multiplicar(5))

    val operacion: Operacion = Operacion { a, b -> a + b }
    println(operacion.sumar(3, 4))
}

fun ejercicio8() {
    val goku = Personaje("Goku", 100, 20)
    val vegeta = Personaje("Vegeta", 80, 25)

    while (goku.vida > 0 && vegeta.vida > 0) {
        goku.vida -= vegeta.ataque
        vegeta.vida -= goku.ataque
        println("Vida de Goku: ${goku.vida}")
        println("Vida de Vegeta: ${vegeta.vida}")
    }

    if (goku.vida <= 0) {
        println("Vegeta ha ganado el combate.")
    } else {
        println("Goku ha ganado el combate.")
    }
}

fun multiplicar(num: Int): Int {
    return num * 2
}


internal class Personaje(var nombre: String, var vida: Int, var ataque: Int) {
    fun mostrarInfo() {
        println("Nombre: $nombre, Vida: $vida, Ataque: $ataque")
    }
}