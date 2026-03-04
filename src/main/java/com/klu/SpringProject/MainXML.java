package com.klu.SpringProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXML {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student1 = (Student) context.getBean("studentConstructor");
        Student student2 = (Student) context.getBean("studentSetter");

        System.out.println("Constructor Injection: " + student1);
        System.out.println("Setter Injection: " + student2);
    }
}