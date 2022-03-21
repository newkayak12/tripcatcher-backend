package com.tripcatcher.tripcatcherbackend;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableJpaAuditing
@SpringBootApplication
public class TripcatcherBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(TripcatcherBackendApplication.class, args);
    }
    @Bean
    public ModelMapper modelMapper(){return new ModelMapper();}
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){return new BCryptPasswordEncoder();}
}
