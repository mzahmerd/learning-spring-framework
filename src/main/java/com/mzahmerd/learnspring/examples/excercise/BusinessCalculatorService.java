package com.mzahmerd.learnspring.examples.excercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessCalculatorService {
private DataService dataService;

    public BusinessCalculatorService(DataService dataService) {
        super();
        this.dataService = dataService;
    }

    public int findMax(){
        return Arrays.stream(dataService.retrieveData())
                .max().orElse(0);
    }
}
