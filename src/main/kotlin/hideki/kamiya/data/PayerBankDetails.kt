package hideki.kamiya.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PayerBankDetails(
    @SerialName("full_name") val fullName: String,
    @SerialName("short_name") val shortName: String,
    val address: String,
    val inn: String,
    @SerialName("bank_name") val bankName: String,
    @SerialName("bank_bik") val bankBik: String,
    val account: String,
    val kpp: String? = null,
)
