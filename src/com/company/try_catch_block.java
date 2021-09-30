package com.company;


import java.util.Scanner;

public class try_catch_block {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            int c = a/b;
            System.out.println("The result is "+ c);
        }
        catch (Exception e){
            System.out.println("We failed to divide. Reason: ");
            System.out.println(e);
       }
    }
}
