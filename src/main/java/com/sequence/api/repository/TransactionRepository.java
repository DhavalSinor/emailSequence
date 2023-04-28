package com.sequence.api.repository;

import com.sequence.api.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * @author Nawaz
 */
public interface TransactionRepository extends JpaRepository<Transaction, UUID> {
}