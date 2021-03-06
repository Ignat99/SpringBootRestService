package springbootrestservice.rest.request;

import springbootrestservice.rest.validators.NotSameAccount;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@NotNull
@Validated
@NotSameAccount
@ApiModel(value = "transferRequest",
        description = "Represents the source account, the target account and the desired transfer amount.")

public class TransferRequest {

    @NotNull
    @Positive
    private Long sourceAccountNumber;

    @NotNull
    @Positive
    private Long targetAccountNumber;

    @NotNull
    @Positive
    private BigDecimal amount;

}