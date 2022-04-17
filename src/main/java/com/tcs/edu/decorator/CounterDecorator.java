package com.tcs.edu.decorator;

/**
 * Class for adding an index number and separator to a string
 * @author Alexey Knyazev
 */

public class CounterDecorator {
    public static int messageCount = 1;
    private static final int PAGE_SIZE = 2;
    private static final String separator = "---";

    /**
     * Adding index and separator between PAGE_SIZE number of lines
     * @param message string to add number and separator
     * @return given string with index number and separator
     */
    public static String decorate(String message) {
        var decoratedMessage = String.format("%d %s", messageCount, message);
        if (messageCount % PAGE_SIZE == 0) {
            decoratedMessage = String.format("%s%n%s", decoratedMessage, separator);
        }
        return decoratedMessage;
    }
}

