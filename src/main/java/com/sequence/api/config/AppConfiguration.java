package com.sequence.api.config;

import com.sequence.api.dto.SequenceHandlerDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;

/**
 * @author Nawaz
 */
@Configuration
@EnableAsync
public class AppConfiguration {

    @Bean
    public BlockingQueue<SequenceHandlerDTO> checkFirstEmailQueue() {
        return new DelayQueue<>();
    }

    @Bean
    public BlockingQueue<SequenceHandlerDTO> checkSecondEmailQueue() {
        return new DelayQueue<>();
    }

    @Bean
    public BlockingQueue<SequenceHandlerDTO> checkThirdEmailQueue() {
        return new DelayQueue<>();
    }
}
