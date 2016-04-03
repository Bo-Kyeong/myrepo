package com.j2.w4;

class Mocha extends CondimentDecorator{
  Beverage beverage;
  public Mocha(Beverage b){
    beverage=b;
  }
  public String getDescription(){
    return beverage.getDescription()+".Mocha";
  }
  public double cost(){
    return beverage.cost()+.20;
  }
}