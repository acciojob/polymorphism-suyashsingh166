package com.driver;
import java.util.*;
public class Main {
static class Product{

    public static void prod(int x, int y) {
    System.out.println(x*y);
    }
    public static void prod(int x, int y, int z) {
    System.out.println(x*y*z);
    }
     public static void prod(double a, double b) {
    System.out.println(a*b);
     } 
    
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int x,y,z;
   double a,b;
  
   x=sc.nextInt();
   y=sc.nextInt();
   z=sc.nextInt();
   a=sc.nextDouble();
   b=sc.nextDouble();
    Product.prod(x,y);
    Product.prod(x,y,z);
    Product.prod(a,b);
   
  }
}
