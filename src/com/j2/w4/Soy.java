package com.j2.w4;

public class Soy extends CondimentDecorator{
  Beverage beverage;
  public Soy(Beverage b){
    beverage = b;
  }
  public String getDescription(){
    return beverage.getDescription()+", Soy";
  }
  public double cost(){
    return .15+beverage.cost();
  }
}