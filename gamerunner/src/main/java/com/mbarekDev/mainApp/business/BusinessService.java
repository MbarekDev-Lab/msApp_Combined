package com.mbarekDev.mainApp.business;

import com.mbarekDev.mainApp.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BusinessService {

    private DataService dataService;

    @Autowired
    public BusinessService(DataService dataService) {
        super();
        System.out.println("Constructor Injection");
        this.dataService = dataService;
    }


    public void setDataService(DataService dataService) {
        System.out.println("Setter Injection");
        this.dataService = dataService;
    }

    public long calculateSum() {
        List<Integer> data = dataService.getData();
        Optional<Integer> reduce = data.stream().reduce(Integer::sum);
        return reduce.get();
    }

    public long calculateSum2() {
        return dataService.getData().stream().reduce(0, Integer::sum);
    }

}