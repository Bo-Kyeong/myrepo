package com.j2.w11;

public abstract class CaffeineBeverageWithHook{
  public void prepareRecipe(){
   boilWater();
   brew();
   pourInCup();
   if(customerWantsCondiments()){
    addCondiments(); 
   }
  }
  abstract void brew();
  abstract void addCondiments();
  void boilWater(){
   System.out.println("Boiling Water..."); 
  }
  void pourInCup(){
   System.out.println("Pouring into cup..."); 
  }
  boolean customerWantsCondiments(){
    return true;
  }
}