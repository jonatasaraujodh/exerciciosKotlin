package exCaixaSupermercado

class Caixa() {

    inline fun fechamentoDaconta(
        cabecalhoDoComprovante: () -> Unit,
        dataDaCompra: () -> String,
        listaDeProdutos: ArrayList<Produto>,
        imprimeListaDeCompras: (ArrayList<Produto>) -> Unit,
        adicionaRodaPe: (ArrayList<Produto>) -> Double
    ) {
        cabecalhoDoComprovante.invoke()
        println(dataDaCompra.invoke())
        imprimeListaDeCompras.invoke(listaDeProdutos)
        println("R$${adicionaRodaPe.invoke(listaDeProdutos)}")
    }
}