package com.company;
import java.util.Scanner;
public class Greetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your good name");
        String name = sc.nextLine();
        System.out.println("Hello "+name+ " Have a wonderful day!!");
    }
}
