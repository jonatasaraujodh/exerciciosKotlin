package exConta

fun main (){

    val clienteA = Cliente("Jônatas", "Araujo")
    val clienteB = Cliente("Romário", "Ferreira")

    var contaA = Conta(1234,0.0,clienteA)
    var contaB = Conta (9876,0.0,clienteB)

    println("Operações do cliente: " + clienteA.nome + " " + clienteA.sobrenome)
    println ("Saldo Disponível: R$"+ contaA.saldoConta)
    contaA.sacar(100.0)
    contaA.depositar(50.0)
    contaA.sacar(10.0)

    println("Operações do cliente: " + clienteB.nome + " " +clienteB.sobrenome)
    println ("Saldo Disponível: R$"+ contaB.saldoConta)
    contaB.sacar(10.0)
    contaA.depositar(100.0)
    contaA.sacar(-10.0)
    contaB.sacar(10.0)

}