package com.company;

class Phone {
    public void greet() {
        System.out.println("Hello! Good Morning");
    }

    public void main() {
        System.out.println("This is main function of class one");
    }
}

class Smartphone extends Phone {
    @Override
    public void main() {
        System.out.println("This is main function of class two");
    }

    public void greetings() {
        System.out.println("Hello Bryn! Welcome to New York");
    }
}

public class dynamic_method_dispatch {
    public static void main(String[] args) {
        Phone obj1 = new Phone();  //Allowed
        Smartphone obj2 = new Smartphone();  // This is also allowed for creating a object
        Phone obj4 = new Smartphone();  // This is also allowed
        //Smartphone obj3 = new Phone(); //This is not allowed in Java for object creation
         /*
         This is all because a simple phone cannot be called as a smartphone
         however a smartphone can be called a phone in general
         logic is that
         we can create an object of super class equal to reference class but in reverse we cannot
         this can also be understand as class extension properties
         if there is methods overrides then in that case methods of object created class
         will gain priority over the reference class
        */
        obj1.main();
        obj2.main();
        obj4.main();
    }
}

