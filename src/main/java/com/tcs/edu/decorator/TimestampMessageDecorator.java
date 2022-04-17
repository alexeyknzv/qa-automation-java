package com.tcs.edu.decorator;

import java.time.Instant;

/**
 * Class for adding an index number and a timestamp to a string
 * @author Alexey Knyazev
 */

public class TimestampMessageDecorator {
    public static int messageCount = 1;

    /**
     * Adds index number and timestamp with current date-time
     * @param message string to add timestamp
     * @return given string with index number and timestamp in the beginning
     */

    public static String decorate(String message) {

        final var decoratedMessage = String.format("%d %s %s", messageCount, Instant.now(), message);
        return decoratedMessage;
    }
}
