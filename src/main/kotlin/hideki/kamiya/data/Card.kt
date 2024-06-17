package hideki.kamiya.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Card(
    val first6: String,
    val last4: String,
    @SerialName("expiry_month") val expiryMonth: String,
    @SerialName("expiry_year") val expiryYear: String,
    @SerialName("card_type") val cardType: String,
    @SerialName("card_product") val cardProduct: CardProduct? = null,
    @SerialName("issuer_country") val issuerCountry: String? = null,
    @SerialName("issuer_name") val issuerName: String? = null,
    @SerialName("source") val source: String? = null,
)
