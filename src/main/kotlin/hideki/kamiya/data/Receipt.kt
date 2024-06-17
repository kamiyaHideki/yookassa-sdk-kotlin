package hideki.kamiya.data

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

@Serializable
data class Receipt(
    val customer: Customer? = null,
    val items: List<ProductItem>,
    @SerialName("tax_system_code") val taxSystemCode: Int? = null,
    @SerialName("receipt_industry_details") val receiptIndustryDetails: List<ReceiptIndustryDetail>? = null,
    @SerialName("receipt_operational_details") val receiptOperationalDetails: ReceiptOperationalDetails? = null
)
