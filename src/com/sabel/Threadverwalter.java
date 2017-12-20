package com.sabel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Threadverwalter implements Runnable {

    // DATA FIELDS
    private Thread thread = null;
    private int counter = 0;


    // DEFAULT CONSTRUCTOR
    public Threadverwalter() {
    } // END DEFAULT CONSTRUCTOR

    // METHODS
    public void startThread() {
        if (this.thread == null) {
            System.out.println("Ein Neuer Thread wurde gestartet");
            this.thread = new Thread(this, "Start Thread Number " + ++counter);
            this.thread.start();
        } // END IF
    } // END public void start()

    public void stopThread() {
        if (this.thread != null) {
            thread.interrupt();
        } // END IF
        this.thread = null;
    } // END public void stop()

    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                break;
            } // END TRY-CATCH
        } // END WHILE
        System.out.println("Der Thread wurde gestoppt");
    } // END Override


    public static void main(String[] args) {
        Threadverwalter threadverwalter = new Threadverwalter();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;

        while (true) {
            System.out.println("Neuer Thread = n / Thread beenden = b / Quit = q");
            try {
                line = bufferedReader.readLine();
                switch (line.toLowerCase()) {
                    case "n":
                        threadverwalter.startThread();
                        break;
                    case "b":
                        threadverwalter.stopThread();
                        break;
                    case "q":
                        threadverwalter.stopThread();
                        System.out.println("Programm wird beendet");
                        //System.exit(0);
                        return;
                } // END SWITCH
            } catch (IOException e) {
                e.printStackTrace();
            } // END TRY-CATCH
        } // END WHILE

    } // END MAIN

} // END CLASS Threadverwalter
