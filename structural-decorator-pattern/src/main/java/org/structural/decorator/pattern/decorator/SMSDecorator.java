package org.structural.decorator.pattern.decorator;

import org.structural.decorator.pattern.INotifier;

public class SMSDecorator extends BaseNotifierDecorator{
    public SMSDecorator(INotifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending message by SMS " + userService.getMobileByUseraneme(getUserName()));
    }
}
