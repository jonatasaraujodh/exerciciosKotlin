package exSantander

/**
 * todo
 */
open class Conta (var saldo: Double = 0.0,
                  var cliente: Cliente){

    /**
     * todo
     */
    open fun depositarValor(valor: Double): Unit{
        if (valor < 0.0){
            println ("Operação não realizada. Motivo: valor inválido")
        } else{
            saldo += valor
            println ("Depósito realizado com sucesso. Saldo Disponível: R$ $saldo")

        }
    }// fim função depositaValor

    /**
     * todo
     */
    open fun sacarValor(valor: Double):Unit{

        if (valor <= 0.0){
            println ("Operação não realizada. Motivo: valor inválido")
        } else if (valor <= saldo){
            saldo -= valor
            println ("Saque realizado com sucesso. Saldo Disponível: R$ $saldo")
        } else{
            println ("Operação não realizada. Motivo: saldo insuficiente")
        }
    }// fim função sacaValor

    /**
     * todo
     */
    open fun consultaSaldo(): Double{
        return saldo
    }// fim função consultaSaldo

    /**
     * todo
     */
    fun consultaCliente(): String{
        val cliente = this.cliente.codigo.toString() + " " + this.cliente.nome
        return cliente
    }// fim função consultaCliente

}//fim classe Conta