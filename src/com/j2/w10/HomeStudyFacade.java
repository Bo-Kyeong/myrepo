package com.j2.w10;

public class HomeStudyFacade {
    private Book book;
    private Pen pen;
    private Tutor tu;
    private Computer com;
 
    public HomeStudyFacade(Book book, Pen pen, Tutor tu, Computer com) {
        this.book = book;
        this.pen = pen;
        this.tu = tu;
        this.com = com;
    }
 
    public void startStudy(String study) {
        System.out.println("Get ready to study...");
        com.on();
        com.wideScreenMode();
        book.open();
        book.setTutor(tu);
        book.setPage(5);
        tu.in();
        tu.play(study);
    }
    public void endStudy() {
        System.out.println("End studying...");
        com.off();
        book.close();
        tu.stop();
        tu.out();
    }
    public void startELearn(double frequency) {
        System.out.println("Start ELearning...");
        pen.grip();
        pen.setFrequency(frequency);
        book.open();
        book.setPage(5);
        book.setPen(pen);
    }
    public void endELearn() {
        System.out.println("End ELearning...");
        pen.release();
        book.close();
    }
}