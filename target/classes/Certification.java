package com.klu.SpringProject;

import org.springframework.stereotype.Component;

@Component
public class Certification {
    private int id;
    private String name;
    private String dateOfCompletion;

    public Certification() {
        this.id = 101;
        this.name = "Java Certification";
        this.dateOfCompletion = "2026-03-10";
    }

    @Override
    public String toString() {
        return "Certification [id=" + id + ", name=" + name + ", dateOfCompletion=" + dateOfCompletion + "]";
    }
}