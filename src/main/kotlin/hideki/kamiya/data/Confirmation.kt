package hideki.kamiya.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Confirmation(
    val type: String,
    @SerialName("confirmation_token") val token: String? = null,
    @SerialName("return_url") val url: String? = null
)
