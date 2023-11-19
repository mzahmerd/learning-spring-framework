package com.mzahmerd.learnspring.examples.excercise;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[] {1,2,3,4,67,7};
    }
}
