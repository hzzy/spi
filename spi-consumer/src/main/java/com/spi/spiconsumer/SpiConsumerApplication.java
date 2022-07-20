package com.spi.spiconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.spi"})
public class SpiConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpiConsumerApplication.class, args);
    }

}
