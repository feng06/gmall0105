package com.my.gamlluserweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class GamllUserWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(GamllUserWebApplication.class, args);
    }

}
