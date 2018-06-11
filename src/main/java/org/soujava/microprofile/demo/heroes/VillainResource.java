package org.soujava.microprofile.demo.heroes;

import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.jms.JMSProducer;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.UUID;


@ApplicationScoped
@Path("villain")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class VillainResource {

    @Inject
    private JMSContext jmsContext;

    @Resource(lookup = "java:/jms/topics/updateMongoDB")
    private Destination checkoutsTopic;


    @GET
    public String findAll() {
        JMSProducer producer = jmsContext.createProducer();
        producer.send(checkoutsTopic, UUID.randomUUID().toString());
        return "Append in the queue";
    }

}
