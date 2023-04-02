/*Una de las características de Kotlin es la posibilidad de trabajar con funciones con parámetros con valores por defecto. Tomemos como ejemplo la función sum que tiene dos parámetros y le agregamos un parámetro más: */

fun sum(x:Int, y:Int, z:Int): Int{
    return x + y + z
 }

 fun printWholeName(firstName: String, secondName: String = "", surName: String) {
    println("My name is $firstName ${if (secondName.isNotEmpty()) "$secondName " else ""}$surName")
}