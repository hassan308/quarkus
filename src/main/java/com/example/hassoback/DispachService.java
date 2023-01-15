package com.example.hassoback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class DispachService {

    @Autowired
    JmsTemplate jmsTemplate;

    @Value("${jms.queue}")
    String jmsQueu;


    public void sendMessage(String message)
    {
        jmsTemplate.convertAndSend(jmsQueu, message);
    }
}
