package com.company;

class eKlass{
    int a;
    eKlass(int v){
//        a = v;
        //above line is same as
        this.a = v;
//        System.out.println(a);
    }

    public int getA() {
        return a;
    }

    public int reutnOne(){
        return 1;
    }
}
class dKlass extends eKlass{
    dKlass(int c){
        super(c); //used to invoke the desired method of the parent class
        System.out.println("I am a derived constructor");
    }
}
public class this_super_keyword {
    public static void main(String[] args) {
        eKlass ek = new eKlass(3);
        System.out.println(ek.getA());

        dKlass dk = new dKlass(3);


    }
}
