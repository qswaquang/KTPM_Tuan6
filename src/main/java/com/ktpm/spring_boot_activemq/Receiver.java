package com.ktpm.spring_boot_activemq;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import javax.jms.MessageConsumer;

@Component
public class Receiver {


    @JmsListener(destination = "msg")
    public void reciver(String msg) {
        System.out.println("Message received: " + msg);
    }
}
