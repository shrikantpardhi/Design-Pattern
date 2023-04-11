package org.structural.decorator.pattern.decorator;

import org.structural.decorator.pattern.INotifier;
import org.structural.decorator.pattern.UserService;

public class BaseNotifierDecorator implements INotifier {
    public final INotifier notifier;
    protected final UserService userService;

    public BaseNotifierDecorator(INotifier notifier) {
        this.notifier = notifier;
        this.userService = new UserService();
    }

    @Override
    public void send(String message) {
        notifier.send(message);
    }

    @Override
    public String getUserName() {
        return notifier.getUserName();
    }
}
