fun main(args: Array<String>){
    var nombre : String = null ?: "No hay nombre"
    nombre?.let{
        valor -> println("El NOMBRE NO ES NULO ES $valor")   
     }
     nombre = "David"
     nombre?.let{
        valor -> println("El NOMBRE NO ES NULO ES $valor")   
     }
}