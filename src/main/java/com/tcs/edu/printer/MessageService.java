package com.tcs.edu.printer;

import com.tcs.edu.decorator.CounterDecorator;
import com.tcs.edu.decorator.Severity;
import com.tcs.edu.decorator.TimestampMessageDecorator;
import com.tcs.edu.decorator.SeverityMap;

/**
 * Class is used to assemble decorators for a message and to print the result
 * @author Alexey Knyazev
 * */

public class MessageService {
    /**
     * Adds severity, timestamp decorator, counter decorator to messages and prints them
     * @param severityLevel severity level
     * @param message message to decorate and print
     */
    public static void process(Severity severityLevel, String message, String... messages) {
        ConsolePrinter.print(CounterDecorator.decorate(TimestampMessageDecorator.decorate(message) + " " + SeverityMap.mapToString(severityLevel)));

        for (String itemMessage: messages) {
            if (itemMessage != null) {
                ConsolePrinter.print(CounterDecorator.decorate(TimestampMessageDecorator.decorate(itemMessage) + " " + SeverityMap.mapToString(severityLevel)));
            }
        }
    }
}
