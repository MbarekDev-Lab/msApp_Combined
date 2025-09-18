package com.mbarekDev.devApp_ms.controllers;

import com.mbarekDev.devApp_ms.CurrencyServiceConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {

    @Autowired
    private CurrencyServiceConfiguration configuration;

    @GetMapping("/curency-configuration")
    public CurrencyServiceConfiguration retrieveAllCourses() {
        return configuration;
    }
}
