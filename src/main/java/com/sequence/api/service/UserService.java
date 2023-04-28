package com.sequence.api.service;

import com.sequence.api.base.ABaseService;
import com.sequence.api.entity.User;
import com.sequence.api.repository.UserRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author Nawaz
 */
@Service
public class UserService extends ABaseService<User, UUID> {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    protected JpaRepository<User, UUID> getJPARepository() {
        return userRepository;
    }
}
