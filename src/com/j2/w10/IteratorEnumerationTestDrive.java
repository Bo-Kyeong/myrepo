package com.j2.w10;
import java.util.*;
public class IteratorEnumerationTestDrive{
  public static void main (String[] args){
   ArrayList I = new ArrayList(Arrays.asList(args));
   Enumeration enumeration = new IteratorEnumeration(I.iterator());
   while (enumeration.hasMoreElements()){
    System.out.println(enumeration.nextElement()); 
   }
  }
}