package springbootrestservice.rest.converters;

import springbootrestservice.converter.Converter;
import springbootrestservice.model.Transfer;
import springbootrestservice.rest.response.TransferResponse;

import org.springframework.stereotype.Component;

@Component
public class TransferConverter implements Converter<Transfer, TransferResponse> {

    @Override
    public TransferResponse convert(final Transfer from) {
        return TransferResponse.builder()
                .transferNumber(from.getId())
                .sourceAccountNumber(from.getSource().getId())
                .targetAccountNumber(from.getTarget().getId())
                .transferedAmount(from.getAmount())
                .createdDate(from.getCreatedAt())
                .build();
    }

}
