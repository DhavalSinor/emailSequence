package com.sequence.api.queue;

import com.sequence.api.dto.SequenceHandlerDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.BlockingQueue;

/**
 * @author Nawaz
 */
public class AEmailHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(AEmailHandler.class);

    protected final BlockingQueue<SequenceHandlerDTO> checkFirstEmailQueue;

    protected final BlockingQueue<SequenceHandlerDTO> checkSecondEmailQueue;

    protected final BlockingQueue<SequenceHandlerDTO> checkThirdEmailQueue;

    public AEmailHandler(BlockingQueue<SequenceHandlerDTO> checkFirstEmailQueue, BlockingQueue<SequenceHandlerDTO> checkSecondEmailQueue, BlockingQueue<SequenceHandlerDTO> checkThirdEmailQueue) {
        this.checkFirstEmailQueue = checkFirstEmailQueue;
        this.checkSecondEmailQueue = checkSecondEmailQueue;
        this.checkThirdEmailQueue = checkThirdEmailQueue;
    }
}
