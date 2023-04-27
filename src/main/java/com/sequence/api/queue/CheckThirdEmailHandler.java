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
public class CheckThirdEmailHandler extends AEmailHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(CheckThirdEmailHandler.class);

    public CheckThirdEmailHandler(BlockingQueue<SequenceHandlerDTO> checkFirstEmailQueue, BlockingQueue<SequenceHandlerDTO> checkSecondEmailQueue, BlockingQueue<SequenceHandlerDTO> checkThirdEmailQueue) {
        super(checkFirstEmailQueue, checkSecondEmailQueue, checkThirdEmailQueue);
    }

    @PostConstruct
    public void checkThirdEmailQueue() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("Queue Started 3");
                    SequenceHandlerDTO handlerDTO = null;
                    try {
                        handlerDTO = checkThirdEmailQueue.take();
                    } catch (Throwable e) {

                    }
                }
            }
        }).start();
    }
}
