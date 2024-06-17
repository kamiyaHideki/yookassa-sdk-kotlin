package hideki.kamiya.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PaymentMethod(
    val type: String,
    val id: String,
    val saved: String,
    val title: String? = null,
    val login: String? = null,
    val card: Card? = null,
    val phone: String? = null,
    @SerialName("payer_bank_details") val payerBankDetails: PayerBankDetails? = null,
    @SerialName("payment_purpose") val paymentPurpose: String? = null,
    @SerialName("vat_data") val vatData: VatData? = null,
    @SerialName("sbp_operation_id") val sbpOperationId: String? = null,
    @SerialName("discount_amount") val discountAmount: Amount? = null,
    @SerialName("loan_option") val loanOption: String? = null,
    @SerialName("account_number") val accountNumber: String? = null,
)
