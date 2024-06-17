package hideki.kamiya.data

enum class PaymentStatus(val value: String) {
    PENDING("pending"),
    WAITING_FOR_CAPTURE("waiting_for_capture"),
    SUCCEEDED("succeeded"),
    CANCELED("canceled")
}