package springbootrestservice.rest.converters;

import springbootrestservice.converter.Converter;
import springbootrestservice.model.Account;
import springbootrestservice.rest.request.AccountRequest;

import lombok.NonNull;
import org.springframework.stereotype.Component;

@Component
public class AccountRequestConverter implements Converter<AccountRequest, Account> {

    @Override
    public Account convert(final @NonNull AccountRequest from) {
        return Account.builder()
                .name(from.getName())
                .balance(from.getInitialBalance())
                .build();
    }
}
