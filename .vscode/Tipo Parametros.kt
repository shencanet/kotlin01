/*Una de las características de Kotlin es la posibilidad de trabajar con funciones con parámetros con valores por defecto. Tomemos como ejemplo la función sum que tiene dos parámetros y le agregamos un parámetro más: */

fun sum(x:Int, y:Int, z:Int): Int{
    return x + y + z
 }

 fun printWholeName(firstName: String, secondName: String = "", surName: String) {
    println("My name is $firstName ${if (secondName.isNotEmpty()) "$secondName " else ""}$surName")
}


fun main(args: Array<String>) {

    // Let
    var nombre: String? = null
    nombre?.let { // Esto no se ejecutará
        println("El nombre no es nulo, es $it")
    }
    nombre = "Giuseppe"
    nombre?.let { // Esto se ejecutará
        println("El nombre no es nulo, es $it")
    }

    //With
    val usuario = "giuseppe@platzi.com"
    val mensajeDeInicioSesion = with(usuario) {
        iniciarSesion(this)
        "Bienvenido $this"
    }
    println(mensajeDeInicioSesion)

    //Run
    val moviles = mutableListOf("Google Pixel 2XL","Google Pixel 4a","Huawei Redmi 9","Xiaomi mi A3").run {
        removeIf { movil -> movil.contains("Google") }
        this
    }
    println(moviles)

    //Apply
    val movilesSinGoogle = mutableListOf("Google Pixel 2XL","Google Pixel 4a","Huawei Redmi 9","Xiaomi mi A3").apply{
            removeIf { movil -> movil.contains("Google") }
        }
    println(movilesSinGoogle)

    //Also
    val lista = mutableListOf("Google Pixel 2XL","Google Pixel 4a","Huawei Redmi 9","Xiaomi mi A3")
        .also { lista -> println("Lista original $lista") }
        .asReversed()

    println(lista)

}

fun iniciarSesion(usuario: String){
    println("Iniciando sesión con usuario $usuario")
}