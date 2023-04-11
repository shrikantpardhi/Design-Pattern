package org.structural.decorator.pattern;

import org.structural.decorator.pattern.decorator.OtpDecorator;
import org.structural.decorator.pattern.decorator.SMSDecorator;
import org.structural.decorator.pattern.decorator.WhatsAppDecorator;

/**
 * Hello world!
 *
 */
public class MainApp
{
    public static void main( String[] args )
    {
        System.out.println("Send message via all channels");
        INotifier notifyAll = new OtpDecorator(
                new WhatsAppDecorator(
                        new SMSDecorator(new Notifier("Shri"))
                )
        );
        notifyAll.send("my message.");

        System.out.println("*****************");

        System.out.println("Send message via Email channel");
        INotifier notifyByMail = new OtpDecorator(new Notifier("shri"));
        notifyByMail.send("my message");

    }
}
