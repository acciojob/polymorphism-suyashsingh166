package com.driver;
import java.util.*;
public class Main {
  
   
  public class Product{
    int x,y,z;
   double a,b;
     public Product(int x,int y,int z,double a,double b)
     {
       this.x=x;
       this.y=y;
       this.a=a;
       this.b=b;
     }
    public int product(int x, int y) {
    return x*y;
    }
    public int product(int x, int y, int z) {
    return x*y*z;
    }
     public double product(double x, double y) {
     return x*y;
     }
    
  
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
   Product p=new Product();
    
    p.product(x,y);
    p.product(x,y,z);
    p.product(a,b);
  }
}
}
