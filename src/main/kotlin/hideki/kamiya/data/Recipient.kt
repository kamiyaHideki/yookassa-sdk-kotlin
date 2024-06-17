package hideki.kamiya.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Recipient(
    @SerialName("account_id") val accountId: String,
    @SerialName("gateway_id") val gatewayId: String
)