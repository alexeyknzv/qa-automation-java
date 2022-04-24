package com.tcs.edu.printer;

import com.tcs.edu.decorator.*;

import java.util.Objects;

/**
 * Class is used to assemble decorators for a message and to print the result
 * @author Alexey Knyazev
 * */

public class MessageService {
    /**
     * Adds severity, timestamp decorator, counter decorator to messages and prints them
     * @param severityLevel severity level
     * @param messages messages to decorate and print
     * @param order order ASC or DESC
     */
    public static void process(Severity severityLevel, MessageOrder order, String... messages) {
        if (Objects.equals(order.name(), "DESC")) {
            for (int i = messages.length - 1; i >= 0; i--) {
                if (messages[i] != null) {
                    ConsolePrinter.print(CounterDecorator.decorate(TimestampMessageDecorator.decorate(messages[i]) + " " + SeverityMap.mapToString(severityLevel)));
                }
            }
        } else {
            for (String iterMessage : messages) {
                if (iterMessage != null) {
                    ConsolePrinter.print(CounterDecorator.decorate(TimestampMessageDecorator.decorate(iterMessage) + " " + SeverityMap.mapToString(severityLevel)));
            }
            }
        }
    }
}