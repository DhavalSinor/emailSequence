package com.sequence.api.service;

import com.sequence.api.base.AbstractService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author Nawaz
 */
@Service
public class TestService extends AbstractService {

    private final DemoService demoService;

    public TestService(DemoService demoService) {
        this.demoService = demoService;
    }

    public Map<String, Object> testDemoTable() {
        return Map.of("msg", "Success");
    }

    public Map<String, Object> findDemoById(Long id) {
        return Map.of("data", demoService.findById(id));
    }
}
