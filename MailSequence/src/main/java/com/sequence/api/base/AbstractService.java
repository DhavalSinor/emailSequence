package com.sequence.api.base;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Nawaz
 */
public class AbstractService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractService.class);

    protected static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
}
