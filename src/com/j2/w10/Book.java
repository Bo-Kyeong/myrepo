package com.j2.w10;

public class Book {
    String description;
    Pen pen;
    Tutor tu;
    public Book(String description) {
        this.description = description;
    }
    public void open() {
        System.out.println(description + " open");
    }
    public void close() {
        System.out.println(description + " close");
    }
    public void setTutor(Tutor tu) {
        System.out.println(description + " setting for study" + tu);
        this.tu = tu;
    }
    public void setPen(Pen pen) {
        System.out.println(description + " setting pen to " + tu);
        this.pen = pen;
    }
    public void setPage(int pg) {
        System.out.println(description + " setting page to " + pg);
    }
    public String toString() {
        return description;
    }
}