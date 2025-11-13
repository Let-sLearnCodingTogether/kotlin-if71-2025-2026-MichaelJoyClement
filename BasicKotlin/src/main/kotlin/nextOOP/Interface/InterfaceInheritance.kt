package nextOOP.Interface

interface PaymentMethod{
    fun pay()
}

interface Refund: PaymentMethod{
    fun refund()
}

class BankAccount(): Refund{
    override fun refund() {
        println("Refund Successfull!")
    }

    override fun pay() {
        println("Payment Successfull!")
    }
}

fun main() {
    val bank = BankAccount()

    bank.pay()
    bank.refund()
}