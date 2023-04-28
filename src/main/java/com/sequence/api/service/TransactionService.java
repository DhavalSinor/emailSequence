package com.sequence.api.service;

import com.sequence.api.base.ABaseService;
import com.sequence.api.entity.Transaction;
import com.sequence.api.repository.TransactionRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author Nawaz
 */
@Service
public class TransactionService extends ABaseService<Transaction, UUID> {

    private final TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    protected JpaRepository<Transaction, UUID> getJPARepository() {
        return transactionRepository;
    }
}
