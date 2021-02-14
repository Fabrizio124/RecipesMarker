package model

class Categoria(){
    var listaAgua = ArrayList<Ingrediente>()
    var listaLeche = ArrayList<Ingrediente>()
    var listaCarne = ArrayList<Ingrediente>()
    var listaVerduras = ArrayList<Ingrediente>()
    var listaFrutas = ArrayList<Ingrediente>()
    var listaCereal = ArrayList<Ingrediente>()
    var listaHuevos = ArrayList<Ingrediente>()
    var listaAceites = ArrayList<Ingrediente>()

    init {
        listaAgua.add(Ingrediente("Agua mineral", "ml"))
        listaAgua.add(Ingrediente("Agua con gas", "ml"))
        listaAgua.add(Ingrediente("Agua fría", "ml"))
        listaAgua.add(Ingrediente("Agua caliente", "ml"))
        listaAgua.add(Ingrediente("Agua a temperatura ambiente", "ml"))

        listaLeche.add(Ingrediente("Leche","ml"))
        listaLeche.add(Ingrediente("Yogurt", "ml"))
        listaLeche.add(Ingrediente("Mantequilla", "gr"))
        listaLeche.add(Ingrediente("Queso", "gr"))

        listaCarne.add(Ingrediente("Carne bóvida","gr"))
        listaCarne.add(Ingrediente("Carne porcina", "gr"))
        listaCarne.add(Ingrediente("Carne ovina", "gr"))
        listaCarne.add(Ingrediente("Carne de pollo", "gr"))
        listaCarne.add(Ingrediente("Carne de pescado", "gr"))

        listaVerduras.add(Ingrediente("Zanahoria", "gr"))
        listaVerduras.add(Ingrediente("Rábano", "gr"))
        listaVerduras.add(Ingrediente("Puerro", "gr"))
        listaVerduras.add(Ingrediente("Cebolla", "gr"))
        listaVerduras.add(Ingrediente("Coliflor", "gr"))
        listaVerduras.add(Ingrediente("Zapallo", "gr"))
        listaVerduras.add(Ingrediente("Brócoli", "gr"))
        listaVerduras.add(Ingrediente("Arvejas", "gr"))
        listaVerduras.add(Ingrediente("Berenjena", "gr"))

        listaFrutas.add(Ingrediente("Fresa", "unidades"))
        listaFrutas.add(Ingrediente("Uvas", "unidades"))
        listaFrutas.add(Ingrediente("Plátano", "unidades"))
        listaFrutas.add(Ingrediente("Manzana", "unidades"))
        listaFrutas.add(Ingrediente("Naranja", "unidades"))
        listaFrutas.add(Ingrediente("Pera", "unidades"))
        listaFrutas.add(Ingrediente("Cereza", "unidades"))

        listaCereal.add(Ingrediente("Avena", "gr"))
        listaCereal.add(Ingrediente("Trigo", "gr"))
        listaCereal.add(Ingrediente("Arroz", "gr"))
        listaCereal.add(Ingrediente("Maíz", "gr"))

        listaHuevos.add(Ingrediente("Huevos de codorniz", "unidades"))
        listaHuevos.add(Ingrediente("Huevos de pato", "unidades"))
        listaHuevos.add(Ingrediente("Huevos de Ñandú", "unidades"))
        listaHuevos.add(Ingrediente("Huevos de Gallina", "unidades"))
        listaHuevos.add(Ingrediente("Huevos de Pavo", "unidades"))

        listaAceites.add(Ingrediente("Aceite de maíz", "ml"))
        listaAceites.add(Ingrediente("Aceite de soja", "ml"))
        listaAceites.add(Ingrediente("Aceite de oliva", "ml"))
        listaAceites.add(Ingrediente("Aceite de girasol", "ml"))
        listaAceites.add(Ingrediente("Aceite de sésamo", "ml"))
    }

    fun mostrasListaAgua(){
        println("Lista Agua")
        for((index,ingrediente) in listaAgua.withIndex()){
            println("${index + 1}. ${ingrediente.alimento} Unidad de medida: ${ingrediente.unidadDeMedia}")
        }
    }

    fun mostrasListaLeche(){
        println("Lista Leche")
        for((index,ingrediente) in listaLeche.withIndex()){
            println("${index + 1}. ${ingrediente.alimento} Unidad de medida: ${ingrediente.unidadDeMedia}")
        }
    }

    fun mostrasListaCarne(){
        println("Lista Carne")
        for((index,ingrediente) in listaCarne.withIndex()){
            println("${index + 1}. ${ingrediente.alimento} Unidad de medida: ${ingrediente.unidadDeMedia}")
        }
    }

    fun mostrasListaVerduras(){
        println("Lista Verduras")
        for((index,ingrediente) in listaVerduras.withIndex()){
            println("${index + 1}. ${ingrediente.alimento} Unidad de medida: ${ingrediente.unidadDeMedia}")
        }
    }

    fun mostrasListaFrutas(){
        println("Lista Frutas")
        for((index,ingrediente) in listaFrutas.withIndex()){
            println("${index + 1}. ${ingrediente.alimento} Unidad de medida: ${ingrediente.unidadDeMedia}")
        }
    }

    fun mostrasListaCereal(){
        println("Lista Cereal")
        for((index,ingrediente) in listaCereal.withIndex()){
            println("${index + 1}. ${ingrediente.alimento} Unidad de medida: ${ingrediente.unidadDeMedia}")
        }
    }

    fun mostrasListaHuevos(){
        println("Lista Huevos")
        for((index,ingrediente) in listaHuevos.withIndex()){
            println("${index + 1}. ${ingrediente.alimento} Unidad de medida: ${ingrediente.unidadDeMedia}")
        }
    }

    fun mostrasListaAceites(){
        println("Lista Aceites")
        for((index,ingrediente) in listaAceites.withIndex()){
            println("${index + 1}. ${ingrediente.alimento} Unidad de medida: ${ingrediente.unidadDeMedia}")
        }
    }
}




























