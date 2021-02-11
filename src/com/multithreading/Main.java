package com.multithreading;


/**
 * Testing multithreading
 * @author Harerimana Egide
 * @since 2021-02-11
 */
public class Main {

    public static void main(String[] args) {
        ExtendThread thread = null;

        thread = new ExtendThread(20, "A");
        thread.start();

        thread = new ExtendThread(16, "B");
        thread.start();
    }
}
