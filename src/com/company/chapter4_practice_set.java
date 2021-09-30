package com.company;
import java.util.Scanner;
public class chapter4_practice_set {
    public static void main(String[] args) {

        //Problem 1:
//
//        int a=10;
//        if(a=11) {
//            System.out.println("I am 11");
//        }
//            else
//            System.out.println("I am not 11");
        //This program will throw an error bcz of if condition
        //there we cannot use assign operator


        //Problem2:
        /*
        Write a program to find weather a student is passed or failed.
        It requires total 40% and at least 33% in each subject to pass.
        assume 3 subjects and take marks as an input from the user.
         */

//        Scanner cs = new Scanner(System.in);
//        int m1,m2,m3;
//        float avg;
//        System.out.println("Enter the Physics subject marks\n");
//        m1 = cs.nextByte();
//        System.out.println("Enter the Mathematics subject marks\n");
//        m2 = cs.nextByte();
//        System.out.println("Enter the Science subject marks\n");
//        m3 = cs.nextByte();
//        avg = (m1+m2+m3)/3f;
//        if (m1>33 && m2>33 && m3>33 && avg>40){
//            System.out.println("You have passed the examination\n");
//        }
//        else
//            System.out.println("You failed...Try to improve");

        //Problem3:
        /*
        Calculate income tax paid by an employee to the government as per
        the slots mentioned below
        IncomeTax-Slab           Tax
        2.5L-5.0L                5%
        5.0L-10.0L               20%
        Above 10.0L              30%
         */
//        Scanner sc = new Scanner(System.in);
//        float amnt, tax=0;
//        System.out.println("Enter the amount you earn in LACS.");
//        amnt = sc.nextFloat();
//        if (amnt<=2.5){
//            tax = 0;
//        }
//        else if (amnt>2.5 && amnt<=5.0){
//            tax = (amnt-2.5f) * (0.05f);
//            System.out.println(tax);
//        }
//        else if(amnt>5.0 && amnt <= 10.0){
//            tax = ((amnt-5.0f)*0.2f)+(2.5f*0.05f);
//            System.out.println(tax);
//        }
//        else if (amnt>10.0){
//            tax = ((amnt-10.0f)*0.3f)+(5.0f*0.2f)+(2.5f*0.05f);
//        }
//        System.out.println("Tax calculated as per entered amount is:"+ tax);


        //Problem 4:
        /*
        Write a java program to find day of the week of the given number as 1 for Monday 2 for Tuesday and so on...
        */

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the day number:");
//        System.out.println("Notice: The day here in program starts with Monday");
//        int day = sc.nextInt();
//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//
//        }

        //Problem 5:
        /*
        Find whether the entered year by the user is leap year or not.
         */
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the year to check if it is a leap year or not");
//        int yr = sc.nextInt();
//        if (yr%400==0 || yr%4==0){
//            System.out.println("The year entered is a leap year");
//        }
//        else {
//            System.out.println("The year is not a leap year");
//        }

        //Problem 6:
        /*
        Check whether a website is commercial, organizational or indian website.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the full URL");
        String website = sc.next();
        if (website.endsWith(".com")){
            System.out.println("THe website is a Commercial website");
        }

        else if (website.endsWith(".org")) {
            System.out.println("THe website is a Organizational website");
        }

        else if (website.endsWith(".in")) {
            System.out.println("THe website is a Indian website");
        }
    }
}
