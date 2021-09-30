package com.company;

import java.util.Scanner;
public class Percentage_cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1");
        int a = sc.nextInt();
        System.out.println("Enter the number2");
        int b = sc.nextInt();
        System.out.println("Enter the number3");
        int c = sc.nextInt();
        System.out.println("Enter the number4");
        int d = sc.nextInt();
        System.out.println("Enter the number5");
        int e = sc.nextInt();
        float f = (a+b+c+d+e)/5f;
        System.out.println("The percentage is:");
        System.out.println(f);


    }
}
