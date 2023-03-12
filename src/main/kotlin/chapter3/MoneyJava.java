/**
 * 3.2 데이터 클래스의 한계
 */

package chapter3;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Objects;

public class MoneyJava {

    private final BigDecimal amount;
    private final Currency currency;

    private MoneyJava(BigDecimal amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static MoneyJava of(BigDecimal amount, Currency currency) {
        return new MoneyJava(
                amount.setScale(currency.getDefaultFractionDigits()),
                currency
        );
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MoneyJava money = (MoneyJava) o;

        return amount.equals(money.amount) && currency.equals(money.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency);
    }

    @Override
    public String toString() {
        return amount.toString() + " " + currency.getCurrencyCode();
    }

    public MoneyJava add(MoneyJava that) {
        if (!this.currency.equals(that.currency)) {
            throw new IllegalArgumentException(
                    "cannot add Money values of different currencies"
            );
        }
        return new MoneyJava(this.amount.add(that.amount), this.currency);
    }

}
