package hideki.kamiya.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AuthorizationDetails(
    val rrn: String? = null,
    @SerialName("auth_code") val code: String? = null,
    @SerialName("three_d_secure") val threeDSecure: ThreeDSecure
)
