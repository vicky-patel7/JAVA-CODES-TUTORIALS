package com.company;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Suppose we have to represent marks of 10 students. then we have basically 2 methods
        1. making 10 variable
        2. using array of size 10(recommended)
         */
        int[]marks= new int[5];
        /*
        int []marks = new int [5];  --> declaration and memory allocation

        is same as

        int marks[];     --> declaration
        marks = new int[5];  --> memory allocation

        is same as

        int [] marks = {1,2,3,45,5}  --> declaration and initialization

         */
        marks[0]=20;
        marks[1]=60;
        marks[2]=90;
        marks[3]=92;
        marks[4]=85;
//        marks[5]=95; --> throws an error in java
        System.out.println(marks[3]);

        /*
        Finding length of the array
         */
        int l = marks.length;
        System.out.println(l);

        /*
        Displaying array using for loop
         */
        for (int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }

            /*
            Write a JAVA program to print the elements of array in reverse order
             */
        for (int j = marks.length-1; j>=0; j-- ){
            System.out.println(marks[j]);
        }
        /*
        This is for each loop
        can be used for printing each elements
         */
        for (int element:marks){
            System.out.println(element);
        }

        /*
        Declaration of 2D array

         */
        int [][]flats = new int[2][3];
        flats[0][0] = 100;
        flats[0][1] = 101;
        flats[0][2] = 102;
        flats[1][0] = 200;
        flats[1][1] = 201;
        flats[1][2] = 202;
        for (int m = 0; m<2; m++ ){
            for (int n = 0; n<3; n++){
                System.out.println(flats[m][n]);
            }
        }

    }
}
