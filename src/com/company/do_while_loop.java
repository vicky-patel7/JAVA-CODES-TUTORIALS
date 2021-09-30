package com.company;
import java.util.Scanner;
public class do_while_loop {
    public static void main(String[] args) {
        //Printing first n natural numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number till you want to get natural number");
        int n = sc.nextByte();
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }while (i<=n);
    }
}
