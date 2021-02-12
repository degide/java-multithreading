package com.multithreading;


/**
 * Testing multithreading
 * @author Harerimana Egide
 * @since 2021-02-11
 */
public class Main {

    public static void main(String[] args) {

        /* By extending thread

        ExtendThread thread = null;
        thread = new ExtendThread(20, "A");
        thread.start();
        thread = new ExtendThread(16, "B");
        thread.start();

        */

        /* By implementing runnable */
        ImplementRunnable runnableThread = new ImplementRunnable(5, "A");
        runnableThread.start();
        runnableThread = new ImplementRunnable(4, "B");
        runnableThread.start();

    }
}
