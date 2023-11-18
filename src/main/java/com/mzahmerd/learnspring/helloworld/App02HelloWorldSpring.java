package com.mzahmerd.learnspring.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {

        //1: launch a spring context
        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {

            //2: configure the things that we want spring to manage
//            a:HelloWorldConfiguration - @Configuration
//        b: add Bean method (name) using @Bean annotation

//        3: Retrieving Beans managed by Spring
            System.out.println(context.getBean("name"));

            System.out.println(context.getBean("age"));

            System.out.println(context.getBean("person"));

            System.out.println(context.getBean("person2MethodCall"));

            System.out.println(context.getBean("address2"));


            System.out.println(context.getBean(Person.class));

            System.out.println(context.getBean(Address.class)); // using class

//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean("person5Qualifier"));
        }
    }

}
