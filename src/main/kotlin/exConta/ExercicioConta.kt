package exConta

/**
 * Arquivo para testes das classes Conta e Cliente, conforme descrito no item 5.
 * */

fun main (){

    println ("###### Teste Cliente A ######")
    val clienteA = Cliente("Jônatas", "Araujo")
    var contaA = Conta(1234,-10.0,clienteA)
    println("Operações do cliente: " + clienteA.nome + " " + clienteA.sobrenome)
    println ("Saldo Disponível: R$"+ contaA.saldoConta)
    contaA.sacar(100.0)
    contaA.depositar(50.0)
    contaA.sacar(10.0)

    println("")

    println ("###### Teste Cliente B ######")
    val clienteB = Cliente("Romário", "Ferreira")
    var contaB = Conta (9876,10.0,clienteB)
    println("Operações do cliente: " + clienteB.nome + " " +clienteB.sobrenome)
    println ("Saldo Disponível: R$"+ contaB.saldoConta)
    contaB.sacar(10.0)
    contaB.depositar(100.0)
    contaB.sacar(-10.0)
    contaB.sacar(10.0)
}