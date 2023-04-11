package org.structural.decorator.pattern.decorator;

import org.structural.decorator.pattern.INotifier;

public class OtpDecorator extends BaseNotifierDecorator{
    public OtpDecorator(INotifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending OTP to user: " + getUserName());
    }
}
