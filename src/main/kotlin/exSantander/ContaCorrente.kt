package exSantander

/**
 * todo
 */
class ContaCorrente(saldo: Double, cliente: Cliente,
                    var limiteChequeEspecial: Double): Conta(saldo, cliente) {

    /**
     * todo
     */
    override fun sacarValor(valor: Double) {

        if(valor <= saldo){
            saldo -= valor
            println ("Saque realizado com sucesso. Saldo Disponível: R$ $saldo")
        } else if (valor <= saldo + limiteChequeEspecial ){
            limiteChequeEspecial -= (valor - saldo)
            saldo = 0.0
            println ("Saque realizado com sucesso. Saldo Disponível: " +
                    "R$ $saldo Limite Disponível: R$ $limiteChequeEspecial")
        } else{
            println ("Operação não realizada. Motivo: limite insuficiente")
        }
    }// fim função sacarValor

    /**
     * todo
     */
    fun depositarValor(cheque: Cheque) {
        depositarValor(cheque.valor)
    }// fim função depositaValor

    fun consultaLimiteSaque(): Double {
        return saldo + limiteChequeEspecial
    }

}// fim de classe