package org.structural.decorator.pattern.decorator;

import org.structural.decorator.pattern.INotifier;

public class WhatsAppDecorator extends BaseNotifierDecorator{

    public WhatsAppDecorator(INotifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending message by whatsapp " + userService.getMobileByUseraneme(getUserName()));
    }

}
