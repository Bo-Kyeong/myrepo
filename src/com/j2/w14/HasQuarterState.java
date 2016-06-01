package com.j2.w14;

public class HasQuarterState implements State{
 GumballMachine gumballMachine;
 public HasQuarterState(GumballMachine gumballMachine){
  this.gumballMachine = gumballMachine; 
 }
 public void insertQuarter(){
  System.out.println("You cannot insert another quarter"); 
 }
 public void ejectQuarter(){
  System.out.println("Quarter returned");
  gumballMachine.setState(gumballMachine.getNoQuarterState());
 }
 public void turnCrank(){
  System.out.println("You turned...");
  gumballMachine.setState(gumballMachine.getSoldState());
 }
 public void dispense(){
  System.out.println("No gumball dispensed"); 
 }
 public void outOfOrder(){
  System.out.println("Wrong coin");
  gumballMachine.setState(gumballMachine.getNoQuarterState());
 }
}