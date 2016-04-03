package com.j2.w4;

public class StarbuzzCoffee{
  public static void main(String args[]){
    Beverage b1 = new Espresso();
    System.out.println(b1.getDescription());
    System.out.println("$"+b1.cost());
    
    Beverage b2 = new DarkRoast();
    Beverage md = new Mocha(b2);
    Beverage wmd = new Whip(md);
    System.out.println(wmd.getDescription());
    System.out.println("$"+wmd.cost());
    
    Beverage b3 = new HouseBlend();
    Beverage s = new Soy(b3);
    Beverage sm = new Mocha(s);
    Beverage smw = new Whip(sm);
    System.out.println(smw.getDescription());
    System.out.println("$"+smw.cost());
  }
}






