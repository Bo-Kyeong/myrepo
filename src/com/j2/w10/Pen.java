package com.j2.w10;

public class Pen {
    String description;
    Book book;
    double frequency;
 
    public Pen(String description, Book book) {
        this.description = description;
    }
    public void grip() {
        System.out.println(description + " grip");
    }
    public void release() {
        System.out.println(description + " release");
    }
    public void setFrequency(double frequency) {
        System.out.println(description + " setting frequency to " + frequency);
        this.frequency = frequency;
    }
    public String toString() {
        return description;
    }
}