package org.structural.decorator.pattern;

public class Notifier implements INotifier{
    private final String userName;
    private final UserService userService;

    public Notifier(String userName) {
        this.userName = userName;
        this.userService = new UserService();
    }

    @Override
    public void send(String message) {
        System.out.println("sending message by mail " + userService.getEmailByUsername(userName));
    }

    @Override
    public String getUserName() {
        return userName;
    }
}
