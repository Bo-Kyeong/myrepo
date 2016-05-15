package com.j2.w10;

public class Tutor {
    String description;
    Book book;
    String study;
 
    public Tutor(String description, Book book) {
        this.description = description;
        this.book = book;
    }
    public void in() {
        System.out.println(description + " in");
    }
    public void out() {
        System.out.println(description + " out");
    }
    
    public void play(String study) {
        this.study = study;
        System.out.println(description + " playing \"" + study + "\"");
    }
    public void stop() {
        System.out.println(description + " stopped \"" + study + "\"");
    }
    public String toString() {
        return description;
    }
}