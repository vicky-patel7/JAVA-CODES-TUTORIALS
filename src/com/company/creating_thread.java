package com.company;
/*
This is example of creating multithreading with the help of extending the thread class of
java
 */
class MyThread extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<100) {
            System.out.println("my cooking thread is running.");
            System.out.println("I am happy!!");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<100) {
            System.out.println("Thread two for chatting with her.");
            System.out.println("I am sad!");
            i++;
        }
    }
}

public class creating_thread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
