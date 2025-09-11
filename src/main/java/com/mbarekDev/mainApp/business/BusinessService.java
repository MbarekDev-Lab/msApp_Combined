package com.mbarekDev.mainApp.business;

import com.mbarekDev.mainApp.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BusinessService {
    @Autowired
    private DataService dataService;
    public long calculateSum() {
        List<Integer> data = dataService.getData();
        Optional<Integer> reduce = data.stream().reduce(Integer::sum);
        return reduce.get();
    }
    public long calculateSum2() {
        return dataService.getData().stream()
                .reduce(0, Integer::sum);
    }
}