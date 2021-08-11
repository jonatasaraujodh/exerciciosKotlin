package exConta
/**
 * Classe Conta, contendo atributos, conforme descrito no item 2.
 */
class Conta(var numeroConta: Int, var saldoConta: Double, var titularConta: Cliente) {

/** Bloco de inicialização, verificando valor inicial do saldo da conta.
 *  Se for passado algum valor negativo, a conta é criada com saldo = 0.
 */
    init {
        if (saldoConta < 0) saldoConta = 0.0
    }

    /** Função depositar (item 3), cujo objetivo é o de acrescentar o valor passado como
     * parâmetro ao atributo "saldoConta" e apresentando o novo saldo ao usuário.
     * Caso seja passado algum valor negativo, a operação não é realizada, sendo
     * exibida mensagem de indisponibilidade.
     */
    fun depositar(valor: Double){
       if (valor > 0){
           saldoConta += valor
           println ("Deposito realizado com sucesso! Saldo Disponível: R$ ${saldoConta}")
       } else {
           exibirMensagem()
           println("Valor não disponível para esta operação")
       }
    }

    /** Função sacar (item 4), cujo objetivo é o de subtrair o valor passado como
     * parâmetro ao atributo "saldoConta" e apresentando o novo saldo ao usuário.
     * Se o valor passado como parâmetro for maior que o saldo atual, é apresentada
     * mensagen de indisponibilidade de saldo.
     * Caso seja passado algum valor negativo, a operação não é realizada, sendo
     * exibida mensagem de indisponibilidade.
     */
    fun sacar (valor: Double){
        if (valor <= saldoConta && valor >0){
            saldoConta -= valor
            println ("Saque realizada! Saldo Disponível: R$ ${saldoConta}")
        } else if ( valor < 0) {
            exibirMensagem()
            println("Valor não disponível para esta operação")
        } else{
            exibirMensagem()
            println("Saldo Insuficiente")
        }
    }

    /**
     * Função privada cujo objetivo é o de exibir mensagem padrão quando uma operação
     * não é realizada.
     */
    private fun exibirMensagem(){
        print ("Operação não realizada. ")
    }
}// fim de classe Conta