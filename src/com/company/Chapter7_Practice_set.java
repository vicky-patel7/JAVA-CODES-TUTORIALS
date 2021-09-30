package com.company;
import java.util.Scanner;
public class Chapter7_Practice_set {

    // Problem 1:
        /*
        Write a program to print the multiplication table of a number
         */

    static void multiplication(int num){
        for (int i = 1; i <= 10; i++){
            System.out.printf("%d X %d = %d\n", num, i, num*i);
        }
    }

    //Problem 2:
    /*
    Printing star pattern in increasing order
     */
    static void star_pattern (int a){
        for (int i = 0; i < a; i++){
            for (int j = 0; j<=i; j++){
                System.out.print("*\t");
            }
            System.out.print("\n");
        }
    }

    //Problem 3:
    /*
    Recursive function to calculate the sum of n natural number
     */
    static int sum(int n){
        if (n!=0) {
            return n + sum(n - 1);
        }
        else
            return 0;
    }

    //Problem 4:
    /*
    A  function to print nth term of fibonacci series number
     */

    static int fibbo(int term){
        if (term==1 || term == 2){
            return term-1;
        }
        else {
            return fibbo(term - 1) + fibbo(term - 2);
        }
    }

    //Problem 5:
    /*
    Write a function to find the average of a set of number passed as argument
     */
    static float average(int ...args){
        float avg = 0;
        for (int i = 0; i<args.length; i++){
            avg = avg + args[i];
        }
        avg = avg/(args.length);
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 8;
        multiplication(8);

        star_pattern(5);

        int result = sum(10);
        System.out.println(result);

        System.out.println("Enter the nth term to get fibonacci number");
        int a = sc.nextByte();
        int result2 = fibbo(a);
        System.out.printf("The %d th term of the fibonacci series is %d\n", a, result2);

        System.out.println("The average of the numbers is "+ average(1,2,3,4,5,6,7,8,9,10));
    }
}
