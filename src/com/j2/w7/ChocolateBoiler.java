package com.j2.w7;

public class ChocolateBoiler{
 private boolean empty;
 private boolean boiled;
 private static ChocolateBoiler uniqueInstance;
 
 private ChocolateBoiler(){
   empty=true;
   boiled=false;
 }
 public static ChocolateBoiler getInstance(){
   if(uniqueInstance == null){
    uniqueInstance = new ChocolateBoiler(); 
   }
   return uniqueInstance;
 }
 public void fill(){
   if(isEmpty()){
    empty=false;
    boiled=true;
   }
 }
 public boolean isEmpty() {
  return empty;
 }
 
}