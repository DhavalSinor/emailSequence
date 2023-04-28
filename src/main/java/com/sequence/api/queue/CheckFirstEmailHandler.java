package com.sequence.api.queue;

import com.sequence.api.dto.SequenceHandlerDTO;
import com.sequence.api.service.EmailService;
import com.sequence.api.service.TransactionService;
import com.sequence.api.service.UserService;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.concurrent.BlockingQueue;

/**
 * @author Nawaz
 */
@Service
public class CheckFirstEmailHandler extends AEmailHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(CheckFirstEmailHandler.class);

    public CheckFirstEmailHandler(BlockingQueue<SequenceHandlerDTO> checkFirstEmailQueue, BlockingQueue<SequenceHandlerDTO> checkSecondEmailQueue, BlockingQueue<SequenceHandlerDTO> checkThirdEmailQueue, UserService userService, EmailService emailService, TransactionService transactionService) {
        super(checkFirstEmailQueue, checkSecondEmailQueue, checkThirdEmailQueue, userService, emailService, transactionService);
    }

    @PostConstruct
    public void checkFirstEmailQueue() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("Queue Started 1");
                    SequenceHandlerDTO handlerDTO = null;
                    try {
                        handlerDTO = checkFirstEmailQueue.take();
                    } catch (Throwable e) {

                    }
                }
            }
        }).start();
    }
}
