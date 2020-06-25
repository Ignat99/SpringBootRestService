package springbootrestservice.rest.converters;

import springbootrestservice.converter.Converter;
import springbootrestservice.model.Account;
import springbootrestservice.rest.request.AccountRequest;

import lombok.NonNull;
import org.springframework.stereotype.Component;
import java.util.Currency;

/*                .currency(Currency.getInstance("USD"))
                .treasury(true)
*/


@Component
public class AccountRequestConverter implements Converter<AccountRequest, Account> {

    @Override
    public Account convert(final @NonNull AccountRequest from) {
        return Account.builder()
                .name(from.getName())
                .balance(from.getInitialBalance())
                .treasury(from.getTreasury())
                .build();
    }
}
