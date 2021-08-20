package interfaces.exImprimivel

fun main() {
    val foto = Foto("selfie", "Foto")
    val contrato = Contrato("contrato de trabalho", "Contrato")
    val documento = Documento("RG", "Documento")
    val impressora = Impressora()
    impressora.addImprimivel(foto)
    impressora.addImprimivel(contrato)
    impressora.addImprimivel(documento)
    impressora.imprimirLista()
}