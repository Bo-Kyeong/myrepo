package com.j2.w15;
import java.rmi.*;

public class GumballMachineTestDrive {
 
 public static void main(String[] args) {
  GumballMachineRemote gumballMachine = null;
  int count;

  if (args.length < 2) {
   System.out.println("error");
    System.exit(1);
  }

  try {
   count = Integer.parseInt(args[1]);

   gumballMachine = 
    new GumballMachine(args[0], count);
   Naming.rebind("rmi://" + args[0] + "/gumballmachine", gumballMachine);
  } catch (Exception e) {
   e.printStackTrace();
  }
 }
}