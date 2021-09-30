package com.company;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while(i<100){
            System.out.println("I am thread");
            i++;
        }
    }
}
public class constructors_from_threads {
    public static void main(String[] args) {
        MyThr t = new MyThr("Google");
        MyThr t2 = new MyThr("yahoo");
        t.start();
        t2.start();
        System.out.println("The id is of the t is "+ t.getId());
        System.out.println("The name of the thread t is "+ t.getName());
        System.out.println("The id is of the t2 is "+ t2.getId());
        System.out.println("The name of the thread t2 is "+ t2.getName());
    }
}
