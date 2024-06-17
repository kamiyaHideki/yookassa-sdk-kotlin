package hideki.kamiya.requests

import hideki.kamiya.data.*
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

// payment_token
//string, optional
//Одноразовый токен для проведения оплаты, сформированный с помощью Checkout.js  или мобильного SDK .
//payment_method_id
//string, optional
//Идентификатор сохраненного способа оплаты .
//payment_method_data
//object, optional
//Данные для оплаты конкретным способом  (payment_method). Вы можете не передавать этот объект в запросе. В этом случае пользователь будет выбирать способ оплаты на стороне ЮKassa.
//sber_loan
//
//confirmation
//object, optional
//Данные, необходимые для инициирования выбранного сценария подтверждения платежа пользователем. Подробнее о сценариях подтверждения
//embedded
//
//save_payment_method
//boolean, optional
//Сохранение платежных данных (с их помощью можно проводить повторные безакцептные списания ). Значение true инициирует создание многоразового payment_method.
//capture
//boolean, optional
//Автоматический прием  поступившего платежа.
//client_ip
//string, optional
//IPv4 или IPv6-адрес пользователя. Если не указан, используется IP-адрес TCP-подключения.
//metadata
//object, optional
//Любые дополнительные данные, которые нужны вам для работы (например, ваш внутренний идентификатор заказа). Передаются в виде набора пар «ключ-значение» и возвращаются в ответе от ЮKassa. Ограничения: максимум 16 ключей, имя ключа не больше 32 символов, значение ключа не больше 512 символов, тип данных — строка в формате UTF-8.
//airline
//object, optional
//Объект с данными для продажи авиабилетов. Используется только для платежей банковской картой.
//transfers
//array, optional
//Данные о распределении денег — сколько и в какой магазин нужно перевести. Необходимо передавать, если вы используете Сплитование платежей .
//deal
//object, optional
//Данные о сделке, в составе которой проходит платеж. Необходимо передавать, если вы проводите Безопасную сделку .
//fraud_data
//object, optional
//Информация для проверки операции на мошенничество.
//merchant_customer_id
//string, optional
//Идентификатор покупателя в вашей системе, например электронная почта или номер телефона. Не более 200 символов. Присутствует, если вы хотите запомнить банковскую карту и отобразить ее при повторном платеже в виджете ЮKassa .
@Serializable
data class CreatePayment(
    val amount: Amount,
    val description: String? = null,
    val receipt: Receipt? = null,
    val recipient: Recipient? = null,
    @SerialName("payment_token") val paymentToken: String? = null,
    @SerialName("payment_method_id") val paymentMethodId: String? = null,
    @SerialName("payment_method_data") val paymentMethodData: PaymentMethodData? = null,
    @SerialName("confirmation") val confirmation: CreatePaymentConfirmation? = null,
    // TODO: add all fields
)
