package springbootrestservice.rest.converters;

import springbootrestservice.converter.Converter;
import springbootrestservice.model.Account;
import springbootrestservice.rest.response.AccountResponse;

import lombok.NonNull;
import org.springframework.stereotype.Component;

import java.util.Currency;



@Component
public class AccountConverter implements Converter<Account, AccountResponse> {

    @Override
    public AccountResponse convert(final @NonNull Account from) {
        return AccountResponse.builder()
                .number(from.getId())
                .name(from.getName())
                .currentBalance(from.getBalance())
                .currency(from.getCurrency())
                .treasury(from.getTreasury())
                .build();
    }

}
