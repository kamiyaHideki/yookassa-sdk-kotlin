package hideki.kamiya.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PaymentMethod(
    val type: String,
    val id: String,
    val saved: String,
    val title: String? = null,
    @SerialName("discount_amount") val discountAmount: Amount? = null,
    @SerialName("loan_option") val loanOption: String? = null
)
