package exSantander

/**
 * todo
 */
class ContaPoupanca (saldo2: Double,
                     cliente2: Cliente,
                     var taxaJuros: Double = 0.0
                     ): Conta(saldo2,cliente2){

    /**
     * todo
     */
    fun recolherJuros(): Double{
        val rendimento = saldo * (taxaJuros / 100.0)
        saldo += rendimento
        return rendimento
    }//fim função recolherJuros

}//fim classe ContaPoupança