package com.company;
class MyThr2 extends Thread{
    public MyThr2(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while(i<10000){
            System.out.println(this.getId()+ " I am thread "+ this.getName());
            i++;
        }
    }
}
public class thread_priorities {
    public static void main(String[] args) {
        MyThr2 t1 = new MyThr2("Google");
        MyThr2 t2 = new MyThr2("Yahoo");
        MyThr2 t3 = new MyThr2("Bing");
        MyThr2 t4 = new MyThr2("Baidu");
        MyThr2 t5 = new MyThr2("Ask.com(Most Important)");
        MyThr2 t6 = new MyThr2("DuckDuckDo");
        t5.setPriority(Thread.MAX_PRIORITY);  //value is 10
        t2.setPriority(Thread.MIN_PRIORITY); //value is 5
        t3.setPriority(Thread.MIN_PRIORITY); //value is 1
        t6.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}