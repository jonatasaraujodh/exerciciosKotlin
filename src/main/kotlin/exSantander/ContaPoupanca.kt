package exSantander

/**
 * todo
 */
class ContaPoupanca (saldo: Double,
                     cliente: Cliente,
                     var taxaJuros: Double = 0.0
                     ): Conta(saldo, cliente){

    /**
     * todo
     */
    fun recolherJuros(): Double{
        val rendimento = saldo * (taxaJuros / 100.0)
        saldo += rendimento
        return rendimento
    }//fim função recolherJuros

}//fim classe ContaPoupança