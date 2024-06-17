package hideki.kamiya.data

import kotlinx.serialization.Serializable

@Serializable
data class Settlement(
    val type: String,
    val amount: Amount
)
