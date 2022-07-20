package com.spi.spiprovider.spi;

import org.spi.test.TestSpi;
import org.springframework.stereotype.Component;

@Component
public class TestSpiImpl implements TestSpi {
    @Override
    public void hi() {
        System.out.println("hi everybody!");
    }
}
