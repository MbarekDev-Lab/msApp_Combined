package com.mbarekDev.mainApp.web;

import com.mbarekDev.mainApp.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WebController {
    @Autowired
    private BusinessService businessService;
    public long returnValueFromBusinessService() {
        return businessService.calculateSum();
    }
}