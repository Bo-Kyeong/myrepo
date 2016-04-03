package com.j2.w4;

class Whip extends CondimentDecorator{
  Beverage beverage;
  public Whip(Beverage b){
    beverage = b;
  }
  public String getDescription(){
    return beverage.getDescription()+".Whip";
  }
  public double cost(){
    return beverage.cost()+.10;
  }
}