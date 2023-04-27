package com.sequence.api.service;

import com.sequence.api.base.ABaseService;
import com.sequence.api.entity.Demo;
import com.sequence.api.repository.DemoRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * @author Nawaz
 */
@Service
public class DemoService extends ABaseService<Demo, Long> {

    private final DemoRepository demoRepository;

    public DemoService(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }

    @Override
    protected JpaRepository<Demo, Long> getJPARepository() {
        return demoRepository;
    }
}
