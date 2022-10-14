package com.ktpm.spring_boot_activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sender {

    @Autowired
    private JmsTemplate jmsTemplate;

    @PostMapping("/send")
    public String send(@Param("msg") String msg) {
            jmsTemplate.convertAndSend("msg", msg);
            return "sended";
    }
}