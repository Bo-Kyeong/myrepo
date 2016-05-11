package com.j2.w10;

public class Tuner {
   String description;
    Amplifier ampr;
    
 
    public Tuner(String description, Amplifier amp) {
        this.description = description;
    }
    public void on() {
        System.out.println(description + " on");
    }
    public void off() {
        System.out.println(description + " off");
    }
    
    public String toString() {
        return description;
    }
}