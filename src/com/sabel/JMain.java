package com.sabel;

public class JMain {

    public static void main(String[] args) {

        Thread hip = new Hip("Hip", 1000);
        hip.start();
        Hop hop = new Hop("Hop", 3123);
        Thread hopThread = new Thread(hop, "Hop Thread");
        System.out.println(hopThread.getName());
        System.out.println(hopThread.getPriority());
        hip.setName("Hip Thread");
        hip.setPriority(6);
        System.out.println(hip.getName());
        System.out.println(hip.getPriority());
        hopThread.start();




    } // END main

} // END Clas JMain

