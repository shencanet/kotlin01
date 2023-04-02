fun main(args: Array<String>){
    var largoValorInit = superFunction(valorInit = "Hola", block = {
        it.length
    })
    println(largoValorInit)

    val lambda = functionInception("David")
    println(lambda())
}

fun superFunction (valorInit: String, block : (String)->Int) :Int {
    return block(valorInit)
}

fun functionInception (nombre:String): () -> String {
    return{
        "Hola"+" "+nombre
    }
}

