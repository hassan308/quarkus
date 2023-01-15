package com.example.hassoback;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ReceivierService {
    @JmsListener(destination = "${jms.queue}")
    public void recivceMessage(String message)
    {
        log.info("meddelande har kommit" + message);
    }
}
