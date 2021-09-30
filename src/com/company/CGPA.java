package com.company;

import java.util.Scanner;
public class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculating CGPA based on score in five subjects");
        System.out.println("Enter the marks in 1 st subject");
        float a = sc.nextFloat();
        System.out.println("Enter the marks in 2nd st subject");
        float b = sc.nextFloat();
        System.out.println("Enter the marks in 3rd subject");
        float c = sc.nextFloat();
        System.out.println("Enter the marks in 4th subject");
        float d = sc.nextFloat();
        System.out.println("Enter the marks in 5th subject");
        float e = sc.nextFloat();
        float f = (a+b+c+d+e)/50f;
        System.out.println("The CGPA of the student is:");
        System.out.println(f);


    }
}
