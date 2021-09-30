package com.company;

//Problem 1, 2 & 3:
//Creating a class Cylinder and use getters and setters to set its radius and height
class Cylinder {
    private float height;
    private float radius;

    public float getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float volume() {
//        float vol = 3.14f*radius*radius*height;
//        return vol;
        return 3.14f * radius * radius * height;
    }

    public float curvedArea() {
//        float ca = 2*3.14f*radius*height;
//        return ca;
        return 2 * 3.14f * radius * height;
    }

    public float totalArea() {
//        float ca = 2*3.14f*radius*height;
//        float cirarea = 3.14f*radius*radius;
//        return ca+cirarea;
        return (2 * 3.14f * radius * height) + (3.14f * radius * radius);
    }

    public Cylinder() {
        height = 3;
        radius = 4;
    }
}

//Problem 4:
/*
Overload a constructor used to initialize a rectangle of length 4 and breadth 5
for using custom parameters
 */
class secRectangle {
    private int l;
    private int b;

    //This is constructor and overloading of the constructor
    public secRectangle() {
        l = 5;
        b = 8;
    }

    public secRectangle(int m, int n) {
        l = m;
        b = n;
    }

    public secRectangle(int m) {
        l = m;
        b = 10;
    }

    //setting area of the rectangle function
    public int rectangleArea() {
        return l * b;
    }

    //getters and setters function
    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}

//Problem 5:
/*
Repeating steps done for question 1 for the sphere

 */
class Sphere {
    private float radius;

    public Sphere() {
        radius = 1;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double volume() {
        return 4 / 3 * Math.PI * radius * radius * radius;
    }

    public double curvedArea() {
        return 4 * Math.PI * radius * radius;
    }
}

public class Chapter9_Practice_Set {
    public static void main(String[] args) {

        Cylinder cl = new Cylinder();
        cl.setHeight(1);
        cl.setRadius(1);
        //Calculating surface area and volume of the cylinder
        System.out.println("The total surface area of the cylinder is " + cl.totalArea());
        System.out.println("The curved surface area is " + cl.curvedArea());
        System.out.println("The volume of the cylinder is " + cl.volume());

        secRectangle rc = new secRectangle(5); // here we can pass one or two arguments
        //for a single argument breadth value has default set to 10
        //if no argument is passed and also not set any value for l and b we get the default value set in the constructor
        rc.setB(45);
        rc.setL(2);
        System.out.println("The area of the rectangle is " + rc.rectangleArea());


        Sphere sp = new Sphere();
        System.out.println("The volume of the sphere is " + sp.volume());
        System.out.println("The total surface area of the sphere is " + sp.curvedArea());

    }
}
