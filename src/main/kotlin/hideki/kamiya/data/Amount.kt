package hideki.kamiya.data

import kotlinx.serialization.Serializable

@Serializable
data class Amount(
    val value: String,
    val currency: String
)
