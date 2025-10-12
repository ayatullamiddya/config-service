package com.prc.config_service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableConfigServer
public class ConfigServiceApplication {

    @Value("${myapp.name}")
    private String name;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ConfigServiceApplication.class, args);
        ConfigServiceApplication app = context.getBean(ConfigServiceApplication.class);
        System.out.println(app.name);  // ✅ prints the value
    }

}
