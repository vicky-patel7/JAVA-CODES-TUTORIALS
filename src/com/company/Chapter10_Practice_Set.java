package com.company;

import java.util.Scanner;

        //Problem 1 & 3:
        /*
        Create a class Circle and use inheritance to create another class Cylinder from it
        Create Methods of area and volume in problem 1
         */
class Circle {
    double area(float r) {
        return Math.PI * r * r;
    }
}

class cylinder extends Circle {
    double curved_area(float r, float h) {
        return 2 * Math.PI * r * h;
    }

    double area(float r) {
        return 2 * Math.PI * r * r;
    }

    double total_area(float r, float h) {
        return curved_area(r, h) + area(r);
    }

    double volume(float r, float h) {
        return Math.PI * r * r * h;
    }
}

        //Problem 2 & 4:
        /*
        Create a class Rectangle and use inheritance to create another class cuboid
        Try to keep it as close to real world as possible
        create methods for area and volume and also getters and setters
         */
class rectangle1 {
    public int l;
    public int b;
    public int h;
    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getB() {
        return b;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void setB(int b) {
        this.b = b;
    }
    int area(){
        return l*b;
    }
}
class cuboid extends rectangle1{

     int area(){
        return 2*l*b + 2*b*h + 2*h*l;
    }
    int volume(){
        return l*b*h;
    }
}
public class Chapter10_Practice_Set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //object for class or problem 1 & 3
//        Circle cr = new Circle();
//        cylinder cl = new cylinder();
//        float r = sc.nextFloat();
//        float h = sc.nextFloat();
//        System.out.println("The area of the circle is " + cr.area(r));
//        System.out.println("The base area of the cylinder is " + cl.area(r));
//        System.out.println("The curved area of the cylinder is " + cl.curved_area(r, h));
//        System.out.println("The total area of the cylinder is " + cl.total_area(r, h));
//        System.out.println("The volume of the cylinder is " + cl.volume(r, h));

        //object for rectangle and cuboid
//        cuboid cb = new cuboid(); //This will execute the methods of cuboid class
//        rectangle1 cb = new rectangle1();  //this will execute the methods of rectangle class
        rectangle1 cb = new cuboid();   //this will too execute the methods of the rectangle first
        cb.setL(2);
        cb.setB(2);
        cb.setH(2);
        System.out.println("The area of the rectangle "+ cb.area());
        //Problem 5:
        /*
        What is the order of constructor execution for the following inheritance heirarchy
        Base
        derived1
        derived2

        derived2 obj = new derived2();

        Which constructor(s) will be executed & in what order
         */
        //Answer
        //The methods of derived2 class will be executed
    }
}
