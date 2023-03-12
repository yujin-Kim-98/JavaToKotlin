package chapter3

import java.math.BigDecimal
import java.util.*

class Money

private constructor(
    val amount: BigDecimal,
    val currency: Currency
) {
    override fun equals(
        o: Any?
    ): Boolean {
        if (this == o) return true
        if (o == null || javaClass != o.javaClass) return false
        val money = o as Money

        return amount == money.amount && currency == money.currency
    }

    override fun hashCode(): Int {
        return Objects.hash(amount, currency)
    }

    override fun toString(): String {
        return amount.toString() + " " + currency.currencyCode
    }

    fun add(
        that: Money
    ): Money {
        require(currency == that.currency) {
            "cannot add Money values of different currencise"
        }

        return Money(amount.add(that.amount), currency)
    }

    companion object {
        @JvmStatic
        fun of(
            amount: BigDecimal,
            currency: Currency
        ): Money {
            return Money(
                amount.setScale(currency.defaultFractionDigits),
                currency
            )
        }
    }
}