package com.company;
import java.util.Scanner;
public class Chapter2_Practice_Set {
    public static void main(String[] args) {
        //Problem 1.
        /*
        What will be the result of the following expression
         float a= 7/4 * 9/4
          */

        // float a = 7/4*9/4;
        // This will give output as 2.0 bcz of Associative compilation in java language
        // System.out.println(a);


        //Problem 2:
        /*Write a java program to encrypt a grade by adding 8 to it.
        Decrypt it to show the correct grade*/
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the grade in capital letter as A,B,C,D... ");

        //Encrypting the grade
       // char grade = 'B';
       // grade = (char)(grade + 8);
       // System.out.println(grade);
       // Decrypting the grade
       // grade = (char)(grade - 8);
       // System.out.println(grade);


        //Problem 3:
        /*Use comparison operators to find out whether a given number is greater than the user entered
        or not
         */
       // Scanner sc = new Scanner(System.in);
       // System.out.println("Enter the number ");
       // int a = sc.nextInt();
       // System.out.println(a>8);

        //Problem 4:
        /*Write the following expression in a java program
        (v^2-u^2)2*s
         */
        //(v*v-u*u)/(2*s);

        //Problem 5:
        /*
        Find the value of the following expression
        int x =7;
         int a = 7*49/7+35/7;
         */

        int x = 7;
        int a = 7*49/7+35/7;
        System.out.println(a);

    }
}
