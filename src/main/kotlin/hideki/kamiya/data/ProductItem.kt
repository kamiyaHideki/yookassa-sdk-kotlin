package hideki.kamiya.data

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

@Serializable
data class ProductItem(
    val description: String,
    val amount: Amount,
    @SerialName ("vat_code") val vatCode: Int,
    val quantity: String,
    val measure: String? = null,
    val markQuantity: MarkQuantity? = null,
    @SerialName ("payment_subject") val paymentSubject: String? = null,
    @SerialName ("payment_mode") val paymentMode: String? = null,
    @SerialName ("country_of_origin_code") val countryOfOriginCode: String? = null,
    @SerialName ("customs_declaration_number") val customsDeclarationNumber: String? = null,
    val excise: String? = null,
    @SerialName ("product_code") val productCode: String? = null,
    @SerialName ("mark_code_info") val markCodeInfo: MarkCodeInfo? = null,
    @SerialName ("mark_mode") val markMode: String? = null,
    @SerialName ("payment_subject_industry_details") val paymentSubjectIndustryDetails: List<PaymentSubjectIndustryDetails>? = null
)
