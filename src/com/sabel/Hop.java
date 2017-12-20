package com.sabel;

public class Hop implements Runnable {

    //DATA FIELDS
    private String text;
    private int delay;

    // CONSTRUCTOR
    public Hop(String text, int delay) {
        this.text = text;
        this.delay = delay;
    } // END CONSTRUCTOR

    @Override
    public void run() {
        while (true) {
            System.out.println(text);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
            } // END TRY-CATCH
        } // END WHILE
    } // END Override

} // END CLASS Hop
