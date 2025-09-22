package com.mbarekDev.mainApp.data;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataService {
    public List<Integer> getData() {
        return Arrays.asList(10, 11, 12, 13);
    }
}
