fun main(args: Array<String>){
    val nom = "Marta"
    if(nom.isNotEmpty()){
        println("El nombre no esta vacio $nom  ${nom.length}}")
}else{
    println("El nombre esta vacio")
}

var mensaje: String 
if(nom.length > 5){
    mensaje = "El nombre es muy largo"
}else{
    mensaje = "El nombre es corto"
}
println(mensaje)
}