package com.mzahmerd.learnspring.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
    public Person person3Parameters(String name, int age, Address address2){
        return new Person(name, age, address2);
    }

    @Bean
//    No qualifying bean of type 'com.mzahmerd.learnspring.helloworld.Address'
//    available: expected single matching bean but found 2: address2,address3
    @Primary // use this in case multiple candidates found
    public Person person4Parameters(String name, int age, Address address){
        return new Person(name, age, address);
    }

    @Bean
    public Person person5Qualifier(String name, int age, @Qualifier("address3Qualifier") Address address){
        return new Person(name, age, address);
    }

    @Bean(name = "address2") //using custom Bean name.
    @Primary // use this in case multiple candidates found
    public Address address(){
        return new Address("Bolari","Gombe");
    }

    @Bean(name = "address3") //using custom Bean name.
    @Qualifier("address3Qualifier")
    public Address address3(){
        return new Address("Pantami","Gombe");
    }
}
