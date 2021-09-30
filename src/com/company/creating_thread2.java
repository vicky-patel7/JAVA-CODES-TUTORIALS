package com.company;
/*
Creating thread by implementing runnable interface of java
 */
class MyThreadRunnable implements Runnable{
    public void run() {
        int i = 0;
        while (i < 200) {
            System.out.println("I am a thread and not threat");
            i++;
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        int i = 0;
        while(i<200){
        System.out.println("I am a thread2 and definitely not threat");
        i++;
       }
    }
}
public class creating_thread2 {
    public static void main(String[] args) {
        MyThreadRunnable t1 = new MyThreadRunnable();
        Thread f1 = new Thread(t1);
        MyThreadRunnable2 t2 =new MyThreadRunnable2();
        Thread f2 = new Thread(t2);
        f1.start();
        f2.start();

    }
}
