package chapter5.java;

import java.util.Currency;
import java.util.Locale;

/**
 * 5.4 빈을 값으로 리팩터링하기
 */

public class UserPreferences {

    private String greeting;
    private Locale locale;
    private Currency currency;

    public UserPreferences() {
        this("Hello", Locale.UK, Currency.getInstance(Locale.UK));
    }

    public UserPreferences(String greeting, Locale locale, Currency currency) {
        this.greeting = greeting;
        this.locale = locale;
        this.currency = currency;
    }

    public String getGreeting() {
        return greeting;
    }

    public Locale getLocale() {
        return locale;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

}
