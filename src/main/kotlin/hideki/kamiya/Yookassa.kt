package hideki.kamiya

import hideki.kamiya.data.Amount
import hideki.kamiya.data.Confirmation
import hideki.kamiya.data.Payment
import hideki.kamiya.data.PaymentMethod
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.okhttp.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

class Yookassa(
    private val shopId: Int,
    private val secretToken: String
) {

    private val httpClient = HttpClient(OkHttp) {
        install(ContentNegotiation) {
            json(
                Json {
                    prettyPrint = true
                    isLenient = true
                }
            )
        }
        defaultRequest {
            url("https://api.yookassa.ru/v3")
        }
    }

    suspend fun createPayment(
        amount: Amount,
        confirmation: Confirmation,
        capture: Boolean = false,
        paymentMethod: PaymentMethod? = null,
        metadata: Map<String, String>? = null
    ): Payment {
        this.httpClient.post {
            url("/payments")
        }
    }

    suspend fun getPayment(paymentId: String): Payment {
        this.httpClient.get("/payments/$paymentId")
    }

    suspend fun getPayments(): List<Payment> {
        this.httpClient.get("/payments")
    }

    suspend fun capturePayment(paymentId: String) {
        this.httpClient.post {
            url("/payments/$paymentId/capture")
        }
    }

    suspend fun cancelPayment(paymentId: String) {
        this.httpClient.post {
            url("/payments/$paymentId/cancel")
        }
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