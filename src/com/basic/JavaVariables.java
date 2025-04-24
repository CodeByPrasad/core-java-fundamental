package com.basic;

 class JavaVariables {
     //global area
     int a = 10;   //global variable
public static int r = 30;   //static variable || accessed
    public static void main(String[] args) {
         int c = 30;
        System.out.println(c);
        JavaVariables obj = new JavaVariables();
        obj.display();
        System.out.println(r);
    }
     void display(){
          int b = 20;  //local variable
         System.out.println(b);
         System.out.println(a);
         System.out.println(r);
     }
}


