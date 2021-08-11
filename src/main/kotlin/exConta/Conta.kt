package exConta

class Conta(var numeroConta: Int, var saldoConta: Double, var titularConta: Cliente) {

    init {
        if (saldoConta < 0) saldoConta = 0.0
    }

    fun depositar(valor: Double){
       if (valor > 0){
           saldoConta += valor
           println ("Deposito realizado com sucesso! Saldo Disponível: R$ ${saldoConta}")
       } else {
           exibirMensagem()
           println("Valor não disponível para esta operação")
       }
    }

    fun sacar (valor: Double){
        if (valor <= saldoConta){
            saldoConta -= valor
            println ("Transação realizada! Saldo Disponível: R$ ${saldoConta}")
        } else {
            exibirMensagem()
            println("Saldo Insuficiente")
        }
    }

    private fun exibirMensagem(){
        print ("Operação não realizada. ")
    }

}