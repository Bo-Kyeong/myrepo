package com.j2.w5;

abstract public class Pizza{
  String name;
  
  public String getName(){
    return name;
  }
  public void prepare(){
    System.out.println("prepraring "+name);
  }
   public void bake(){
    System.out.println("baking "+name);
  }
    public void cut(){
    System.out.println("cutting "+name);
  }
     public void box(){
    System.out.println("boxing "+name);
  }
     
}