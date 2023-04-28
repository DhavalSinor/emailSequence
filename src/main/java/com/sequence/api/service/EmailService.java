package com.sequence.api.service;

import com.sequence.api.base.ABaseService;
import com.sequence.api.entity.Email;
import com.sequence.api.repository.EmailRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author Nawaz
 */
@Service
public class EmailService extends ABaseService<Email, UUID> {

    private final EmailRepository emailRepository;

    public EmailService(EmailRepository emailRepository) {
        this.emailRepository = emailRepository;
    }

    @Override
    protected JpaRepository<Email, UUID> getJPARepository() {
        return emailRepository;
    }
}
