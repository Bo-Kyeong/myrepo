package com.j2.w14;

public interface State{
 public void insertQuarter();
 public void ejectQuarter();
 public void turnCrank();
 public void dispense();
 public void outOfOrder();
}