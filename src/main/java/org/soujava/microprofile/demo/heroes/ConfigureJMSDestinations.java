package org.soujava.microprofile.demo.heroes;

import javax.jms.JMSDestinationDefinition;

@JMSDestinationDefinition(
        name= ConfigureJMSDestinations.TOPIC_NAME,
        interfaceName = "javax.jms.Topic"
)
public class ConfigureJMSDestinations {
    public static final String TOPIC_NAME = "java:/jms/topics/villains";
}
