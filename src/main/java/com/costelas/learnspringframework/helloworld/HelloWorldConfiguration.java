package com.costelas.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {
}

record Address(String firstLine, String city) {
}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "costelas";
    }

    @Bean
    public int age() {
        return 20;
    }

    @Bean
    public Person person() {
        return new Person("denis", 21, new Address("NU", "Zalau"));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address()); // name, age
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3) { //name, age, address3
        return new Person(name, age, address3); // name, age
    }

    @Bean
    @Primary
    public Person person4Parameters(String name, int age, @Qualifier("address3qualifier") Address address) { //name, age, address
        return new Person(name, age, address); // name, age
    }

    @Bean
    public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address) { //name, age, address
        return new Person(name, age, address); // name, age
    }

    @Bean(name = "address2")
    @Primary
    public Address address() {
        return new Address("Str.Ioan Nichita", "Zalau");
    }

    @Bean(name = "address3")
    @Qualifier("address3qualifier")
    public Address address3() {
        return new Address("Ce plm", "Salaj");
    }
}
