package com.softserve.kickscootertrip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@EnableFeignClients
public class KickScooterTripApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(KickScooterTripApplication.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(KickScooterTripApplication.class, args);
    }

}
