package hideki.kamiya.data

import kotlinx.serialization.Serializable


//Ставки НДС у товаров
//untaxed
//
//type
//string, required
//Значение — untaxed.
//Код способа расчета НДС.

@Serializable
data class VatData(
    val type: String,
    val amount: Amount? = null,
    val rate: String? = null
)
