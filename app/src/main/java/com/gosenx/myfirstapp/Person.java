package com.gosenx.myfirstapp;

import java.io.Serializable;

public class Person implements Serializable {
    public String name;
    public int age;
    public String country;

    public Person(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }
}
