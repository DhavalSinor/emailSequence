package com.sequence.api.queue;

import com.sequence.api.dto.SequenceHandlerDTO;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.concurrent.BlockingQueue;

/**
 * @author Nawaz
 */
@Service
public class CheckSecondEmailHandler extends AEmailHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(CheckSecondEmailHandler.class);

    public CheckSecondEmailHandler(BlockingQueue<SequenceHandlerDTO> checkFirstEmailQueue, BlockingQueue<SequenceHandlerDTO> checkSecondEmailQueue, BlockingQueue<SequenceHandlerDTO> checkThirdEmailQueue) {
        super(checkFirstEmailQueue, checkSecondEmailQueue, checkThirdEmailQueue);
    }

    @PostConstruct
    public void checkSecondEmailQueue() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("Queue Started 2");
                    SequenceHandlerDTO handlerDTO = null;
                    try {
                        handlerDTO = checkSecondEmailQueue.take();
                    } catch (Throwable e) {

                    }
                }
            }
        }).start();
    }

}
