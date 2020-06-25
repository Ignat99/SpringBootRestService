package springbootrestservice.rest.converters;

import springbootrestservice.model.Account;
import springbootrestservice.rest.request.AccountRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;


import java.util.Currency;
import static java.math.BigDecimal.TEN;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class AccountRequestConverterTest {

    @InjectMocks
    private AccountRequestConverter target;

    @Test(expected = NullPointerException.class)
    public void convertNullValue() {
        target.convert(null);
    }


    @Test
    public void convert() {
//        final AccountRequest accountRequest = new AccountRequest("Dummy", TEN, true);
        Currency c1 = Currency.getInstance("USD");
        final AccountRequest accountRequest = new AccountRequest("Dummy", TEN, c1, true);

        final Account result = target.convert(accountRequest);

        final Account expectedAccount = Account.builder().treasury(true).currency(c1).balance(TEN).name("Dummy").build();

        assertThat(result).isEqualTo(expectedAccount);
    }

}
