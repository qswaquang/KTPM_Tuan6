package com.ktpm.spring_boot_activemq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringBootActivemqApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootActivemqApplication.class, args);
	}

}
