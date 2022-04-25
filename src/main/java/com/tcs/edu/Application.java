package com.tcs.edu;

import com.tcs.edu.decorator.Doubling;
import com.tcs.edu.decorator.MessageOrder;
import com.tcs.edu.decorator.Severity;
import com.tcs.edu.printer.MessageService;

import static com.tcs.edu.decorator.MessageOrder.ASC;
import static com.tcs.edu.decorator.MessageOrder.DESC;

class Application {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            MessageService.process(Severity.MINOR, DESC, Doubling.DISTINCT, "Hello world!", "Peace!", null, "Hello world!", "Peace!");
        }
    }
}
