package Funcion_llamada_funcion_con_argumentos

fun tabla(numero: Int, terminos: Int = 10) {
    for(i in numero..numero*terminos step numero)
        println(i)
}
fun main(parametro: Array<String>) {
    println("Tabla del 3")
    tabla(3)
    println("Tabla del 3 con 5 terminos")
    tabla(3, 5)
    println("Tabla del 3 con 20 terminos")
    tabla(terminos = 20, numero = 3)
}
