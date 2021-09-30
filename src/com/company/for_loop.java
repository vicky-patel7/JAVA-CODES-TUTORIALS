package com.company;
import java.util.Scanner;
public class for_loop {
    public static void main(String[] args) {
        //Write a program to print first n odd numbers using for loop
        Scanner sc = new Scanner(System.in);
//        System.out.println("How many first odd number you want to get?");
//        int n = sc.nextByte();
//        for (int i = 1; i <= n*2; i++){
//            if (i%2!=0){
//                System.out.println(i);
//            }
//        }
        //Write a program to print first n natural numbers in reverse order
        System.out.println("How many first natural numbers do you want in reverse order?");
        int n = sc.nextByte();
        for (int i = n; i != 0; i --){
            System.out.println(i);
        }

    }
}
