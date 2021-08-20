package interfaces.exImprimivel

interface IImprimivel {

    val nome: String
    val tipoDocumento: String

    fun imprimir() {
        println("imprimindo interface padrão")
    }
}