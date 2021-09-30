package com.company;

/*
Creating custom class in java.
We create this class out of main class which is of the name of the title of the file
 */
class Employee {
    int id;
    int salary;
    String name;

    public void printdetails() {
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
    }

    public int getSalary() {
        return salary;
    }
}

public class custom_class {

    public static void main(String[] args) {
        Employee ravi = new Employee(); //making an object or instantiating a new Employee Object
        Employee shyam = new Employee();
        //Setting attributes to the object
        ravi.id = 726;
        ravi.name = "Ravi Gupta";
        ravi.salary = 20;
        shyam.id = 562;
        shyam.name = "Shyam Suryavansi";
        shyam.salary = 32;
        //Printing details of the Object
        System.out.println(ravi.id);
        System.out.println(ravi.name);
        System.out.println(shyam.id);
        System.out.println(shyam.name);

        //Printing details with custom class function
        ravi.printdetails();
        shyam.printdetails();
        int salary = ravi.getSalary();
        System.out.println(salary);
    }
}
