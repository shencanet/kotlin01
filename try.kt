fun main(args: Array<String>) {

    var nombre : String? = null
    
    // En kotlin, esto regresaría null, 
    // pero la propiedad length nunca la ejecutara.
    print(nombre?.length)
    
    // Simular una excepión, tratar de evitar el !!
    try {
        nombre!!.length
        // Lanzar una exepción NullPointerException
        //throw NullPointerException("Ha ocurrido un error")
    } catch (exception : NullPointerException ) {
        println("Ha ocurrido un error")
    } finally {
        println("Finalmente ha ocurrido un error.. Cerrando aplicación")
    }
    
    
    val primerValor = 10
    val segundoValor = 0
    
    // Asignando el valor que regresa un try/catch
    val resultado : Int = try { primerValor / segundoValor } catch  (exception: Exception) { 0 }
    print(resultado)
    }