package com.company;

abstract class Base{
    public Base(){
        System.out.println("Constructor in base class");
    }
    public void sayHello(){
        System.out.println("Hello base");
    }
    //abstract method can be implemented iin our way
    abstract public void greet(); //abstract method cannot be created in non-abstracted class
}
/*
abstract class should only be extended with abstract class define or should must contain
the abstract method of the super class
all extended class should either be declared abstract or contain all the abstract classes
of the super class
separate extended abstract class may or may not contain its super class abstract methods
so we can implement our own methods there
 */
class child extends Base{
    @Override
    public void greet(){
        System.out.println("Hello child");
        System.out.println("Good morning");
    }
}
abstract class child2 extends Base{
    public void greet(){
        System.out.println("Namaste Beta");
    }
}
public class abstract_class_method {
    public static void main(String[] args) {

        //simply object of abstract class cannot be created
        //child ch = new Base();//this will throw error as abstract class base object cannot be created
        //child2 ch2 = new child2(); //this will also throw error
        child ch1 = new child();
        ch1.greet();
    }
}
