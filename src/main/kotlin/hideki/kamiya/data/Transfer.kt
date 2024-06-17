package hideki.kamiya.data

import kotlinx.serialization.SerialInfo
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Transfer(
    @SerialName("account_id") val accountId: String,
    val amount: Amount,
    val status: Status,
    @SerialName("platform_fee_amount") val platformFeeAmount: Amount? = null,
    val description: String? = null,
    val metadata: Map<String, String> // TODO("Create type for metadata")
)
