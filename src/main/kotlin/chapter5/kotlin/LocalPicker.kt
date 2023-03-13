package chapter5.kotlin

import java.util.*

data class LocalPicker(
    var locale: Locale
) {
    constructor() : this(
        Locale.KOREA
    )
}