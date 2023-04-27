package com.sequence.api.utils;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.id.uuid.CustomVersionOneStrategy;

import java.io.Serializable;
import java.util.UUID;

/**
 * @author Nawaz
 * <p>
 * Custom Identifier generator for Hibernate. This utility generates the
 * UUID version 1 and perform time swap operation with generated UUID.
 * Time swap operation is defined as "The time-low and time-high parts
 * (the first and third groups of hexadecimal digits, respectively) are
 * swapped. This moves the more rapidly varying part to the right and
 * can improve indexing efficiency if the result is stored in an indexed
 * column."
 */
public class UUIDV1WithTimeSwapGenerationStrategy implements IdentifierGenerator {

    private final CustomVersionOneStrategy customVersionOneStrategy = new CustomVersionOneStrategy();

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
        UUID uuid1 = customVersionOneStrategy.generateUUID(null);
        String uuidTimeSwap = uuid1.toString().replaceAll("-", "");

        String swapString = uuidTimeSwap.substring(12, 16) + uuidTimeSwap.substring(8, 12) + "-"
                + uuidTimeSwap.substring(0, 4) + "-" + uuidTimeSwap.substring(4, 8) + "-"
                + uuidTimeSwap.substring(16, 20) + "-" + uuidTimeSwap.substring(20, 32);
        return UUID.fromString(swapString);
    }

}
