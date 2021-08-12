package exSantander

/**
 * todo
 */
fun main(){

    val clienteA = Cliente(1234,"João","1234","12345678910")

    println("---------- Operando Conta Poupança ----------")
//    val contaA = Conta(200.0, clienteA)
//
    val clienteB = Cliente(1234,"João","1234","12345678910")
    val contaPoupanca = ContaPoupanca (100.0,clienteB,2.5)
    println ("Cliente: ${contaPoupanca.consultaCliente()}")
    println ("Saldo disponível: R$ ${contaPoupanca.consultaSaldo()}")
    println ("Total de juros recolhidos: R$ ${contaPoupanca.recolherJuros()}")
    println ("Saldo disponível: R$ ${contaPoupanca.consultaSaldo()}")
    contaPoupanca.sacarValor(150.0)
    contaPoupanca.depositarValor(100.00)
    contaPoupanca.sacarValor(150.0)
    contaPoupanca.depositarValor(-10.00)
    contaPoupanca.sacarValor(-50.0)

    println("---------- Operando Conta Corrente ----------")
    val cheque = Cheque(100.0,"748","11/08/2021")
    val contaCorrente = ContaCorrente (100.0,clienteA,100.0)

    println ("Cliente: ${contaCorrente.consultaCliente()}")
    println ("Saldo disponível: R$ ${contaCorrente.consultaSaldo()}")
    println ("Limite disponível para saque: R$ ${contaCorrente.consultaLimiteSaque()}")
    contaCorrente.sacarValor(150.0)
    contaCorrente.depositarValor(100.00)
    println ("Limite disponível para saque: R$ ${contaCorrente.consultaLimiteSaque()}")
    contaCorrente.sacarValor(150.0)
    contaCorrente.depositarValor(-10.00)
    contaCorrente.sacarValor(-50.0)
    contaCorrente.depositarValor(cheque)
    println ("Limite disponível para saque: R$ ${contaCorrente.consultaLimiteSaque()}")

}// fim função main