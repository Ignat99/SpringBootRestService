package springbootrestservice.services;

import springbootrestservice.model.Transfer;

import java.math.BigDecimal;
import java.util.Optional;

public interface TransferService {

    Optional<Transfer> createTransfer(Long sourceAccountId, Long targetAccountId, BigDecimal amount);

    Optional<Transfer> findTransfer(Long id);

}
