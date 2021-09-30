package com.company;
import java.util.Scanner;
import java.util.Random;   /* importing package for generating random number*/
public class random_number {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt();
        System.out.println(a);
    }
}
