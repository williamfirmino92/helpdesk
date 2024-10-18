package com.jwc.helpdesk.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

import com.jwc.helpdesk.services.DBService;

import jakarta.annotation.PostConstruct;

@Configuration
@Profile("test")
public class TestConfig {

    @Autowired
    private DBService dbService;

    @PostConstruct
    public void instaciaDB() {
        this.dbService.instaciaDB();
    }

    // Com o bean não funcionou
    // @Bean
    // public void instaciaDB() {
    // this.dbService.instaciaDB();
    // }

}
