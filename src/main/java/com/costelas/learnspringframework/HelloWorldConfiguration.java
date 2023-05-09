package com.costelas.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) { }

record Address(String firstLine, String city) { }

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
        return new Person("denis", 21);
    }

    @Bean
    public Address address() {
        return new Address("Str.Ioan Nichita", "Zalau");
    }
}
