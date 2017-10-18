package com.lanshiqin.producerservice.core.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class InfoController {

    @Value("${app.info}")
    private String info;

    @RequestMapping("/appInfo")
    public String info(){
        return info;
    }
}
