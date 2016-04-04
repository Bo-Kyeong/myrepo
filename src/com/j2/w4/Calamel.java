package com.j2.w4;

public class Caramel extends CondimentDecorator{
  Beverage beverage;
  public Calamel(Beverage b){
    beverage = b;
  }
  public String getDescription(){
    return beverage.getDescription()+",Calemel";
  }
  public double cost(){
    return .50+beverage.cost();
  }
}