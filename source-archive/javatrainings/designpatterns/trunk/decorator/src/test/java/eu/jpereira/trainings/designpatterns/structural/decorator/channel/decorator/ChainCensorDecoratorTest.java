package eu.jpereira.trainings.designpatterns.structural.decorator.channel.decorator;

import eu.jpereira.trainings.designpatterns.structural.decorator.channel.SocialChannel;
import eu.jpereira.trainings.designpatterns.structural.decorator.channel.spy.TestSpySocialChannel;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChainCensorDecoratorTest extends AbstractSocialChanneldDecoratorTest {
    @Test
    public void testChainThreeDecoratorsWithoutBuilder() {

        SocialChannel channel = new TestSpySocialChannel();
        SocialChannel messageCensorChannel = new WordCensor(channel);
        SocialChannel urlAppenderChannel = new URLAppender("http://jpereira.eu", messageCensorChannel);

        //Now create a truncator
        SocialChannel messageTruncatorChannel = new MessageTruncator(30, urlAppenderChannel);



        messageTruncatorChannel.deliverMessage("this is a message is very long, but");
        // Spy channel. Should get the one created before
        TestSpySocialChannel spy = (TestSpySocialChannel)channel;
        assertEquals("this is a ### is very l... http://jpereira.eu", spy.lastMessagePublished());
    }
}
