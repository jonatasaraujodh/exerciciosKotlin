package interfaces.exImprimivel

class Foto(override val nome: String, override val tipoDocumento: String) : IImprimivel {

    override fun imprimir() {
        println("Eu sou uma  $tipoDocumento, $nome")
    }
}