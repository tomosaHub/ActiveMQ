package com.example.springbootactivemqexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    private static final Logger log = LoggerFactory.getLogger(MessageConsumer.class);

    @JmsListener(destination = "New.message")
    public void receiveMessage(Message message)
    {
        log.info("Received message: {}",message.getText() );
    }
}
