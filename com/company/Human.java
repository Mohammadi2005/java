package com.company;

public class Human {
    String name;
    String eveColor;
    int weight;
    int age;

    public Human(String name, String eveColor, int weight, int age) {
        this.name = name;
        this.eveColor = eveColor;
        this.weight = weight;
        this.age = age;
    }

    public void sleep(){
        System.out.println( this.name + " Sleeping");
    }
    public void eat(){
        System.out.println(this.name + " eatiing");
    }
    public void run(){
        System.out.println(this.name + " running");
    }
}
