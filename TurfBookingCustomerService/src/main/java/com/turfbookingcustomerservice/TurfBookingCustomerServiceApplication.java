package com.turfbookingcustomerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TurfBookingCustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TurfBookingCustomerServiceApplication.class, args);
    }

}
