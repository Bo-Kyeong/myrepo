package com.j2.w14;

public class NoQuarterState implements State{
 GumballMachine gumballMachine;
 public NoQuarterState(GumballMachine gumballMachine){
  this.gumballMachine = gumballMachine; 
 }
 public void insertQuarter(){
  System.out.println("You cannot insert another quarter"); 
  gumballMachine.setState(gumballMachine.getHasQuarterState());
 }
 public void ejectQuarter(){
  System.out.println("Quarter returned");
  
 }
 public void turnCrank(){
  System.out.println("You turned...");
 
 }
 public void dispense(){
  System.out.println("No gumball dispensed"); 
 }
 public void outOfOrder(){
  System.out.println("Wrong coin"); 
 }
}