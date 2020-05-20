package com.DigitaIinnovationOne.SpringBoot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class AppController {
    @Value ("${app.message}")
    private String appMessage;

    @GetMapping("/")
    public String getAppMessage(){
        return appMessage;
    }
}
