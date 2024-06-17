package hideki.kamiya.data

import kotlinx.serialization.Serializable


enum class ReceiptRegistrationStatus(val value: String) {
    PENDING("pending"),
    SUCCEEDED("succeeded"),
    CANCELED("canceled")
}
