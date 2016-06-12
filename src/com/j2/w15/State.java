package com.j2.w15;
import java.io.*;
  
public interface State extends Serializable {
 public void insertQuarter();
 public void ejectQuarter();
 public void turnCrank();
 public void dispense();
}