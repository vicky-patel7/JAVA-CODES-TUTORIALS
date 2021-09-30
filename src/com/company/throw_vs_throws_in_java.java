package com.company;
import java.util.Scanner;
class NegRadiusException extends Exception {
    public String toString() {
        return "Radius cannot be negative!";
    }
}

public class throw_vs_throws_in_java {
    public static double area(int r) throws NegRadiusException {
        if (r < 0) {
            throw new NegRadiusException();
        }
        return Math.PI * r * r;
    }

    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a and b:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            int result = divide(a, b);
            System.out.println("The result of a/b is " + result);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Enter the value of radius:");
        int r = sc.nextInt();
        try {
            double ar = area(r);
            System.out.println("The area of circle is "+ ar);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
