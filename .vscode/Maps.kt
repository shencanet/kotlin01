
fun main(args: Array<String>) {

    // Maps Inmutables
    val edadDeSuperHeroes = mapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitan America" to 99
    )
    println(edadDeSuperHeroes)

    // Maps mutables
    val edadDeSuperHeroesMutable = mutableMapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitan America" to 99
    )
    println(edadDeSuperHeroesMutable)

    // Consultar un valor por su clave
    val edadIronman = edadDeSuperHeroesMutable["Ironman"]
    println("La edad de Ironman es $edadIronman")

    // Agregar elemento a un Map usando la función put
    edadDeSuperHeroesMutable.put("Wolverine", 45)
    println(edadDeSuperHeroesMutable)

    // Usando asignación
    edadDeSuperHeroesMutable["Storm"] = 30
    println(edadDeSuperHeroesMutable)

    // Eliminar elemento de nuestro Map
    edadDeSuperHeroesMutable.remove("Wolverine")

    // Para conocer todas las keys de nuestro map .keys
    println(edadDeSuperHeroesMutable.keys)

    // Todos los valores del map usamos .values
    println(edadDeSuperHeroesMutable.values)



} 
/*Mapas
Los mapas asocian claves con valores. Las claves deben ser únicas, pero los valores asociados no. De este modo, cada valor puede ser usado para identificar de manera única el valor asociado, ya que el mapa asegura que no puedes duplicar claves en la colección. Internamente, Kotlin usa la colección Java Map para implementar los mapas.
A diferencia de las interfaces List y Set en Kotlin que extienden la interfaz Collection, la interfaz Map no extiende nada. Algunas de las propiedades y funciones disponibles en esta interfaz se muestran a [g1] continuación. Observa como solo se permite hacer consultas, al definir una colección inmutable.

    size: tamaño de la colección.

    isEmpty(): indica si el mapa está vacío.

    containsKey(key: K): indica si el mapa contiene una clave.

    containsValue(value: V): indica si el mapa contiene un valor.

    get(key: K): valor asociado a la llave dada o null si no se encuentra.

    keys: devuelve un Set inmutable con todas las claves en el mapa.

    values: Collection inmutable de todos los valores en el mapa.

mapOf() crea un mapa inmutable compuesto por una lista de pares, donde el primer valor es la clave, y el segundo es el valor. Devuelve un objeto de tipo Map. */