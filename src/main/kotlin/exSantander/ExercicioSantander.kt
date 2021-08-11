package exSantander

/**
 * todo
 */
fun main(){

    val clienteA = Cliente(1234,"João","1234","12345678910")


    println("---------- Operando Conta Poupança ----------")
    val contaPoupança = ContaPoupança (100.0,clienteA,2.5)
    println ("Cliente: ${contaPoupança.consultaCliente()}")
    println ("Saldo disponível: R$ ${contaPoupança.consultaSaldo()}")
    println ("Total de juros recolhidos: R$ ${contaPoupança.recolherJuros()}")
    println ("Saldo disponível: R$ ${contaPoupança.consultaSaldo()}")
    contaPoupança.sacarValor(150.0)
    contaPoupança.depositarValor(100.00)
    contaPoupança.sacarValor(150.0)
    contaPoupança.depositarValor(-10.00)
    contaPoupança.sacarValor(-50.0)

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
    contaPoupança.sacarValor(-50.0)
    contaCorrente.depositarValor(cheque)
    println ("Limite disponível para saque: R$ ${contaCorrente.consultaLimiteSaque()}")









}