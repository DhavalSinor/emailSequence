package com.sequence.api.base;

import com.sequence.api.base.dto.ResponseDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * @author Nawaz
 */
public abstract class AbstractController {
    /**
     * LOGGER instance
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractController.class);

    protected <T> ResponseDTO<T> generateResponse(T body) throws Throwable {
        LOGGER.debug("AbstractController (generateResponse()) Execution ->");
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.add("Content-Type", "application/json");
        return new ResponseDTO<>(body, responseHeaders, HttpStatus.OK);
    }

    protected File toFile(MultipartFile multiPartFile, String suffix) throws Throwable {
        File temporaryFile = File.createTempFile("tmp_", suffix);
        multiPartFile.transferTo(temporaryFile);
        LOGGER.debug("AbstractController (toFile()) Execution -> Copied MultipartFile request to " + temporaryFile.getAbsolutePath());
        return temporaryFile;
    }

}
