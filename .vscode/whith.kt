fun main(args: Array<String>) {
	val colores = listOf("Azul", "Amarillo", "Rojo")

	// Tenemoes accedo directo al scope de colores con with, así ya no necesitamos escribir el nombre de la variable
	with(colores){
		println("Nuestros colores son $this")
		println("Esta lista tiene una cantidad de colores de $size")
		
		for (index in colores.indices) {
			var tenporal = colores[index]
    		println("color $index es $tenporal")
}
        
	}}
