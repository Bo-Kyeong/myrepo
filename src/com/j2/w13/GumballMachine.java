package com.j2.w13;

public class GumballMachine{
  final static int SOLD_OUT=0;
  final static int NO_QUARTER=1;
  final static int HAS_QUARTER=2;
  final static int SOLD=3;
  
  int state=SOLD_OUT;
  int count =0;
  public GumballMachine(int count){
    this.count=count;
    if(count>0){
    state=NO_QUARTER;
    }
  }
  public void insertQuarter(){
    if(state == HAS_QUARTER){
      System.out.println("you cannot insert another quarter");
    }else if(state == NO_QUARTER){
      state=HAS_QUARTER;
      System.out.println("you insert another quarter");
    }else if(state == SOLD_OUT){
      System.out.println("you cannot insert. Sold out.");
    }else if(state == SOLD){
      System.out.println("wait. we hava already given a gumball");
    }
  }
  public void ejectQuarter(){
    if(state == HAS_QUARTER){
      state=NO_QUARTER;
      System.out.println("you cannot insert another quarter");
    }else if(state == NO_QUARTER){
      System.out.println("you insert another quarter");
    }else if(state == SOLD_OUT){
      System.out.println("you cannot insert. Sold out.");
    }else if(state == SOLD){
      System.out.println("wait. we hava already given a gumball");
    }
  }
  public void turnCrank(){
   if(state == HAS_QUARTER){
     state=SOLD;
      System.out.println("you cannot insert another quarter");
    }else if(state == NO_QUARTER){
      System.out.println("you insert another quarter");
    }else if(state == SOLD_OUT){
      System.out.println("you cannot insert. Sold out.");
    }else if(state == SOLD){
      System.out.println("wait. we hava already given a gumball");
    } 
  }
  public void dispense(){
   if(state == HAS_QUARTER){
      System.out.println("you cannot insert another quarter");
    }else if(state == NO_QUARTER){
      System.out.println("you insert another quarter");
    }else if(state == SOLD_OUT){
      System.out.println("you cannot insert. Sold out.");
    }else if(state == SOLD){
      System.out.println("wait. we hava already given a gumball");
      count = count-1;
      if(count==0){
        System.out.println("Oops, out of gumballs!");
        state = SOLD_OUT;
       } else {
           state = NO_QUARTER;
       }
      }
    } 
 }
