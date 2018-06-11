package org.soujava.microprofile.demo.heroes;

import javax.jms.JMSDestinationDefinition;

@JMSDestinationDefinition(
        name="java:/jms/topics/updateMongoDB",
        interfaceName = "javax.jms.Topic"
)
public class ConfigureJMSDestinations {
}
