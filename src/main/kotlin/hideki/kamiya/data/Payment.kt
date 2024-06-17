package hideki.kamiya.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Payment(
    val id: String, // Todo("UUID")
    val status: Status,
    val amount: Amount,
    @SerialName("income_amount") val incomeAmount: Amount? = null,
    val description: String? = null,
    val recipient: Recipient,
    @SerialName("payment_method") val paymentMethod: PaymentMethod? = null,
    @SerialName("captured_at") val capturedAt: String? = null, // Todo("ISO 8601")
    @SerialName("created_at") val createdAt: String, // Todo("ISO 8601")
    @SerialName("expires_at") val expiresAt: String? = null, // Todo("ISO 8601")
    val confirmation: Confirmation? = null,
    val test: Boolean,
    @SerialName("refunded_amount") val refundedAmount: Amount? = null,
    val paid: Boolean,
    val refundable: Boolean,
    @SerialName("receipt_registration") val receiptRegistration: ReceiptRegistrationStatus? = null,
    val metadata: Map<String, String>? = null, // TODO("Create type for metadata")
    @SerialName("cancellation_details") val cancellationDetails: CancellationDetails? = null,
    @SerialName("authorization_details") val authorizationDetails: AuthorizationDetails? = null,
    val transfers: List<Transfer>? = null,
    val deal: Deal? = null,
    @SerialName("merchant_customer_id") val merchantCustomerId: String? = null
)
