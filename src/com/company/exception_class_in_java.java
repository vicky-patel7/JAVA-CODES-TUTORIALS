package com.company;

import java.util.Scanner;

class MyExp extends Exception{
    public String toString(){
        return super.toString() + " I am to String()";
    }
    public String getMessage(){
        return super.getMessage() + " I am getMessage()";
    }
}
public class exception_class_in_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<9) {
            try {
                throw new MyExp();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("Finished");
            }
        }
    }
}
