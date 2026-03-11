package com.klu.SpringProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private int id = 1;
    private String name = "Alice";
    private String gender = "Female";

    @Autowired
    private Certification certification;

    public Student() {}

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", certification=" + certification + "]";
    }
}