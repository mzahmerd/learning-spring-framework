package com.mzahmerd.learnspring.examples.excercise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ExerciseLauncher {
public static void main(String[] args){
    try(var context = new AnnotationConfigApplicationContext(ExerciseLauncher.class)){
        System.out.println(context.getBean(BusinessCalculatorService.class).findMax());
    }
}
}
