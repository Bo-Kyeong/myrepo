package com.j2.w6;

public abstract class Pizza{
 String name;
 void prepare(){
   System.out.println("Preparing"+name);
 }
 void bake(){
   System.out.println("Baking...");
 }
 void cut(){
   System.out.println("cutting...");
 }
 void box(){
   System.out.println("Boxing...");
 }
 public String getName(){
   return name;
 }
   
}