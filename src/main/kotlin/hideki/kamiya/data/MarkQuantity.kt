package hideki.kamiya.data

import kotlinx.serialization.Serializable

@Serializable
data class MarkQuantity(
    val numerator: Int,
    val denominator: Int
)
