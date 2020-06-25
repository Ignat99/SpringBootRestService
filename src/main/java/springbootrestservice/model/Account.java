package springbootrestservice.model;

import springbootrestservice.exceptions.NegativeAccountBalanceException;
import lombok.*;
import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;
import java.math.BigDecimal;
import java.util.Currency;

import static javax.persistence.GenerationType.AUTO;


@Entity
@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Setter(value = AccessLevel.PACKAGE)
@Getter
@EqualsAndHashCode(callSuper = true)
public class Account extends BaseAuditEntity {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    private String name;

    private BigDecimal balance;

    private Currency currency;
    public Currency getCurrency() {
        return currency;
    }
    public void setCurrency(Currency currency) {
            this.currency = currency;
    }

    private boolean treasury;
    public boolean getTreasury() {
            return treasury;
    }
    public void setTreasury(boolean treasury) {
            this.treasury = treasury;
    }

    @Version
    private Integer version;

    public void giveMoney(final @NonNull BigDecimal amount) {
        if (this.treasury == false) {
            if (amount.compareTo(BigDecimal.ZERO) < 0) {
                throw new IllegalArgumentException("Amount must be a positive and greater than zero BigDecimal");
            }
        }

        final BigDecimal newBalance = balance.subtract(amount);

        if (this.treasury == false) {
            if (newBalance.compareTo(BigDecimal.ZERO) < 0) {
                throw new NegativeAccountBalanceException();
            }
        }

        this.balance = newBalance;
    }

    public void receiveMoney(final @NonNull BigDecimal amount) {
        if (this.treasury == false) {
            if (amount.compareTo(BigDecimal.ZERO) < 0) {
                throw new IllegalArgumentException("Amount must be a positive and greater than zero BigDecimal");
            }
        }
        this.balance = this.balance.add(amount);
    }

}
