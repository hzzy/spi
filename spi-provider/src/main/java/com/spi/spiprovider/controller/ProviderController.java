package com.spi.spiprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/provider/")
public class ProviderController {

    @RequestMapping("test")
    public String test() {
        return "hello test";
    }


}
