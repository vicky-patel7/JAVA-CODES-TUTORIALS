package com.company;

class C1 {
    public int x1 = 5;
    protected int y = 10;
    int z = 29; //thi is default
    private int x2 = 89;
    public void meth1(){
        System.out.println("Hello wold!");
        //in same class we can access all type of modifiers
        System.out.println(x2);
    }
}
public class access_modifier {
    public static void main(String[] args) {
        C1 c = new C1();
        c.meth1();
        System.out.println(c.x1);
        //System.out.println(c.x2);//bcz of private modifier we cannot use outside the class
        System.out.println(c.y);
        System.out.println(c.z);
    }
}


/*
    Any modifier type can be accessed in the same class
    Private modifiers cannot be accessed in same packages
    default and private access modifiers cannot be accessed in the subclass
    only public access modifier can be accessed from anywhere in program codes
 */