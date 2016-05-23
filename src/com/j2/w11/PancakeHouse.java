package com.j2.w11;
import java.util.ArrayList;

public class PancakeHouse{
 //static final int MAX_ITEMS=3;
 //MenuItem[] menuItems;
  ArrayList menuItems;
  public PancakeHouse(){
  //menuItems = new MenuItem[MAX_ITEMS];
   addItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad", false, 3.29);
 }
 public void addItem(String name, String description, boolean v, double p){
  MenuItem menuItem=new MenuItem(name, description,v,p);
  //if(nemberOfItems>=MAX_ITEMS){
   //System.out.println("Error"); 
  //}else{
   //menuItems[0] = menuItem;
   //numberOfItems = numberOfItems + 1; 
  //}
  menuItems.add(menuItem);
 }
}