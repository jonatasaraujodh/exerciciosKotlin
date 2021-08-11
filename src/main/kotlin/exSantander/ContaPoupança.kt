package exSantander

/**
 * todo
 */
class ContaPoupança (saldo: Double,
                     cliente: Cliente,
                     var taxaJuros: Double
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