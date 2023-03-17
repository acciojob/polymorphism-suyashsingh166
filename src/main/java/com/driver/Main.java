package com.driver;
import java.util.*;
public class Main {
public static class Product{
    public static int product(int x, int y) {
    return x*y;
    }
    public static int product(int x, int y, int z) {
    return x*y*z;
    }
     public static double product(double a, double b) {
    return a*b;
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
