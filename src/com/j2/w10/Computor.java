package com.j2.w10;

public class Computer {
    String description;
    Tutor tu;
    public Computor(String description, Tutor tu) {
        this.description = description;
        this.tu = tu;
    }
    public void on() {
        System.out.println(description + " on");
    }
    public void off() {
        System.out.println(description + " off");
    }
    public void wideScreenMode() {
        System.out.println(description + " in widescreen mode (16x9 aspect ratio)");
    }
    public String toString() {
        return description;
    }
}