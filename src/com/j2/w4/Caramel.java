package com.j2.w4;

public class Caramel extends CondimentDecorator{
  Beverage beverage;
  public Caramel(Beverage b){
    beverage = b;
  }
  public String getDescription(){
    return beverage.getDescription()+",Caremel";
  }
  public double cost(){
    return .50+beverage.cost();
  }
}