package com.sequence.api.repository;

import com.sequence.api.entity.Demo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Nawaz
 */
public interface DemoRepository extends JpaRepository<Demo, Long> {
}