package exCaixaSupermercado

fun main() {

    val sabao = Produto("sabao", 2.40)
    val arroz = Produto("arroz", 10.00)
    val pastaDeDente = Produto("pasta de dente", 5.00)
    val nutelinha = Produto("nutela", 100.00)
    val brejinha = Produto("brejinha", 5.00)

    val carrinhoDeCompras = CarrinhoDeCompras()
    carrinhoDeCompras.addProduto(sabao)
    carrinhoDeCompras.addProduto(arroz)
    carrinhoDeCompras.addProduto(pastaDeDente)
    carrinhoDeCompras.addProduto(nutelinha)
    carrinhoDeCompras.addProduto(brejinha)

    val caixa = Caixa()
    caixa.fechamentoDaconta(cabecalhoDoComprovante = { imprimeCabecalhoNotaFiscal },
        dataDaCompra = { retornaDataAtualDaCompra() },
        listaDeProdutos = carrinhoDeCompras.listaDeProdutos,
        imprimeListaDeCompras = { imprimeListaDeProdutos(carrinhoDeCompras.listaDeProdutos) },
        adicionaRodaPe = { calculaTotalDeProdutos(carrinhoDeCompras.listaDeProdutos) })

}