package com.jwc.helpdesk.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import com.jwc.helpdesk.services.DBService;

import jakarta.annotation.PostConstruct;

@Configuration
@Profile("dev")
public class DevConfig {

    @Autowired
    private DBService dbService;

    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String value;

    @PostConstruct
    public boolean instaciaDB() {
        if (value.equals("create")) {
            this.dbService.instaciaDB();
        }
        return false;
    }

    // Com o bean não funcionou
    // @Bean
    // public void instaciaDB() {
    // this.dbService.instaciaDB();
    // }

}
