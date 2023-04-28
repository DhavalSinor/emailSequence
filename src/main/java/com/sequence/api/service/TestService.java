package com.sequence.api.service;

import com.sequence.api.base.AbstractService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author Nawaz
 */
@Service
public class TestService extends AbstractService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestService.class);

    public Map<String, Object> testDemoTable() {
        return Map.of("msg", "Success");
    }

}
