package springbootrestservice.rest.request;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.math.BigDecimal;
import java.util.Currency;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Validated
@NotNull
@ApiModel(value = "accountRequest", description = "The account request needs a name and a initialBalance value.")
public class AccountRequest {

    @NotNull
    @Length(min = 3, max = 20)
    private String name;

    @PositiveOrZero
    private BigDecimal initialBalance;

//    @NotNull
//    @Length(min = 2, max = 10)
//    private Currency currency;

    private boolean treasury;
    public boolean getTreasury() {
            return treasury;
    }
    public void setTreasury(boolean treasury) {
            this.treasury = treasury;
    }

}
