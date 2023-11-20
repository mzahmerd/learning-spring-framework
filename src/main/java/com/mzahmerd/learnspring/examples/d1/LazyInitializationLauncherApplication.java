package com.mzahmerd.learnspring.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA{

}

@Component
@Lazy // to prevent auto initialization (eager loading)
class ClassB{
    private ClassA classA;
    public ClassB(ClassA classA){
//        Login
        this.classA = classA;

        System.out.println("Some initialization logic");
    }
}
@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)) {

            System.out.println("context initialization completed");

            context.getBean(ClassB.class);
        };
    }
}