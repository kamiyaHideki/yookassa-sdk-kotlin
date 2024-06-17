package hideki.kamiya.data

import kotlinx.serialization.Serializable

@Serializable
data class CancellationDetails(
    val party: String,
    val reason: String
)
