package com.company;
import java.util.Scanner;

public class KM_MILES_Conversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in km");
        float km = sc.nextFloat();
        float mile = 0.625f*km;
        System.out.println("The distance in mile will be  " + mile);
    }


}