package com.tcs.edu.decorator;

import java.time.Instant;

/**
 * Class for adding timestamp to a string
 * @author Alexey Knyazev
 */

public class TimestampMessageDecorator {

    /**
     * Adds timestamp with current date-time
     * @param message string to add timestamp
     * @return given string timestamp in the beginning
     */

    public static String decorate(String message) {

        var decoratedMessage = String.format("%s %s", Instant.now(), message);
        return decoratedMessage;
    }
}
