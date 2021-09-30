package com.company;

import java.util.Scanner;

public class Chapter6_practice_Set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Problem 1:
        /*
        Create an array of five float and calculate their sum
         */
//        float [] marks = {3.4f, 45.7f, 67.4f, 68.67f, 90.89f};
//        float sum = 0;
//        for(int i = 0; i < marks.length; i++){
//            sum = sum + marks[i];
//        }
//        System.out.println(sum);


        //Problem 2:
        /*
        Write a program to find out whether a given integer is present in an array or not
         */
//        int num[] = {1,2,3,4,5,6,7,8,9};
//        System.out.println("Enter a number to find in the array");
//        int number = sc.nextByte();
//        for (int i = 0; i < num.length; i++){
//            if (number==num[i]){
//                System.out.println("matched");
//            }
//        }

        //Problem 3:
        /*
        Calculate the average marks from an array containing marks of all students in Physics using for each loop
         */
//        float sum = 0;
//        System.out.println("Enter the number of students");
//        int std = sc.nextByte();
//        int []mark = new int[std];
//        for (int i = 0; i < std; i++){
//            System.out.printf("Enter the marks of student %d\n", i);
//            mark[i] = sc.nextByte();
//            sum = sum + mark[i];
//        }
//        float avg = sum/std;
//        System.out.printf("The average value of the marks in Physics entered of all students is %f", avg);


        //Problem 4:
        /*
        Create a JAVA program to add two 2x3 matrices
         */
//        int [][]m1 = {{2,3,4},
//                      {2,5,8}};
//        int [][]m2 = {{4,7,2},
//                      {9,0,2}};
//        int [][]m3 = {{0,0,0},
//                      {0,0,0}};
//
//        for (int i = 0; i< m1.length; i++){
//            for (int j =0; j<m1[i].length; j++){
////                System.out.format("Setting value for i = %d and j = %d\n", i, j);
//                m3[i][j] = m1[i][j]+m2[i][j];
//                System.out.printf("%d\t", m3[i][j]);
//            }
//            System.out.println("\n");
//        }

        //Problem 5:
        /*
        Write a JAVA program to reverse an array
         */
        int []arr = {1,2,3,4,5,6,7,8,9,0};
//            System.out.println("Array in the given order");
//        for (int i = 0; i < arr.length; i++ ) {
//            System.out.println(arr[i]);
//        }
//            System.out.println("Array in the reverse order");
//        for (int i = arr.length-1; i>=0; i--){
//            System.out.println(arr[i]);
//        }
//        int temp;
//        for (int i = 0; i < arr.length; i++){
//            temp = arr[i];
//            arr[i] = arr[arr.length-i-1];
//            arr[arr.length-i-1] = temp;
//        }
//        for (int element :
//                arr) {
//            System.out.println(element + " ");
//        }

        //Problem 6:
        /*
        write a JAVA program to find maximum element in an array
         */
        int max = 0;
        for (int e :
                arr) {
            if (e > max) {
                max = e;
            }
            }
        System.out.println("The value of the maximum element in this array is "+ max);

    }
}
