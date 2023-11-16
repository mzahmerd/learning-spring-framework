package com.mzahmerd.learnspring;

import com.mzahmerd.learnspring.game.GameRunner;
import com.mzahmerd.learnspring.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args){
        //1: launch a spring context
        var context =  new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        //2: configure the things that we want spring to manage
//            a:HelloWorldConfiguration - @Configuration
//        b: add Bean method (name) using @Bean annotation

//        3: Retrieving Beans managed by Spring
        System.out.println(context.getBean("name"));

        System.out.println(context.getBean("age"));

        System.out.println(context.getBean("person"));

        System.out.println(context.getBean("person2MethodCall"));

        System.out.println(context.getBean("userAddress"));

        System.out.println(context.getBean("person3Parameters"));

//        System.out.println(context.getBean(Address.class)); // using class
    }
}
