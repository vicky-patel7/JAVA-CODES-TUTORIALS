package com.company;
import java.util.Scanner;
public class recursion {
        //Calculating factorial of a given number
    static int fact(int a){
        if (a==0||a==1){
            return 1;
        }
        else{
            return a*fact(a-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int factorial = 1;
        System.out.println("Enter a number to calculate factorial");
        int n = sc.nextByte();
        factorial = fact(n);
        System.out.println(factorial);
    }
}
