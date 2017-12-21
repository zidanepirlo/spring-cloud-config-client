package com.yuan.springcloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Value("${neo.hello}")
    private String hello;

    @RequestMapping("/config/hello")
    public String from() {
        return this.hello;
    }
}
