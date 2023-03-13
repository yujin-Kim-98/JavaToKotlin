package chapter5.kotlin

data class GreetingPicker(
    var greeting: String
) {
    constructor() : this(
        ""
    )
}