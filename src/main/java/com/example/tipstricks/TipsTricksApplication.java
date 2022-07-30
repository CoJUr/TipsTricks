package com.example.tipstricks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
public class TipsTricksApplication {



//    another way of creating beans
    @Bean
    public PasswordService passwordService() {
        return new PasswordService();
    }

    public static void main(String[] args) {
        SpringApplication.run(TipsTricksApplication.class, args);
    }

}
