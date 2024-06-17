package hideki.kamiya.data

import kotlinx.serialization.Serializable

@Serializable
data class CardProduct(
    val code: String,
    val name: String? = null,
)
