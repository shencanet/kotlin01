/*Una Funcion Lamdba es un  literal de funcion que puede ser usado como expresion
Esto qiuere decir que una Funcion que no esta ligada a un identificador y que puedes usar como valor
fun sumarDos(s_ Int) = s + 2
reescrita com lamdba
{s:Int -> s + 2}
val
*/



fun main(args:Array<String>){
    val myLambda : (String) -> Int = {
        // es el parametro que estamos pasando
        valor -> valor.length
    }
    val lambdaEjecutar = myLambda("David")
    println(lambdaEjecutar)

    val saludos = listOf("Hola","Ciao")
    val longitudSaludos = saludos.map(myLambda)
    println(longitudSaludos)
}

//Una lambda con tipos explícitos en todas partes. La lambda es la parte entre llaves, que se asigna a una variable de tipo (String) -> String (un tipo de función)
val upperCase1: (String) ->String={str: String -> str.uppercase()}

//Inferencia de tipo dentro de lambda: el tipo del parámetro lambda se infiere del tipo de variable a la que está asignado.
    val upperCase2: (String) -> String = {str -> str.uppercase()}

//Inferencia de tipo fuera de lambda: el tipo de variable se infiere del tipo del parámetro lambda y el valor de retorno.
    val upperCase3 = {str: String -> str.uppercase()}

//No puede hacer ambas cosas a la vez, el compilador no tiene la posibilidad de inferir el tipo de esa manera.
    //val upperCase4: {str -> str.uppercase()}



//Para lambdas con un solo parámetro, no tiene que nombrarlo explícitamente. En su lugar, puede utilizar la variable it implícita. Esto es especialmente útil cuando se puede inferir el tipo (que suele ser el caso).
    val upperCase5: (String) -> String = {it.uppercase()}

//Si su lambda consta de una única llamada de función, puede usar punteros de función (: :).
    val upperCase6: (String) -> String = String::uppercase

    println(upperCase1("hello"))
    println(upperCase2("hello"))
    println(upperCase3("hello"))
    println(upperCase5("hello"))
    println(upperCase6("hello"))