package chapter5.kotlin

import java.util.*

data class UserPreferences(
    var greeting: String,
    var locale: Locale,
    var currency: Currency
)