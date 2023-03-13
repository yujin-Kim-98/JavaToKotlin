package chapter5.kotlin

import java.util.*

data class CurrencyPicker(
    var currency: Currency
) {
    constructor() : this(
        Currency.getInstance(Locale.KOREA)
    )
}