package com.j2.w15;
import java.rmi.*;
import java.rmi.server.*;
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote{
  //final static int SOLD_OUT=0;
  State soldOutState;
  //final static int NO_QUARTER=1;
  State noQuarterState;
  //final static int HAS_QUARTER=2;
  State hasQuarterState;
  //final static int SOLD=3;
  State soldState;
  
  //int state=SOLD_OUT;
  State state = soldOutState;
  int count =0;
  String location;
  
  public GumballMachine(String location, int numberGumballs) throws RemoteException {
    soldOutState = new SoldOutState(this);
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldState(this);
    this.count=count;
    
    if(count>0){
    //state=NO_QUARTER;
      state=noQuarterState;
    }
  }
   public void insertQuarter(){
   state.insertQuarter(); 
  }
   public void ejectQuater(){
   state.ejectQuarter(); 
  }
   public void turnCrank(){
   state.turnCrank();
   state.dispense();
  }
   public void outOfOrder(){
   state.outOfOrder(); 
  }
   int getCount(){
    return count; 
   }
  public void setState(State state){
   this.state=state; 
  }
  
  public State getState(){
   return state; 
  }
  public State getSoldOutState(){
   return soldOutState; 
  }
  public State getNoQuarterState(){
   return noQuarterState; 
  }
  public State getHasQuarterState(){
   return hasQuarterState; 
  }
  public State getSoldState(){
   return soldState; 
  }
}