package com.driver;
import java.util.*;
public class Main {
public static class Product{
    public static void product(int x, int y) {
    System.out.println(x*y);
    }
    public static void product(int x, int y, int z) {
    System.out.println(x*y*z);
    }
     public static void product(double a, double b) {
    System.out.println(a*b);
     } 
    
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int x,y,z;
   double a,b;
   Product p=new Product();
  
   x=sc.nextInt();
   y=sc.nextInt();
   z=sc.nextInt();
   a=sc.nextDouble();
   b=sc.nextDouble();
    p.product(x,y);
    p.product(x,y,z);
    p.product(a,b);  
  }
}
