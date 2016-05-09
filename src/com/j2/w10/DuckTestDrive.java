package com.j2.w10;

public class DuckTestDrive{
  public static void main(String[] args){
   WildTurkey turkey = new WildTurkey();
   TurkeyAdapter ta = new TurkeyAdapter(turkey);
   //ta.quack();-->compil time==run time
   testDuck(ta);
  }
  static void testDuck(Duck duck){
   duck.quack(); 
   duck.fly();
  }
}