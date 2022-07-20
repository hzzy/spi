package com.spi.spiprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.spi.spiprovider"})
public class SpiProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpiProviderApplication.class, args);
    }

}
