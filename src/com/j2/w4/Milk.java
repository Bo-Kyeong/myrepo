package com.j2.w4;

public class Milk extends CondimentDecorator{
 Beverage beverage;
  public Milk(Beverage b){
    beverage = b;
  }
  public String getDescription(){
   return beverage.getDescription()+",Milk"; 
  }
  public double cost(){
   return .10+beverage.cost(); 
  }
}