package interfaces.exImprimivel

class Documento(override val nome: String, override val tipoDocumento: String) : IImprimivel {

    override fun imprimir() {
        println("Eu sou um $tipoDocumento, $nome")
    }
}