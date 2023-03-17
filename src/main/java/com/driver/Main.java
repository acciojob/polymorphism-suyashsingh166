package com.driver;
import java.util.*;
public class Main {
  public class Product{
    public int product(int x, int y) {
    return x*y;
    }
    public int product(int x, int y, int z) {
    return x*y*z;
    }
     public double product(double x, double y) {
     return x*y;
     }
    
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
   Product p=new Product();
    int x=sc.nextInt();
    int y=sc.nextInt();
    int z=sc.nextInt();
    double x=sc.nextDouble();
    double y=sc.nextDouble();
    p.product(x,y);
    p.product(x,y,z);
    p.product(x,y);
  }
  

}
