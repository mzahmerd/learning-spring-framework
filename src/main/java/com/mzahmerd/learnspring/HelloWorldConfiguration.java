package com.mzahmerd.learnspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//By using record, we:
//Eliminate verbosity in creating Java Beans
//public accessor method, constructor, equals, hashCode, and toString are automatically created
//It's released in JDK 16.

record Person(String name, int age, Address address){}
record Address(String firstLine, String city){}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Muhammad";
    }

    @Bean
    public int age(){
        return 15;
    }

    @Bean
    public Person person(){
        return new Person("Adamu", 21, new Address("GRA","Kaduna"));
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age(), address());
    }
    @Bean
    public Person person3Parameters(String name, int age, Address userAddress2){
        return new Person(name, age, userAddress2);
    }
    @Bean(name = "userAddress") //using custom Bean name.
    public Address address(){
        return new Address("Bolari","Gombe");
    }

    @Bean(name = "userAddress2") //using custom Bean name.
    public Address addres2(){
        return new Address("Pantami","Gombe");
    }
}