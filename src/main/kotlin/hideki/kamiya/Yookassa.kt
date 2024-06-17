package hideki.kamiya

import hideki.kamiya.data.Amount
import hideki.kamiya.data.Confirmation
import hideki.kamiya.data.Payment
import hideki.kamiya.data.PaymentMethod

class Yookassa(
    private val shopId: Int,
    private val secretToken: String
) {

    suspend fun createPayment(
        amount: Amount,
        confirmation: Confirmation,
        capture: Boolean = false,
        paymentMethod: PaymentMethod? = null,
        metadata: Map<String, String>? = null
    ): Payment {

    }

    suspend fun getPayment(paymentId: String): Payment {

    }

    suspend fun getPayments(): List<Payment> {

    }

    suspend fun createRefund(paymentId: String, amount: Amount) {

    }

    suspend fun getRefund(refundId: String) {

    }

    suspend fun getRefunds() {

    }

    suspend fun createWebHook() {

    }

    suspend fun deleteWebHook() {

    }

    suspend fun getWebHooks() {

    }

    private suspend fun parse() {

    }
}