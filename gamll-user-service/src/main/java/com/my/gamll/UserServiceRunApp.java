package com.my.gamll;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.my.gamll.mapper")
public class UserServiceRunApp {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceRunApp.class,args);
    }
}
