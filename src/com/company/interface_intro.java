package com.company;

//creating interface class
//interface is a group of methods
interface Bicycle {
    //by default int defined variable is final and cannot be modified from main method
    int num = 100;
    void applyBreak(int decrement);
    void speedUp(int increment);
}

interface movie{
    void whistle();
    void movie_name();
}
//any class which is implementing interface class should must define the abstract methods
//defined in the interface class


//we can implements one or more methods at once but the main and important point is that all the
//abstract methods defined in interface class should be defined in the implemented class
class BajajCycle implements Bicycle, movie{
//    methods should be declared as public
    void blowHorn(){
        System.out.println("Blowing Horn");
    }
    public void applyBreak(int decrement){
        System.out.println("Applying break");
    }
    public void speedUp(int increment){
        System.out.println("Speeding up the bicycle");
    }
    public void whistle(){
        System.out.println("Blowing Whistle......");
    }
    public void movie_name(){
        System.out.println("Gravity");
    }
}

public class interface_intro {
    public static void main(String[] args) {
         //class created for interaction
        //here implements keyword is used for instead of extends

        //creating an object
        BajajCycle b = new BajajCycle();
        b.blowHorn();
        b.applyBreak(3);
        System.out.println(b.num);
        b.whistle();

        //we cannot modify properties which are already defined in interface classes
//        b.num = 90; //this will throw an error
    }
}
