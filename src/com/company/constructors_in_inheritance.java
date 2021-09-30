package com.company;

/* the base class constructors or codes execute first and then derived classes
in its hierachy order..
we know constructors invoked automatically if not set any manually by default..
firstly the constructors of the defined object is called and then its parent is called..
 but on the final execution firstly base constructor is executed.

using super keyword we can call the constructors as per our wish */
class Base1 {

    //constructors
    Base1() {
        System.out.println("I am a constructor");
    }

    //overloading of the constructor
    Base1(int x) {
        System.out.println("I am an overloaded constructor with value of x as: " + x);
    }
}

class Derived1 extends Base1 {
    //constructor
    Derived1() {
        //super(0);  //a keyword to call constructors of its corresponding base class
        // having arguments if any
        System.out.println("I am a derived class constructor");
    }

    //overloading of the constructor
    Derived1(int x, int y) {
        super(x);
        System.out.println("I am an overloaded constructor of Derived with value of y as: " + y);
    }
}

class ChildOfDerived extends Derived1 {

    //constructor
    ChildOfDerived() {
        System.out.println("I am a child of derived constructor");
    }

    //overloading of the constructor
    ChildOfDerived(int x, int y, int z) {
        super(x, y);
        System.out.println("I am an overloaded constructor of Derived with value of z as: " + z);
    }
}

public class constructors_in_inheritance {
    public static void main(String[] args) {
        // Base1 b = new Base1();
        // Derived1 d = new Derived1();
        // Derived1 d = new Derived1(14, 9);
        // ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived cd = new ChildOfDerived(12, 13, 15);
    }
}
