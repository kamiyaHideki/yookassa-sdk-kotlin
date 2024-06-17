package hideki.kamiya.data

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

@Serializable
data class ReceiptIndustryDetail(
    @SerialName("federal_id") val federalId: String,
    @SerialName("document_date") val documentDate: String,
    @SerialName("document_number") val documentNumber: String,
    val value: String
)
