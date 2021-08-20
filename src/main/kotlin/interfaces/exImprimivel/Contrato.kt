package interfaces.exImprimivel

class Contrato(override val nome: String, override val tipoDocumento: String) : IImprimivel {

    override fun imprimir() {
        println("Eu sou um $tipoDocumento, $nome")
    }
}