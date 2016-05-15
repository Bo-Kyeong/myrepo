package com.j2.w10;

public class HomeStudyTestDrive {
    public static void main(String[] args) {
        Book book = new Book("My Book");
        Pen pen = new Pen("My Pen", book);
        Tutor tu = new Tutor("My Tutor", book);
        Computer com = new Computer("My Computer", tu);
 
        HomeStudyFacade homeStudy = new HomeStudyFacade(book, pen, tu, com);
        homeStudy.startStudy("Start Studying ..");
        homeStudy.endStudy();
    }
}