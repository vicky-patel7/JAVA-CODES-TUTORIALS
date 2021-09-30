package com.company;

interface Camera{
    void takesnap();
    void recordVide();
    default void record4kvideo(){
        System.out.println("Record in 4k");
    }
}
interface WiFi {
    String[] getNetwork();
    void connectToNetwork(String network);
}
class MyCellphone{
    void callnumber(int phnumb){
        System.out.println("Calling "+ phnumb);
    }
    void pickCall(){
        System.out.println("Connecting to... ");
    }
}
class MySmartphone extends MyCellphone implements Camera, WiFi{
    public void takesnap(){
        System.out.println("Taking snap ");
    }
    public void recordVide(){
        System.out.println("Recording the video..");
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to the network...");
    }
    public String[] getNetwork(){
        System.out.println("Getting networks list..");
        String[] networkList = {"Airtel", "Jio", "Vi"};
        return networkList;
    }
}
public class defaults_methods {
    public static void main(String[] args) {
        MySmartphone sm = new MySmartphone();
        String[] ar = sm.getNetwork();
        for (String item: ar) {
            System.out.println(item);
        }

    }
}
