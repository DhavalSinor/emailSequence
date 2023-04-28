package com.sequence.api.queue;

import com.sequence.api.dto.SequenceHandlerDTO;
import com.sequence.api.service.EmailService;
import com.sequence.api.service.TransactionService;
import com.sequence.api.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.BlockingQueue;

/**
 * @author Nawaz
 */
public abstract class AEmailHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(AEmailHandler.class);

    protected final BlockingQueue<SequenceHandlerDTO> checkFirstEmailQueue;

    protected final BlockingQueue<SequenceHandlerDTO> checkSecondEmailQueue;

    protected final BlockingQueue<SequenceHandlerDTO> checkThirdEmailQueue;

    protected final UserService userService;

    protected final EmailService emailService;

    protected final TransactionService transactionService;

    public AEmailHandler(BlockingQueue<SequenceHandlerDTO> checkFirstEmailQueue, BlockingQueue<SequenceHandlerDTO> checkSecondEmailQueue, BlockingQueue<SequenceHandlerDTO> checkThirdEmailQueue, UserService userService, EmailService emailService, TransactionService transactionService) {
        this.checkFirstEmailQueue = checkFirstEmailQueue;
        this.checkSecondEmailQueue = checkSecondEmailQueue;
        this.checkThirdEmailQueue = checkThirdEmailQueue;
        this.userService = userService;
        this.emailService = emailService;
        this.transactionService = transactionService;
    }
}
