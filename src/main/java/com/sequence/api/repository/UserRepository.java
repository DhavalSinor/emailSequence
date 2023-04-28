package com.sequence.api.repository;

import com.sequence.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * @author Nawaz
 */
public interface UserRepository extends JpaRepository<User, UUID> {
}