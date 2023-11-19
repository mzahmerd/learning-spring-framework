package com.mzahmerd.learnspring.examples.excercise;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService{
    @Override
    public int[] retrieveData() {
        return new int[] {21,23,4,33,65,63};
    }
}
