package com.tcs.edu.printer;
import com.tcs.edu.decorator.TimestampMessageDecorator;
/**
 * Class for printing a message and increase counter
 * @author Alexey Knyazev
 */

public class ConsolePrinter {

    /**
     * Prints given string and increases counter
     * @param message string to print
     */

    public static void print(String message) {

        System.out.println(message);
        TimestampMessageDecorator.messageCount++;
    }
}
