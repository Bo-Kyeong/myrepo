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
    Beverage sc = new Caramel(s);
    Beverage scw = new Whip(sc);
    System.out.println(smw.getDescription());
    System.out.println("$"+smw.cost());
    System.out.println(scw.getDescription());
    System.out.println("$"+scw.cost());
    
    Beverage b4 = new HouseBlend();
    Beverage m = new Milk(b4);
    Beverage mm = new Mocha(m);
    Beverage mmw = new Whip(mm);
    Beverage mc = new Caramel(m);
    Beverage wmc = new Whip(mc);
    System.out.println(smw.getDescription());
    System.out.println("$"+mmw.cost());
    System.out.println(wmc.getDescription());
    System.out.println("$"+wmc.cost());
  }
}






