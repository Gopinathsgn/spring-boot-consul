package com.mousumi.consuldemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope
public class ConsController {

    @Value("${spring.consul.test}")
    private String testKey;

    @GetMapping("/checkConsul")
    public String checkConsul(){
        return testKey;
    }
}
