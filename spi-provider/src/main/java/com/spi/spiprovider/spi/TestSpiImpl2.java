package com.spi.spiprovider.spi;

import org.spi.test.TestSpi;

public class TestSpiImpl2 implements TestSpi {
    @Override
    public void hi() {
        System.out.println("hi everybody 2!");
    }
}
