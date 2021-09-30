package com.company;
import java.util.Scanner;
public class IntOrNotCheck {
    public static void main(String[] args) {
        System.out.println("Enter any number to check whether it is an integer or not(True for yes it is integer)");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());

    }
}
