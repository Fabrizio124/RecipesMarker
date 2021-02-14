package model

class Receta(var name: String, var ingredientes : ArrayList<Ingrediente>){

    fun mostrarIngredientes(){
        for (ingrediente in ingredientes)
            println("${ingrediente.alimento} - ${ingrediente.cantidad} ${ingrediente.unidadDeMedia}")
    }

}