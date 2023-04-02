
fun main(args: Array<String>) {
    val largodelValorInicial = superFuncion(valorInicial = "Hola", block = { valor ->
        valor.length})

     println(largodelValorInicial)
    }


fun superFuncion(valorInicial: String, block : (String) -> Int) : Int {
    return block(valorInicial)
}

