package com.sequence.api.repository;

import com.sequence.api.entity.Email;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * @author Nawaz
 */
public interface EmailRepository extends JpaRepository<Email, UUID> {
}