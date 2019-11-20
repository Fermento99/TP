package eu.jpereira.trainings.designpatterns.structural.decorator.channel.decorator;
import eu.jpereira.trainings.designpatterns.structural.decorator.channel.SocialChannel;

import java.lang.StringBuilder;

public class WordCensor extends SocialChannelDecorator {

    public WordCensor() { }
    public WordCensor(SocialChannel decoratedChannel) {
        this.delegate = decoratedChannel;
    }
    @Override
    public void deliverMessage(String message) {
        while (message.contains("message")) {
            StringBuilder builder = new StringBuilder(message);
            builder.insert(builder.indexOf("message"), "###");
            int index = builder.indexOf("message");
            for (int i = 0; i < 7; i++)
                builder.deleteCharAt(index);
            message = builder.toString();
        }
        delegate.deliverMessage(message);

    }
}
