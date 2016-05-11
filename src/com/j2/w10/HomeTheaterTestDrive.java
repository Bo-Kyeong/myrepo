package com.j2.w10;

public class HomeTheaterTestDrive{
  public static void main(String[] args){
   Amplifier amp = new Amplifier("Amplifier");
   Tuner tuner = new Tuner("AM/FM Tunter",amp);
   DvdPlayer dvd = new DvdPlayer("DVD Player",amp);
   Projector projector = new Projector("Projector",dvd);
   
   HTFacade ht = new HTFacade(amp,tuner,dvd,projector);
   ht.watchMovie("My Movie Watching...");
   ht.endMovie();
  }
}