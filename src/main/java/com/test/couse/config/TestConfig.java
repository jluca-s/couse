package com.test.couse.config;

import java.util.Arrays;

import com.test.couse.entities.User;
import com.test.couse.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988776655", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977886655", "123654");

        userRepository.saveAll(Arrays.asList(u1, u2));
        
    }


}
