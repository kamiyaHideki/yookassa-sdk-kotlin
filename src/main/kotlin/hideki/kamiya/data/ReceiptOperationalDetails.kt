package hideki.kamiya.data

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

@Serializable
data class ReceiptOperationalDetails(
    @SerialName("operation_id") val operationId: Int,
    val value: String,
    @SerialName("created_at") val createdAt: String
)
