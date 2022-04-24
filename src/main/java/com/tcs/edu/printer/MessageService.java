package com.tcs.edu.printer;

import com.tcs.edu.decorator.*;

import java.util.Objects;

import static java.lang.Math.abs;

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

    public static void process(Severity severityLevel, MessageOrder order, Doubling doubling,
                               String... messages) {

        int OrderStart = Objects.equals(order.name(), "ASC") ? 0 : -(messages.length - 1);
        int OrderEnd = Objects.equals(order.name(), "ASC") ? messages.length - 1 : 0;

        if (Objects.equals(doubling.name(), "DISTINCT")) {
            String[] printedMessages = new String[messages.length];
            for (int i = OrderStart; i <= OrderEnd; i++) {
                if (messages[abs(i)] != null) {
                    boolean printed = false;
                    for (String printedMessage : printedMessages) {
                        if (Objects.equals(messages[abs(i)], printedMessage)) {
                            printed = true;
                            break;
                        }
                    }
                    if (!printed) {
                        ConsolePrinter.print(CounterDecorator.decorate(TimestampMessageDecorator.decorate(messages[abs(i)]) + " " + SeverityMap.mapToString(severityLevel)));
                    }
                    printedMessages[abs(i)] = messages[abs(i)];
                }
            }
        } else {
            for (int i = OrderStart; i <= OrderStart; i++) {
                if (messages[abs(i)] != null) {
                    ConsolePrinter.print(CounterDecorator.decorate(TimestampMessageDecorator.decorate(messages[abs(i)]) + " " + SeverityMap.mapToString(severityLevel)));
                }
            }
        }
    }
}