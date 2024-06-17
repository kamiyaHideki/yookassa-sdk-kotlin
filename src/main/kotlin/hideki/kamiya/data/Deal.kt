package hideki.kamiya.data

import kotlinx.serialization.Serializable

@Serializable
data class Deal(
    val id: String,
    val settlements: List<Settlement>
)
