package com.sequence.api.controller;

import com.sequence.api.base.AbstractController;
import com.sequence.api.base.dto.ResponseDTO;
import com.sequence.api.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/mail")
public class TestController extends AbstractController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/test")
    public ResponseDTO<?> testApi() throws Throwable {
        LOGGER.debug("FileProcessingController (testApi()) Execution ->");
        return generateResponse(testService.testDemoTable());
    }
}
