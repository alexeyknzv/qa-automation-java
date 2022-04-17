package com.tcs.edu;

import com.tcs.edu.decorator.Severity;
import com.tcs.edu.printer.MessageService;

class Application {
    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            MessageService.process(Severity.MINOR, "Hello world!", "Hi world!", "Peace!");
        }
    }
}
