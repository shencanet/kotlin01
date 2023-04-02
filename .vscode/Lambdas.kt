fun main(args:Array<String>){
    val myLambda : (String) -> Int = {
        //it es el parametro que estamos pasando
        valor -> valor.length
    }
    val lambdaEjecutar = myLambda("David")
    println(lambdaEjecutar)

    val saludos = listOf("Hola","Ciao")
    val longitudSaludos = saludos.map(myLambda)
    println(longitudSaludos)
}