package com.company;
import java.util.Scanner;
public class Sum_Three_Nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        float a = sc.nextFloat();
        System.out.println("Enter the first number");
        float b = sc.nextFloat();
        System.out.println("Enter the first number");
        float c = sc.nextFloat();
        float d=a+b+c;
        System.out.println("the sum of the numbers is " +d);
    }
}
