package org.soujava.microprofile.demo.heroes;


import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import java.util.logging.Logger;

@MessageDriven(activationConfig = {
        @ActivationConfigProperty(
                propertyName = "destinationLookup",
                propertyValue = "java:/jms/topics/updateMongoDB")
})
public class VillainConsumer implements MessageListener {

    private static final Logger LOGGER = Logger.getLogger(VillainConsumer.class.getName());

    @Override
    public void onMessage(Message message) {

        LOGGER.info("messaging:" + message.toString());

    }
}
