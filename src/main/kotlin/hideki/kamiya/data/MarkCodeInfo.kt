package hideki.kamiya.data

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

@Serializable
data class MarkCodeInfo(
    @SerialName("mark_code_raw") val markCodeRaw: String? = null,
    val unknown: String? = null,
    @SerialName("ean_8") val ean8: String? = null,
    @SerialName("ean_13") val ean13: String? = null,
    @SerialName("itf_14") val itf14: String? = null,
    @SerialName("gs_10") val gs10: String? = null,
    @SerialName("gs_1m") val gs1m: String? = null,
    val short: String? = null,
    val fur: String? = null,
    @SerialName("egais_20") val egais20: String? = null,
    @SerialName("egais_30") val egais30: String? = null
)
