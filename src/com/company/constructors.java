package com.company;

class MyMainEmployee {
    private int id;
    private String name;
    int salary;

    public MyMainEmployee() {  //this is constructor
        //constructor is a method having same name as class
        //this is envoked automatically
        //we can overload this constructor too
        id = 34;
        name = "Your-Name-Here";
        salary = 10000;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void setId(int n) {
        id = n;
    }

    public void setSalary(int s) {
        salary = s;
    }

    public int getSalary() {
        return salary;
    }
}

public class constructors {
    public static void main(String[] args) {
        MyMainEmployee ravi = new MyMainEmployee();//we can even pass argument here means we can use this as function or method
        //ravi.setId(878);
        //ravi.setName("Ravi Bansal");
        System.out.println(ravi.getId());
        System.out.println(ravi.getName());
        System.out.println(ravi.getSalary());
    }
}
