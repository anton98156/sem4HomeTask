package com.example.sem4HomeTask.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.sem4HomeTask.model.User;

@Configuration
public class UserConfig {
    @Bean
    public User user() {
        return new User(1, "Имя", "Фамилия");
    }
}