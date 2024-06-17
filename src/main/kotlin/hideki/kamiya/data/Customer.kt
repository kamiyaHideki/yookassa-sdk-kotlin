package hideki.kamiya.data

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

@Serializable
data class Customer(
    @SerialName("full_name") val fullName: String? = null,
    val inn: String? = null,
    val email: String? = null,
    val phone: String? = null
)
