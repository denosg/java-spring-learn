package com.costelas.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {

    // Bean takes the names of the methods and saves them as pointers (I guess)

    public static void main(String[] args) {
        // 1: Launch a Spring Context -
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // 2: Configure the things that we want Spring framework to manage - @Configuration
        // HelloWorldConfiguration - @Configuration
        // name - @Bean

        // 3: Retrieving Beans managed by Spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address2"));
//        System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameters"));
        System.out.println(context.getBean("person4Parameters"));

        System.out.println(context.getBean("person5Qualifier"));

//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
