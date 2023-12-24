package com.example.customerfrontthymeleafapp;

import com.example.customerfrontthymeleafapp.entities.Customer;
import com.example.customerfrontthymeleafapp.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerFrontThymeleafAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerFrontThymeleafAppApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder()
                            .name("Nezha")
                            .email("nezha@gmail.com")
                            .build());
            customerRepository.save(Customer.builder()
                    .name("Zainab")
                    .email("zainab@gmail.com")
                    .build());
            customerRepository.save(Customer.builder()
                    .name("Sara")
                    .email("sara@gmail.com")
                    .build());
        };
    }

}
