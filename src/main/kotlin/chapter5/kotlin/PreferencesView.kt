package chapter5.kotlin

class PreferencesView(
    private var preferences: UserPreferences
): View() {

    private val greetingPicker = GreetingPicker()
    private val localPicker = LocalPicker()
    private val currencyPicker = CurrencyPicker()

    fun showModal(
        preferences: UserPreferences
    ): UserPreferences {
        greetingPicker.greeting = preferences.greeting
        localPicker.locale = preferences.locale
        currencyPicker.currency = preferences.currency
        show()
        return UserPreferences(
            greeting = greetingPicker.greeting,
            locale = localPicker.locale,
            currency = currencyPicker.currency
        )
    }

}