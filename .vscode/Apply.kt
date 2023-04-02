/*La Función apply
El propósito de la función apply es tomar como alcance al objeto recibidor T sobre el que es invocado, aplicar las sentencias del parámetro block que recibe sobre dicho contexto y retornar el mismo objeto modificado.

inline fun <T> T.apply(block: T.() -> Unit): T

Lenguaje del código: Kotlin (kotlin)
Como ves, el cuerpo del tipo función a pasar es Unit, esto significa que no es necesario especificar un resultado en la última línea de la lambda con recibidor que pases como argumento.

Para referirte al recibidor, usa la expresión this y así tendrás acceso a los miembros.

instancia.apply{
    // Modificación de propiedades
    // Llamada de métodos
    // etc.
}

La función apply trabaja similar a with, solo que apply es una función de extensión y retorna al objeto recibidor como resultado.

Esto te permite inicializar propiedades cuando creas u obtienes instancias de una clase e incluso encadenar operaciones subsecuentes.

Ejemplo Con La Función apply
Tomemos como ejemplo la declaración de una clase que representa un par de zapatos en el inventario de un negocio.*/

data class Shoe(
    var size: Int = 38,
    var color: String = "Negro",
    var stock: Int = 10
)
/* 
Ahora supongamos que es necesario crear una instancia inicial por defecto, luego es necesario cambiar sus propiedades y finalmente imprimir su detalle.*/

fun main() {
    val newShoe = Shoe()

    val shoeDetail = newShoe.apply {
        size = 42
        color = "Rojo"
        stock = 25
    }.toString()

    print(shoeDetail)
}
/* 
Salida:

Shoe(size=42, color=Rojo, stock=25)

Al usar la función apply sobre la instancia del par de zapatos, fue posible acceder directamente a cada propiedad, ya que el contexto de la función lambda es newShoe. Si usas IntelliJ podrás un mensaje del objeto recibidor permanente:*/
val shoeDetail = newShoe.apply{ 
    this: Shoe
    size = 42
    color = "Rojo"
    stock = 25

}.toString()
/* 
Función apply En Android
La función apply es de gran utilidad cuando obtienes referencias de views en Android o las creas desde el código.

Por ejemplo, supón que requieres crear un CheckBox dinámicamente en un fragmento que maneja la creación de cuentas para tus usuarios.

Usando apply, puedes setear las propiedades necesarias para construcción:*/

val checkBox = CheckBox(requireContext()).apply {
    text = "¿Enviar boletín semanal"

    isChecked = true
    contentDescription = "CheckBox para boletín semanal"
    setPadding(20)
}
/* 
Habrán propiedades cuyo mutador set() sea privado y no puedas acceder con el acceso de punto, por lo que debes usar directamente los métodos de asignación como setPadding().*/