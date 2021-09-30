package com.company;

class mainBase{
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public mainBase(){
      x = 7;
    }
}

class derived extends mainBase{
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public derived(){
        System.out.println("This is derived class from mainBase class using extends keyword and inheritance technique");
    }
}
public class inheritance {
    public static void main(String[] args) {

        //Inheritance is the borrowing the codes from written content
        //using the previously written codes rather than repeating the same codes

        //Accessing functionality of mainBase
        mainBase mb = new mainBase();
//        mb.setX(8);
        System.out.println(mb.getX());


        //we cannot access the derived content from the mainBase class
//        mb.setY(7);  -->this will throw errors in the program

        //making derived object and using the functionality
        derived dd = new derived();
//        dd.setY(90);
        System.out.println();

        //from derived class we can access the variable of functions of the mainBase class
        dd.setX(79);
        System.out.println(dd.getX());


    }
}
