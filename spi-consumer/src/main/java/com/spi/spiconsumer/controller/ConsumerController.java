package com.spi.spiconsumer.controller;

import org.spi.test.TestSpi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.ServiceLoader;

@RestController
@RequestMapping("consumer")
public class ConsumerController {

    private static ServiceLoader<TestSpi> testSpiLoader = ServiceLoader.load(TestSpi.class);

    @Resource
    private TestSpi testSpi;

    @RequestMapping("test")
    public String test() {
        Iterator<TestSpi> iterator = testSpiLoader.iterator();
        while (iterator.hasNext()) {
            TestSpi next = iterator.next();
            System.out.println(next);
            next.hi();
        }
        System.out.println(testSpi);
        testSpi.hi();
        return "hello consumer";
    }

}
